import java.util.Scanner;

public class pr1095 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		int n, i, t;  // n�Է�,  for�� ���� i, t�� ����
		n = scan.nextInt(); //���� �Է¹ޱ�
		long a[]= new long[n];
		
		for(i=0; i<n; i++) //������ŭ �Է¹ޱ�
		{
		  t = scan.nextInt(); //�о
		  a[i] = t; 
		}
		
		long least = 10000;
		for(i=0; i<n; i++) //������ŭ �Է¹ޱ�
		{
			if(a[i]<least) {
				least = a[i];
			}
		}
		System.out.println(least);


	}
}