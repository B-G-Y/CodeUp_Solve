import java.util.Scanner;

public class pr1086 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		long w, h, b;
		w= scan.nextLong();
		h= scan.nextLong();
		b= scan.nextLong();

		
		double MB;
		MB = (w*h*b);
		
		double result = ((MB/8)/Math.pow(2, 10)/Math.pow(2, 10));
		System.out.printf("%.1f MB", result);


	}
}