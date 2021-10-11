package ReadWriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

	public static void main(String args[]) throws IOException {
		
			FileWriter write = new FileWriter("readwriteFile.txt", true);
			write.write("\n");
			write.write("I'm here to represent my code Output");
			write.write("\n");
	         write.write("Is it okay?");
			write.close();
			
	}
}