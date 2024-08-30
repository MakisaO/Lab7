package lab7_2;

public class cashier {
	 private InventoryCart cart;
	   private String typecard;
		private String numbercard;
		private Card card;
	
	public void doPayment(InventoryCart a,Card b) {
		this.cart = a;
		card = b;
		System.out.println("CARD TYPE: " +b.type() );
		System.out.println("CARD NUMBER: xxx-xxx-"+ ((DebitCard)b).getCard().substring(8));
		
	}
	
	public void printReceipt()	{
		
		double sum = 0;
		product[] p = cart.getP();
		System.out.println("Pumpkin shop ");
		for(product i :  p )	{
		if (i!=null)	{	
	
				System.out.println(i.count+ " x "+ i.name+ " " + i.getPrice()/i.count);
			sum +=  i.price;
			}
		}
		sum = sum - (sum*(card.discount()/100));
		System.out.println("-------------------------");
		System.out.println("CARD DISCOUNT \t "+card.discount()+"%");
		System.out.println("Total \t "+sum);
		}
		
		
	}
	

