package lab7_2;

public class DebitCard extends Card{
	private String cardnumber;
	
	 DebitCard (String ssn){
		cardnumber = ssn;
	}
	public  String type() {
		return "Visa";
	}
	public String getCard() {
		return cardnumber;
	}
	 public  double discount() {
		 return 2.5;
	 }
	 public boolean withdraw(double amount) {
		 return true;
	 }
}
