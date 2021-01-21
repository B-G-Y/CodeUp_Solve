import java.util.Scanner;

public class pr1092 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		long a, b, c; // 각각의 방문 주기

		a= scan.nextLong();
		b= scan.nextLong();
		c= scan.nextLong();
		
		
		long day=1;
		while(day%a!=0 || day%b!=0 || day%c!=0) day++; 

		System.out.println(day);


	}
}