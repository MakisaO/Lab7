package lab7_2;

public class main {

	public static void main(String[] args) {
		FixedSalary employeeA = new FixedSalary("Clark", "Kent", "555-999-5555", 15000.00);

			SavingAccount b = new SavingAccount(employeeA);

				b.deposit(1000);

				Milk p1 = new Milk(150);
				p1.setVolume(250);
				Sugar p2 = new Sugar(50);
				p2.setWeight(250);
				product p3 = new Coffee(250);
				p3.setWeight(50);
				product p4 = new Coffee(250);
				p4.setWeight(50);

				 InventoryCart ic = new InventoryCart (10);
				 ic.add(p1);
				ic.add(p2);
				 ic.add(p3);
				ic.add(p4);
				cashier c = new cashier();
				c.doPayment(ic,employeeA.getCard());
				 c.printReceipt(); 

	}

}
