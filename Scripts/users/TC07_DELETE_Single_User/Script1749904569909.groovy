import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper

// Kirim request DELETE SINGLE USER
def response = WS.sendRequest(findTestObject('Object Repository/users/DELETE_Single_User'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 204)

//marking: PASSED
KeywordUtil.markPassed("User berhasil menghapus data user ID 2")