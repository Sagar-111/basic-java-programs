package ch.h_exceptionHandling;

public class CustomeException {

	public static void main(String[] args) throws AgeLessThanZeroException {

		validateAge(-6);

	}

	private static void validateAge(int age) throws AgeLessThanZeroException {
		if(age < 0) {
//			throw new AgeLessThanZeroException();For default constructor method.
//			throw new AgeLessThanZeroException("Age cannot be negative"); For constructor which takes string as parameter.
//			throw new AgeLessThanZeroException(new RuntimeException());For Argument of Throwable class.
			throw new AgeLessThanZeroException("Age cannot be negative", new IllegalArgumentException());
			
			
		}
		
	}

}
