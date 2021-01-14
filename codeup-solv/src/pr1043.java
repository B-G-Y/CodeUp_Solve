import java.util.Scanner;
 

public class pr1043{

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();

		c = (a % b);
		
		System.out.println(c);
	}
}