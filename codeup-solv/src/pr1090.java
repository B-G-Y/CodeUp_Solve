import java.util.Scanner;

public class pr1090 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		long a, r, n;
		long result;
		a= scan.nextLong();
		r= scan.nextLong();
		n= scan.nextLong();
		
		result = a;
		
		for(int b=1; b<n; b++) {
			result *=r;
		}

		System.out.println(result);


	}
}