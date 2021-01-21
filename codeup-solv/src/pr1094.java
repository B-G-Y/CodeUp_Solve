import java.util.Scanner;

public class pr1094 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		int n, i, t;
		n = scan.nextInt(); //개수 입력받기
		long a[]= new long[n];
		
		for(i=0; i<n; i++) //개수만큼 입력받기
		{
		  t = scan.nextInt(); //읽어서
		  a[i] = t; 
		}
		for(i=n-1; i>=0; i--)
		{
		  System.out.printf("%d ", a[i]); 
		}


	}
}