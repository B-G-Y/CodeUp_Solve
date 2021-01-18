import java.util.Scanner;
 

public class pr1053{

	public static void main(String[] args) {
		int a;

		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		System.out.print(cha(a));
		
	}

	static int cha(int a) {
		if(a==0) {
			return 1;
		}else {
			return 0;
		}
	}
}

