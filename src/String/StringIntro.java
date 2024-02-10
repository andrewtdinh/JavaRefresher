package String;

public class StringIntro {

	public static void main(String[] args) {
		// name and name2 point to the same string literal
		String name = "Andrew Dinh";
		String name1 = "Andrew Dinh";
		String name2 = "andrew dinh";
		
		// country and country1 are different objects even though the strings are the same.
		String country = new String("United States");
		String country1 = new String("United States");
		
//		System.out.println(name);
//		System.out.println(country);
//		
//		System.out.println(name.equals(name1));
//		System.out.println(name.equals(name2));
//		System.out.println(name.equalsIgnoreCase(name2));
//		
//		System.out.println(country.equals(country1));
		
		System.out.println(name == name1);
		System.out.println(name == name2);
		System.out.println(country == country1);
	}

}
