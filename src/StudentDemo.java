
public class StudentDemo {
	int rollNumber;
	String name;
	String Standard;
	
	public StudentDemo(int rollNumber, String name, String Standard) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.Standard = Standard;
	}
	
	public void display() {
		System.out.println("Student Roll Number: " + rollNumber + " name is: " + name + " and in class: " + Standard);
	}

	public static void main(String[] args) {
		StudentDemo stda = new StudentDemo(13, "Andrew", "2nd");
		StudentDemo stdb = new StudentDemo(14, "Jeff", "3rd");
		stda.display();
		stdb.display();
	}

}
