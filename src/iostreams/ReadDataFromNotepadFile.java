package iostreams;

import java.io.File;
import java.io.FileInputStream;

public class ReadDataFromNotepadFile {

	public static void main(String[] args) throws Exception {

		File file1 = new File(System.getProperty("user.dir")+"\\Files\\InputFile.txt");
		FileInputStream fis = new FileInputStream(file1);
		System.out.println(fis.available());
		byte[] byteArr = new byte[fis.available()];
		fis.read(byteArr);

		System.out.println(byteArr.length);

		String inputData = new String(byteArr);
		System.out.println(inputData);
	}

}
