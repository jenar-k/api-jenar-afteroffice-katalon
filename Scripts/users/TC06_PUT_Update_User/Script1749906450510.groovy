import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper

// Kirim request PUT UPDATE A USER
def response = WS.sendRequest(findTestObject('Object Repository/users/PUT_Update_User'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 200)

// Parse response body
def json = new JsonSlurper().parseText(response.getResponseBodyContent())

// Verifikasi bahwa page tidak kosong
assert json.name != null
assert json.job != null
assert json.updatedAt != null

//verifikasi Body Response dan benar terupdate dengan name:Morpheus dan job:zion resident
WS.verifyElementPropertyValue(response, 'name', 'morpheus')
WS.verifyElementPropertyValue(response, 'job', 'zion resident')

//marking: PASSED
KeywordUtil.markPassed("User berhasil update user serta diubah menjadi name:Morpheus dan job:zion resident")