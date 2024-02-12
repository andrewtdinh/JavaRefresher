package String;

public class StringMethodPartIV {

	public static void main(String[] args) {
		
		String text = "United States";
		
//		System.out.println(text.substring(7));
//		System.out.println(text.substring(7, 12));
		
//		char[] charArray = text.toCharArray();
//		
//		System.out.println("Main string is " + text);
//		
//		for (int i = 0; i < charArray.length; i++) {
//			System.out.println(charArray[i]);
//		}
		
		String text1 = "My name is     ";
		String text2 = "         Andrew Dinh";
		
		System.out.println(text1 + text2);
		System.out.println(text1.trim() + text2);
		System.out.println(text1.trim() + text2.trim());
	}

}
