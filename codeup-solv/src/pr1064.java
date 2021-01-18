import java.util.Scanner;
 

public class pr1064{

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		System.out.printf("%d", (a<b ? a:b)<c ? (a<b ? a:b):c);
	
		
		
	}

}

