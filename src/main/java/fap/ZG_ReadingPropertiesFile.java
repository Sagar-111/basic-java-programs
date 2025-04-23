package fap;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class ZG_ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		readOnApproach_1();
		readOnApproach_2();
	}

	private static void readOnApproach_2() throws IOException {
		Properties prop = new Properties();

		FileInputStream fi = new FileInputStream("C:/Users/sgrch/eclipse/workspace_For_Java/Basic_Java/src/fileToRead.properties");

		prop.load(fi);

		String firstName = prop.getProperty("firstName");
		String lastName = prop.getProperty("lastName");
		String phone = prop.getProperty("phone");
		String location = prop.getProperty("location");

		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Phone: " + phone);
		System.out.println("Location: " + location);

	}

	private static void readOnApproach_1() {

		ResourceBundle bundle = ResourceBundle.getBundle("fileToRead");

		String firstName = bundle.getString("firstName");
		String lastName = bundle.getString("lastName");
		String phone = bundle.getString("phone");
		String location = bundle.getString("location");

		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Phone: " + phone);
		System.out.println("Location: " + location);
	}
}
