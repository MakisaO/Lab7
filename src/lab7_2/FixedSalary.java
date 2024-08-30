package lab7_2;

public class FixedSalary extends Employees {
	private double saraly;
	private Card card;
	public FixedSalary(String first, String last, String ssn,double saraly) {
		super(first, last, ssn);
		this.saraly = saraly;
		  this.card = new DebitCard(ssn); 
	}

	public  double earnings() {
		return saraly;
	}
	 public Card getCard() {
		 return card;
	    }
	public String toString() {
		return String.format("Fixed salary employee: %s %s\nsocial security number: %s \nmontly salary:%.2f",firstName, lastName,securityNumber,saraly); 
		}
}
