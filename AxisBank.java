package week3.day2.assignments;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		
		System.out.println("The AxisBank Deposit");

	}

	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank();
		
		ab.deposit();
		
		BankInfo bi = new BankInfo();
		
		bi.deposit();
		bi.fixed();
		bi.saving();

	}

}
