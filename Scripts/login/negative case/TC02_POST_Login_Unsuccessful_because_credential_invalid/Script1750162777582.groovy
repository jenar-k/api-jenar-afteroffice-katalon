import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper

// Kirim request POST Login
def response = WS.sendRequest(findTestObject('Object Repository/login/POST_Login_Unsuccessful_because_credential_invalid'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 400)

// Parse response body
def json = new JsonSlurper().parseText(response.getResponseBodyContent())

// Verifikasi bahwa id dan token ada
assert json.error != null

//verifikasi bahwa Response Body menampilkan error message
WS.verifyElementPropertyValue(response, 'error', 'user not found')

//marking: PASSED
KeywordUtil.markPassed("Register Gagal Karena credential invalid")