import java.util.Scanner;

public class pr1091 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		long a, m, d, n; // ����, ����, ����, ���° ��
		long result;
		a= scan.nextLong();
		m= scan.nextLong();
		d= scan.nextLong();
		n= scan.nextLong();
		
		result = a;
		
		for(int b=1; b<n; b++) {
			result = (result * m) + d;
		}

		System.out.println(result);


	}
}