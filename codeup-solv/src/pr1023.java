import java.util.Scanner;
 

public class pr1023{

	public static void main(String[] args) {
		double data;
		Scanner scan = new Scanner(System.in);
		data = scan.nextLong();
	
		int ip;
		double fp;
		int iip;
		
		ip = (int)data;
		System.out.println(ip);
		
		fp = (data - (int) data);
		iip = (int)fp;
		System.out.println(iip);
		
	}

}