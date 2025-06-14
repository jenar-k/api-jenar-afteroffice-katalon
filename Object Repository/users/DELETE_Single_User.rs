<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>DELETE_Single_User</name>
   <tag></tag>
   <elementGuidId>dd5fa1bd-dd2e-4f13-b0b2-758af2cb8afe</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>1d40ebf6-1f2d-478b-a2af-8f6559bc7792</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>x-api-key</name>
      <type>Main</type>
      <value>reqres-free-v1</value>
      <webElementGuid>7ea93ae1-5d3a-4b48-870a-e40143995ef1</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>10.2.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>DELETE</restRequestMethod>
   <restUrl>https://reqres.in/api/users/2</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*&#xd;
&#xd;
import com.kms.katalon.core.testobject.RequestObject&#xd;
import com.kms.katalon.core.testobject.ResponseObject&#xd;
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS&#xd;
import com.kms.katalon.core.webservice.verification.WSResponseManager&#xd;
&#xd;
import groovy.json.JsonSlurper&#xd;
import internal.GlobalVariable as GlobalVariable&#xd;
&#xd;
RequestObject request = WSResponseManager.getInstance().getCurrentRequest()&#xd;
&#xd;
ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()&#xd;
&#xd;
WS.verifyResponseStatusCode(response, 204)&#xd;
&#xd;
assertThat(response.getStatusCode()).isEqualTo(204)&#xd;
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
