package StepDefnitionsR;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import com.fasterxml.jackson.databind.ObjectMapper;

import Pojo.CreateUserProfile;
import SetupR.TestSetupR;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUser extends TestSetupR {

	public static CreateUserProfile up;

	@When("I have JSON")
	public void i_have_JSON() throws IOException {

		// Read JSON File
		byte[] jsonData = Files.readAllBytes(
				Paths.get("C:\\Users\\nandeesh.cl\\Desktop\\Framework\\Reqres\\src\\test\\Json\\createUser.json"));

		// Create object for ObjectMapper class
		ObjectMapper mapper = new ObjectMapper();

		// for user profile class(Parent POJO Class) we are creating object
		up = mapper.readValue(jsonData, CreateUserProfile.class);

		requestSpecs = given().contentType(ContentType.JSON).body(up);
		
		/*requestSpecs=given().contentType(ContentType.JSON).body(
				new File("C:\\Users\\nandeesh.cl\\Desktop\\Framework\\Reqres\\src\\test\\Json\\createUser.json"));*/
		
		log.info("Json body");
	}

	@And("I send Post request")
	public void i_send_Post_request() {

		response = requestSpecs.post("https://reqres.in/api/users");
		response.prettyPrint();
		log.info("Post request sent successfully");
	}

	@Then("response consists name {string} and job {string}")
	public void response_consists_name_and_job(String name, String job) {
		Assert.assertEquals(up.getName(), response.jsonPath().getString("name"));
		log.info("Name field "+name+" verified successfully");
		Assert.assertEquals(up.getJob(), response.jsonPath().getString("job"));
		log.info("Job field "+job+" verified successfully");
	}

}
