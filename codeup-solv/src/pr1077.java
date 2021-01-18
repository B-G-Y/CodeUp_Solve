import java.util.Scanner;
 

public class pr1077{

	public static void main(String[] args) {
		int a;
		int t= 0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		do
		{
			System.out.printf("%d\n", t);
			t+=1;
		}while(t< a +1);
		
	}
}

