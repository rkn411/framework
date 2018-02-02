package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class ConfigFileUtility {
	File src;
	FileInputStream fis;
	Properties prop;
	public void loadPropertyFile() throws Exception {
		src = new File("./ConfigurationSetUp/Config.properties");
		fis = new FileInputStream(src);
		prop = new Properties();
		prop.load(fis);
	}
	public String getProperty(String propKey) {
		return prop.getProperty(propKey);
	}
}