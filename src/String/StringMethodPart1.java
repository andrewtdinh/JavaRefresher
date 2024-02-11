package String;

public class StringMethodPart1 {

	public static void main(String[] args) {
		
		String text = "Learning is the key to easybiz.com";
//		char ch = text.charAt(12);
//		
//		System.out.println(text.charAt(10));
//		System.out.println(ch);
		
//		String text2 = text.concat(" to success").concat(", and we are learning Java!");
//		System.out.println(text2);
		
		System.out.println(text.contains("is the"));
		System.out.println("Message ending with .com: " + text.endsWith(".com"));
	}

}
