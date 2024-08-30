package lab7_2;

public class InventoryCart {
		private product[] p;
		private int index  = 0;
		public InventoryCart(int num){
			this.p = new product[num];
		}
		public void add(product a) {
			boolean check = true;
			for(product i : p) {
				if(i!=null) {
					if(i.name.equals(a.name)) {
					i.price *= i.getCount();
					check =false;
					}
				}
			}
				
			if(check) 
				this.p[index++] = a;
		}
		public product[] getP() {
			return p;
		}
		public product getProductAt(int i) {
			return p[i];
		}
}
