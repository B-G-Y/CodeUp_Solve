import java.util.Scanner;
 

public class pr1046{

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		long d;
		double e;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		d = a+b+c;
		e = (double)d/3;
		
		System.out.println(d);
		System.out.printf("%.1f", e);
		
	}

	
}

