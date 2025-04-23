package ch.k_javaUtilClasses;

import java.sql.Timestamp;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
	
		System.out.println("ts "+ts);
		
		Timestamp ts1 = new Timestamp(date.getTime());
		
		System.out.println("ts1 "+ts1);
	}
}
