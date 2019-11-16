package SetupR;

import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import UtilR.ConfigPropertiesR;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestSetupR {
	
	 // To create Request
	public static RequestSpecification requestSpecs;

	// To store response
	public static Response response;
	
	//JsonPath 
	public static JsonPath  responseJson;
	
    // Owner API
	public static ConfigPropertiesR configProperty;
	
	//Logger
	public static Logger log;
	
	public static void setup() {

		//Load logger file
		//LOG4J PROPERTY FILE LOAD
		//log=Logger.getLogger("Practise");
		log = Logger.getLogger("Reqres_API");
		PropertyConfigurator.configure("./src/test/PropertFileR/log4j.properties");
		
		
		// Owner API Config Property
		configProperty = ConfigFactory.create(ConfigPropertiesR.class);

		// Keep Base URI and Base Path
		//RestAssured.baseURI = configProperty.getBaseURI();
	  //  RestAssured.basePath = configProperty.getBasePath();
		
	}
	
	

}
