package iostreams;

import java.io.File;
import java.io.FileOutputStream;

public class WriteDataTOExtrenalFile {

	public static void main(String[] args) throws Exception {
		File file1 = new File("C:\\Users\\RAJU CHELLE\\Desktop\\OutputFile.txt");
		FileOutputStream fos = new FileOutputStream(file1);
		
		String string1 = "Hello World";
		
		byte[] byteArr = string1.getBytes();

		fos.write(byteArr);
		fos.flush();
	}

}
