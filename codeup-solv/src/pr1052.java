import java.util.Scanner;
 

public class pr1052{

	public static void main(String[] args) {
		int a;
		int b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.print(cha(a, b));
		
	}

	static int cha(int a, int b) {
		if(b != a) {
			return 1;
		}else {
			return 0;
		}
	}
}

