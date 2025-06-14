import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper

// Kirim request GET SINGLE USER
def response = WS.sendRequest(findTestObject('Object Repository/users/GET_Single_User'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 200)

// Parse response body
def json = new JsonSlurper().parseText(response.getResponseBodyContent())

//verifikasi Body Response dan datanya benar
WS.verifyElementPropertyValue(response, 'data.id', 2)
WS.verifyElementPropertyValue(response, 'data.email', 'janet.weaver@reqres.in')
WS.verifyElementPropertyValue(response, 'data.first_name', 'Janet')
WS.verifyElementPropertyValue(response, 'data.last_name', 'Weaver')
WS.verifyElementPropertyValue(response, 'data.avatar', 'https://reqres.in/img/faces/2-image.jpg')
WS.verifyElementPropertyValue(response, 'support.url', 'https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral')
WS.verifyElementPropertyValue(response, 'support.text', 'Tired of writing endless social media content? Let Content Caddy generate it for you.')

//marking: PASSED
KeywordUtil.markPassed("User berhasil mengakses halaman single user data: Janet Weaver")