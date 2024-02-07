
public class StudentDemo {
	int rollNumber;
	String name;
	String Standard;
	
	public StudentDemo(int i, String n, String s) {
		rollNumber = i;
		name = n;
		Standard = s;
	}
	
	public void display() {
		System.out.println("Student Roll Number: " + rollNumber + " name is: " + name + " and in class: " + Standard);
	}

	public static void main(String[] args) {
		StudentDemo stda = new StudentDemo(13, "Andrew", "Algebra");
		StudentDemo stdb = new StudentDemo(14, "Jeff", "Geomet");
		stda.display();
		stdb.display();
	}

}
