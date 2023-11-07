
public class Main {

	public static void main(String[] args) {
		Upi upi = new Upi();
		upi.bill();
		upi.offer();
		upi.pay();
		
		Wallet wlt = new Wallet();
		wlt.bill();
		wlt.offer();
		wlt.pay();
		
		Card cd = new Card();
		cd.bill();
		cd.offer();
		cd.pay();
		

	}

}
