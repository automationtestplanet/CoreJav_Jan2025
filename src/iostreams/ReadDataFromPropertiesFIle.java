package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertiesFIle {

	public static void main(String[] args) throws Exception {
		File file1 = new File(System.getProperty("user.dir")+"\\Files\\TestData.properties");
		FileInputStream fis = new FileInputStream(file1);
		
		Properties testDataProperties = new Properties();
		testDataProperties.load(fis);
		
		
		System.out.println(testDataProperties.getProperty("name"));
		System.out.println(testDataProperties.getProperty("id"));
		System.out.println(testDataProperties.getProperty("qualification"));
		System.out.println(testDataProperties.getProperty("location"));
		
	}

}
