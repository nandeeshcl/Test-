package StepDefnitionsR;

import SetupR.TestSetupR;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.Assert;

public class ListUser extends TestSetupR {

	@When("I send Get request")
	public void i_send_Get_request() {
		/*
		 * HashMap<String,String> map=new HashMap<String, String>(); map.put("name",
		 * "app"); map.put("job","adad");
		 * 
		 * response=given().contentType(ContentType.JSON).body(map).post(
		 * "https://reqres.in/api/users");
		 * //response=requestSpecs.post("https://reqres.in/api/users");
		 * response.prettyPrint(); log.info("Test");
		 */

		response = given().get("https://reqres.in/api/users?page=2");
		//response.prettyPrint();
		log.info("get request sent successfully..");

	}

	@Then("I verify status code is {int}")
	public void i_verify_status_code_is(int sc) {
		
		Assert.assertEquals(sc,response.statusCode());
        log.info("Status code: "+sc+" verified successfully");
	}

	@And("email in response consists {string}")
	public void email_in_response_consists(String email) {

		Assert.assertEquals(response.jsonPath().getString("data.email[0]"),email);
		log.info("Email: "+email+" verified successfully");
	}

/*	@And("total number of id is {int}")
	public void total_number_of_id_is(int count) {
		
	   //	Assert.assertEquals(response.jsonPath().getString("data.mail").length(), count);
		log.info("Response consists "+response.jsonPath().getString("data.mail").length()+" verifeid ");

	}*/

}
