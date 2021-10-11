package ReadWriteFile;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {

	public static void main(String[] args) {
		try {
			FileReader read = new FileReader("readwriteFile.txt");
			int check;

			while ((check = read.read()) != -1) {
				System.out.print((char) check);
			}
			read.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
