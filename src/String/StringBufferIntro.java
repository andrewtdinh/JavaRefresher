package String;

public class StringBufferIntro {

	public static void main(String[] args) {
		String name = "Andrew";
		name.concat(" Dinh");
		
//		System.out.println(name);
		
		StringBuffer name1 = new StringBuffer("Andrew");
//		name1.append(" Dinh");
//		name1.insert(4, "-Dinh");
//		name1.replace(3, 6, "Dinh");
//		name1.delete(3, 10);
		name1.reverse();
		
		System.out.println(name1);
	}

}
