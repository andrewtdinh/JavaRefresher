package Oops;

public class ChildAddition extends Addition {

	public static void main(String[] args) {
		Addition add = new Addition();
		add.addValues(11, 11);
		add.addValues(11, 22, 33);
		add.addValues(32, 2);
		
		double d = add.addValues(11.23, 23.34);
		System.out.println(d);
	}

}
