import java.util.Scanner;
 

public class pr1045{

	public static void main(String[] args) {
		int a;
		int b;
		float c;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		
		c = (float)a / (float)b;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.printf("%.2f", c);
	}
	

	
}

