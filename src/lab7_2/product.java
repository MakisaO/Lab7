package lab7_2;

public class product {
		 protected String  name;
		 protected int price;
		 protected int weight;
		 protected int volume;
		 protected int count =1 ;
		product(int price){
			this.price = price;
		}
		
//		public product(String name, String Product, int price) {
//			this.name = name;
//			this.Product = Product;
//			this.price = price;
//		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public void setVolume(int volume) {
			this.volume = volume;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public int getCount() {
			count++;
			return count;
		}
}
