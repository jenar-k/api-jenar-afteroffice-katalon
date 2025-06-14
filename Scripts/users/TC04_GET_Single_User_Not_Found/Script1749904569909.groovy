import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper

// Kirim request GET SINGLE USER
def response = WS.sendRequest(findTestObject('Object Repository/users/GET_Single_User_Not_Found'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 404)

// Parse response body
def json = new JsonSlurper().parseText(response.getResponseBodyContent())

//marking: PASSED
KeywordUtil.markPassed("User berhasil tidak menemukan data user ID 23")