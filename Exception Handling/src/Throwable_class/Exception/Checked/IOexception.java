package Throwable_class.Exception.Checked;

import java.io.File;
import java.io.IOException;

public class IOexception {

	public static void main(String[] args) {
		File fileName = new File("ram.txt"); // ram is user defined file
		if (fileName.exists()) {
			try {
				fileName.createNewFile();
			} catch (IOException e) { // IO Exception if file not exist at its defined Path
				System.out.println(e);
				System.out.println("File not found Exception");
			}
		}
		else
		{
			System.out.println("File Exist already.....");
		}
	}

}
