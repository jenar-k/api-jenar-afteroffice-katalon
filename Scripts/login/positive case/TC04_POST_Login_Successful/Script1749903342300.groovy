import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper

// Kirim request POST Login
def response = WS.sendRequest(findTestObject('Object Repository/login/POST_Login_Successful'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 200)

// Parse response body
def json = new JsonSlurper().parseText(response.getResponseBodyContent())

// Verifikasi bahwa body response mengirimkan token
assert json.token != null

//verifikasi bahwa user mendapatkan token
WS.verifyElementPropertyValue(response, 'token', 'QpwL5tke4Pnpja7X4')

//marking: PASSED
KeywordUtil.markPassed("Login  API berhasil dengan user eve.holt@reqres.in")