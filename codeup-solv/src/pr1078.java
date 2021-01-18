import java.util.Scanner;
 

public class pr1078{

	public static void main(String[] args) {
		int a;
		int sum =0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		for(int i=1; i<=a; i++)
		{
		  if(i%2==0) sum=sum+i;
		}
		
		System.out.printf("%d\n", sum);
			
	}
}

