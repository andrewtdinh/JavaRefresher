
public class Dog {
	
	String name = "Jacky";
	String breed = "BullDog";
	int height = 4;
	
	public void barking() {
		System.out.println(name + " is barking.");
	}
	
	public void eating() {
		System.out.println(name + " is eating.");
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		System.out.println(dog1.name);
		
		Dog dog2 = new Dog();
		dog2.name = "Lucky";
		dog2.barking();

	}

}
