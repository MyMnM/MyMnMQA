package helpers;

import static org.testng.Assert.fail;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import helpers.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


/**
 * @author vibhav.gupta
 *
 */
public class Common {

	public static RequestSpecification httpRequest;
	public static ResponseSpecification httpResponse;
	public static List<Header> list = new ArrayList<Header>();
	

	public static RequestSpecification postData(String baseURI, String HeaderKey, String Headervalue, String body) {
		
		RestAssured.baseURI = baseURI;
		httpRequest = RestAssured.given();
		httpRequest.header(HeaderKey, Headervalue);
		if(!("".equals(body)))
		{
		httpRequest.body(body);
		}
		return httpRequest;
	}
	
	
public static RequestSpecification GetData(String baseURI, String HeaderKey, String Headervalue) {
		
		RestAssured.baseURI = baseURI;
		httpRequest = RestAssured.given();
		httpRequest.header(HeaderKey, Headervalue);
		return httpRequest;
	}
	
	
public static RequestSpecification DeleteData(String baseURI, String HeaderKey, String Headervalue) {
		
		RestAssured.baseURI = baseURI;
		httpRequest = RestAssured.given();
		httpRequest.header(HeaderKey, Headervalue);
		return httpRequest;
	}
	
	
	public static void ResponseData(Response response,List<String> responseParam){
	
		JsonPath js=response.jsonPath();
		int StatusCode = response.getStatusCode();
		if(StatusCode==200)
		{
		for(String param:responseParam)
		{
			String paramValue=js.get(param);
			System.out.println("value of"+param+"is"+paramValue);
		}
		}
		else
		{
			System.out.println("status code is"+StatusCode);
			
		}
	
		
		
	}
	
	public static Headers createRequestHeader(List<String>Key,List<String>Value)
	{
		System.out.println(Key.size()); 
		for(int i=0;i<Key.size();i++)
		{
			Header header=new Header(Key.get(i),Value.get(i));
			list.add(header);
			
		}
		/*Header h1 = new Header(Key.get(0), "ytxa9ppawphwyzraxqrn3uxg");
		Header h2 = new Header("Authorization", bearer);
		Header h3 = new Header("Content-Type", "application/json");
		List<Header> list = new ArrayList<Header>();
		list.add(h1);
		list.add(h2);
		list.add(h3);*/
		Headers headers = new Headers(list);
		return headers;
	}
	
	
/*	public static void DeleteResponseData(Response data,String param){
		JsonPath js=data.jsonPath();
		String linkstatus=js.get(param);
		int StatusCode = data.getStatusCode();
		
		
		
	}
	
	
	public static void GetLinkAgainstlinkUUID(String keyvalue,String token, String link) {
		String apiURL = ConfigReader.getValue("LinkURL");		
//		apiURL += "/lis/1.0.0/link/" + link;
		try {
			URL obj = new URL(apiURL);
			HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
			con.setRequestProperty("Authorization",  keyvalue+token);
			int responseCode = con.getResponseCode();
			if (responseCode == 200) {
				System.out.println(link + "   link details");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteLinkAgainstlinkUUID(String token, String link) {
		String apiURL = ConfigReader.getValue("LinkURL");		
		apiURL += "/lis/1.0.0/link/" + link;
		try {
			URL obj = new URL(apiURL);
			HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
			con.setRequestMethod("DELETE");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
			con.setRequestProperty("Authorization",  token);
			int responseCode = con.getResponseCode();
			if (responseCode == 200) {
				System.out.println(link + "    deleted successfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	*/
}
