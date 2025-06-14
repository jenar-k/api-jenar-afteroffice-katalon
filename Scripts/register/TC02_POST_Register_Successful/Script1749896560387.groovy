import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper

// Kirim request POST register
def response = WS.sendRequest(findTestObject('Object Repository/register/POST_Register_Successful'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 200)

// Parse response body
def json = new JsonSlurper().parseText(response.getResponseBodyContent())

// Verifikasi bahwa id dan token ada
assert json.id != null
assert json.token != null

//verifikasi bahwa id nya adalah 4 dan memiliki token
WS.verifyElementPropertyValue(response, 'id', 4)
WS.verifyElementPropertyValue(response, 'token', 'QpwL5tke4Pnpja7X4')

//marking: PASSED
KeywordUtil.markPassed("Register berhasil dan mengirimkan ID dan Token")