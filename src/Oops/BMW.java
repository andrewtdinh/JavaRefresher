package Oops;

public class BMW extends Car {
	BMW(){
		super();
		System.out.println("Calling BMW Constructor");
	}
	
	String name = "BMW ";
	
	public void setWheels() {
		
	}
	
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void run() {
		System.out.println("BMW is running");
		super.run();
	}
	
	public static void main(String[] args) {
		
//		Car car = new Car();
//		System.out.print(name);
//		car.run();
		
		BMW bmw = new BMW();
		bmw.getName();
		bmw.run();
	}

}
