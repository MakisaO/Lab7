package lab7_2;

public class cashier {
	 private InventoryCart cart;
	   private String typecard;
		private String numbercard;
		private DebitCard D;
		public cashier() {
			D = new DebitCard();
			typecard = D.type();

		}
	public void doPayment(InventoryCart a,String b) {
		this.cart = a;
		String news = b;
		
		String[] parts = news.split("-");
		parts[0] = "XXX";
        parts[1] = "XXX";
        
       this.numbercard = String.join("-", parts);
	}
	
	public void printReceipt()	{
		
		System.out.println("CARD TYPE: " + D.type());
		
		System.out.println("CARD NUMBER: "+numbercard);
		double sum = 0;
		product[] p = cart.getP();
		System.out.println("Pumpkin shop ");
		for(product i :  p )	{
		if (i!=null)	{	
	
				System.out.println(i.count+ " x "+ i.name+ " " + i.getPrice()/i.count);
			sum +=  i.price;
			}
		}
		sum = sum - (sum*(D.discount()/100));
		System.out.println("-------------------------");
		System.out.println("CARD DISCOUNT \t "+D.discount()+"%");
		System.out.println("Total \t "+sum);
		}
		
		
	}
	

