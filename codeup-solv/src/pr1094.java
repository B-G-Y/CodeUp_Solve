import java.util.Scanner;

public class pr1094 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		int n, i, t;
		n = scan.nextInt(); //���� �Է¹ޱ�
		long a[]= new long[n];
		
		for(i=0; i<n; i++) //������ŭ �Է¹ޱ�
		{
		  t = scan.nextInt(); //�о
		  a[i] = t; 
		}
		for(i=n-1; i>=0; i--)
		{
		  System.out.printf("%d ", a[i]); 
		}


	}
}