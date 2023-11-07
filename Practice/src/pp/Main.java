package pp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		StringBuffer s_buffer = new StringBuffer(scan.next());
		String s = new String(s_buffer);
		System.out.println(s.toUpperCase());
	}

}
