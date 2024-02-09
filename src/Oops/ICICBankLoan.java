package Oops;

public class ICICBankLoan extends BankLoan {

	public static void main(String[] args) {
		BankLoan loan = new BankLoan();
		
		loan.setAge(200);
		loan.setName("Andrew Dinh");
		loan.setAmount(1000000);
		
		System.out.println("Name is: " + loan.getName());
		System.out.println("Age is: " + loan.getAge());
		System.out.println("Amount is: " + loan.getAmount());
	}

}
