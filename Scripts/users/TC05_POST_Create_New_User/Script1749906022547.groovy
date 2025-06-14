import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper

// Kirim request POST CREATE A NEW USER
def response = WS.sendRequest(findTestObject('Object Repository/users/POST_Create_New_User'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 201)

// Parse response body
def json = new JsonSlurper().parseText(response.getResponseBodyContent())

// Verifikasi bahwa page tidak kosong
assert json.name != null
assert json.job != null
assert json.id != null
assert json.createdAt != null

//verifikasi Body Response dan benar ter-create data user dengan name:Morpheus dan job:leader
WS.verifyElementPropertyValue(response, 'name', 'morpheus')
WS.verifyElementPropertyValue(response, 'job', 'leader')

//marking: PASSED
KeywordUtil.markPassed("User berhasil membuat user baru dengan name:Morpheus dan job:leader")