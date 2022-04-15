package PostRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public class PostRequestTest {
	
	
	
	@Test
	public void postRequest() {
		
	    JSONObject obj = new JSONObject();
        obj.put("name", "Sumit");
        obj.put("age", 49);

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        obj.put("messages", list);

        
        given().contentType("application/json; charset=UTF-16").body(obj).post("http://localhost:3000/posts").then().statusCode(201);
		
		
	}
	
	@Test
	public void postOrder() throws FileNotFoundException, IOException, ParseException {
		
	    JSONObject obj1 = new JSONObject();
        obj1.put("clientName", "TestShop3");
        obj1.put("clientEmail", "TestShop3@gmail.com");
        
        Response response = given().contentType("application/json; charset=UTF-16").body(obj1).post("https://simple-tool-rental-api.glitch.me/api-clients").then().statusCode(201).and().extract().response();
        
		System.out.println(readMethod(response).get("accessToken"));
		
	    JSONObject obj = new JSONObject();
        obj.put("toolId", 2177);
        obj.put("customerName", "John Harry");
        
        
        given().header("Authorization", "Bearer " + readMethod(response).get("accessToken"))
                .contentType("application/json; charset=UTF-16").body(obj).post("https://simple-tool-rental-api.glitch.me/orders").then().statusCode(201);
		
	}

	
	public static JSONObject readMethod(Response response) throws FileNotFoundException, IOException, ParseException {
		
		JSONParser rowData = new JSONParser();
		
		JSONObject jsonObject = (JSONObject) rowData.parse(response.asString());
		
		jsonObject.get(jsonObject);
		
		return(jsonObject);
	} 

	

}
