
public class TableApp {

	public static void main(String[] args) {
	Table T1 = new Table();
	
	T1.SeatingCapacity=6;
	T1.Cost=4500;
	T1.brand="Greenply";
	T1.color="Brown";
	T1.allowsTosit();
	T1.allowToWrite();
	System.out.println(T1.SeatingCapacity + " "+ T1.Cost + " " + T1.color + " "+ T1.brand);
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	
	Table T2=new Table();
	T2.SeatingCapacity=4;
	T2.Cost=3000;
	T2.color="Black";
	T2.brand="Greenply";
	T2.allowsTosit();
	T2.allowToWrite();
	System.out.println(T2.SeatingCapacity + " "+ T2.Cost + " " + T2.color + " "+ T2.brand);
	}

}
