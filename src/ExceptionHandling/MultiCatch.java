package ExceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			int value = 100;
			int result = value / 0;
		} catch (ArithmeticException e) {
			System.out.println("Catch specific exception");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Catch generic exception");
		}

	}

}
