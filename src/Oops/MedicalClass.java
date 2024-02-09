package Oops;

public class MedicalClass implements Student {

	public void displayName() {
		System.out.println("Hi, we are from Medical Dept");
		
	}


	public void getStudentNumber() {
		System.out.println("We are 120");
		
	}


	public void getStandard() {
		System.out.println("We are from MBBS");
		
	}
	
	public void getUniversity() {
		System.out.println("University name is London University");
	}

	public static void main(String[] args) {
		EngineeringClass eng = new EngineeringClass();
		MedicalClass med = new MedicalClass();
		
		eng.displayName();
		eng.getStandard();
		eng.getStudentNumber();
		eng.getUniversity();
	}
}


