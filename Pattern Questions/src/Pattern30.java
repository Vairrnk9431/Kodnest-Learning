
public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10;j++) {
				if(i==0||j==10||i==3||j==0||j==10) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		    System.out.println();
		}

	}

}
