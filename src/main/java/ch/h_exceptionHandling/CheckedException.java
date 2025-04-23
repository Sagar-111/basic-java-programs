package ch.h_exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		readFile("C:\\Users\\sgrch\\OneDrive\\Desktop\\coll.jpg");
		
	}

	private static void readFile(String path) throws IOException{
		FileReader fr=new FileReader(path);		
		fr.close();
	}
}
