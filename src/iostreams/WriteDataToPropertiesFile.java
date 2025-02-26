package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteDataToPropertiesFile {

	public static void main(String[] args) throws Exception {

		File file1 = new File(System.getProperty("user.dir")+"\\Files\\TestData.properties");
		FileInputStream fis = new FileInputStream(file1);

		Properties testDataProperties = new Properties();
		testDataProperties.load(fis);

		testDataProperties.setProperty("location", "Hyderabad");

		FileOutputStream fos = new FileOutputStream(file1);

		testDataProperties.store(fos, "Updated by Raju Chelle");

	}

}
