import java.util.Scanner;

public class pr1085 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		long h, b, c, s;
		h= scan.nextLong();
		b= scan.nextLong();
		c= scan.nextLong();
		s= scan.nextLong();
		
		double MB;
		MB = (h*b*c*s);
		
		double result = ((MB/8)/Math.pow(2, 10)/Math.pow(2, 10));
		System.out.printf("%.1f MB", result);


	}
}