
public class Student {
	public Student() {
		System.out.println("Hi, I am inside of the constructor");
	}
	
	int rollNumber;
	String name;
	
	public Student(int i, String n) {
		rollNumber = i;
		name = n;
	}
	
	public void display() {
		System.out.println("Roll number is: " + rollNumber + " and Name is :" + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		
		Student stda = new Student(24, "Andrew");
		Student stdb = new Student(13, "Hanna");
		
		std.display();
		stda.display();
		stdb.display();
	}

}
