import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper

// Kirim request GET LIST USER
def response = WS.sendRequest(findTestObject('Object Repository/users/GET_List_User_PageOne'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 200)

// Parse response body
def json = new JsonSlurper().parseText(response.getResponseBodyContent())

// Verifikasi bahwa page tidak kosong
assert json.page != null

//verifikasi Body Response dan benar berada di page 1
WS.verifyElementPropertyValue(response, 'page', 1)
WS.verifyElementPropertyValue(response, 'per_page', 6)
WS.verifyElementPropertyValue(response, 'total', 12)
WS.verifyElementPropertyValue(response, 'total_pages', 2)

//marking: PASSED
KeywordUtil.markPassed("User berhasil mengakses halaman list user page one")