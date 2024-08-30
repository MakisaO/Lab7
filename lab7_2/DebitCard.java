package lab7_2;

public class DebitCard extends Card{
	
	public  String type() {
		return "Visa";
	}
	
	 public  double discount() {
		 return 2.5;
	 }
	 public boolean withdraw(double amount) {
		 return true;
	 }
}
