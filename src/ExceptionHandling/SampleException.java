package ExceptionHandling;

public class SampleException {

	public static void main(String[] args) {
		try {
			int value = 100;
			int result = value/0;

			System.out.println(result);
		} catch(Exception e) {
			System.out.println("Cannot divide by zero.");
			
			e.printStackTrace();
		}
		
		String text = null;
		
		System.out.println(text.length());
	}

}
