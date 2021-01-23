package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	Config con = new Config();
	
	// String PropertyFilePath = con.propertyFilePath;
	// String TestDataFilePath = con.testDateFilePath;
	
	Properties prop = new Properties();
	InputStream input = null;
	
	
	public Properties ReadProperty(String path)
	{
		try {
			if(path.contains("propertyfile")) {
				input = new FileInputStream(new File(con.propertyFilePath));
			}
			else if(path.contains("testdatafile"))
			{
				input = new FileInputStream(new File(con.testDataFilePath));
			}
			else if(path.contains("assertdatafile"))
			{
				input = new FileInputStream(new File(con.assertDataFilePath));
			}
			else {
				System.out.println("Problem getting in file path ...!!!");
			}

         // load a properties file
        prop.load(input);


    } catch (Exception ex) {
        ex.printStackTrace();
    }
	return prop;


	
	}
}
