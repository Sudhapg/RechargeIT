package FileHandlerBlog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BlogFileWriter {
	
	public static void fileWriter(String bloglocation,String line,String uname) {
		System.out.println("inside filewriter");
		try {
			File file = new File(bloglocation);
			// instantiating the FileWriter class.
			//true is to append to the file and false is to overwrite the contents of the file
			FileWriter writer = new FileWriter(file,true);
			writer.write(uname+": "+line+"\n"); // writing to the file
			writer.close();
		}catch(IOException e) {
			System.out.println("File not found!");
		}
	}

}
