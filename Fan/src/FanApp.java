public class FanApp {

	public static void main(String[] args) {
	Fan F1=new Fan();
	Fan F2=new Fan();
	Fan F3=new Fan();
	
	System.out.println("============================================");
	F1.no_Of_Wings=3;
	F1.cost=3000;
	F1.color="Blue";
	F1.brand="Crompton";
	
	System.out.println(F1.no_Of_Wings+" "+F1.cost+" "+F1.color+" "+F1.brand);
	
	
	F1.rotate();
	F1.blowAir();
	
	System.out.println("============================================");
	F2.no_Of_Wings=4;
	F2.cost=4000;
	F2.color="White";
	F2.brand="Usha";
	
	System.out.println(F2.no_Of_Wings+" "+F2.cost+" "+F2.color+" "+F2.brand);
	
	
	F2.rotate();
	F2.blowAir();
	
	System.out.println("============================================");
	F3.no_Of_Wings=5;
	F3.cost=5000;
	F3.color="white";
	F3.brand="Orient";
	
	System.out.println(F3.no_Of_Wings+" "+F3.cost+" "+F3.color+" "+F3.brand);
	
	
	F3.rotate();
	F3.blowAir();
	

	}

}

