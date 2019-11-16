package UtilR;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({
	"file:src/test/PropertyFile/ConfigR.properties"
})



public interface ConfigPropertiesR extends Config{
	
	@Key("baseURI")
	public String getBaseURI();
	
	@Key("basePath")
	public String getBasePath();
	
	@Key("ListUserEndPoint")
	public String ListUserEndPoint();
	
	

}
