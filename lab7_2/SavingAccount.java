package lab7_2;

public class SavingAccount extends BaseAccount {
	private double money =0;
	private FixedSalary b;
	public SavingAccount (FixedSalary a) {
		b=a;
	}
	public  boolean deposit(double amount) {
		money += amount;
		return true;
		
	}
	public boolean withdraw(double amount) {
		return true;
	}
}
