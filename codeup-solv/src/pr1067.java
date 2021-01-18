import java.util.Scanner;
 

public class pr1067{

	public static void main(String[] args) {
		int a;

		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		if(a>0)
		{
			System.out.printf("%s \n", "plus");
		}else {
			
			System.out.printf("%s \n", "minus");
		}
		
		
		if(a%2==0)
		{
			System.out.printf("%s \n", "even");
		}else {
			
			System.out.printf("%s \n", "odd");
		}
		
		
	}

}

