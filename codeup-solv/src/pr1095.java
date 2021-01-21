import java.util.Scanner;

public class pr1095 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		int n, i, t;  // n입력,  for문 내의 i, t는 변수
		n = scan.nextInt(); //개수 입력받기
		long a[]= new long[n];
		
		for(i=0; i<n; i++) //개수만큼 입력받기
		{
		  t = scan.nextInt(); //읽어서
		  a[i] = t; 
		}
		
		long least = 10000;
		for(i=0; i<n; i++) //개수만큼 입력받기
		{
			if(a[i]<least) {
				least = a[i];
			}
		}
		System.out.println(least);


	}
}