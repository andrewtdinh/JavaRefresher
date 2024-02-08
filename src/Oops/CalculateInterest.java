package Oops;

public class CalculateInterest {

	public static void main(String[] args) {
		AmericanExpress am = new AmericanExpress();
		BankOfAmerica ba = new BankOfAmerica();
		ICICBank icic = new ICICBank();
		
		System.out.println(am.getInterest());
		System.out.println(ba.getInterest());
		System.out.println(icic.getInterest());
	}

}
