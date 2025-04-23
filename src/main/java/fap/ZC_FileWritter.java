package fap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ZC_FileWritter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:/Users/sgrch/OneDrive/Desktop/NewText.txt");
		
//		If you want to write to the file without overriding the previous content use following Constructor of the FileWriter class.
//		FileWriter fw = new FileWriter("C://Users/sgrch/OneDrive/Desktop/NewText.txt", true);	if you want to keep previously written line as it is.
		
		BufferedWriter bw = new BufferedWriter(fw);

        // Append new lines to the file
		bw.write("hi hello how are you");
		bw.write("go to heaven");
		bw.write("how are you now");

		bw.close();

	}

}
