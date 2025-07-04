import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper

// Kirim request POST register
def response = WS.sendRequest(findTestObject('Object Repository/register/POST_Register_Unsuccessful'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 400)

// Parse response body
def json = new JsonSlurper().parseText(response.getResponseBodyContent())

// Verifikasi bahwa id dan token ada
assert json.error != null

//verifikasi bahwa Response Body menampilkan error message
WS.verifyElementPropertyValue(response, 'error', 'Missing password')

//marking: PASSED
KeywordUtil.markPassed("Register Gagal Karena tidak ada password")