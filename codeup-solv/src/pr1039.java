import java.util.Scanner;
 

public class pr1039{

	public static void main(String[] args) {
		long data;
		long data1;
		long data2;
		
		Scanner scan = new Scanner(System.in);
		
		data = scan.nextLong();
		data1 = scan.nextLong();
		
		data2 = data1 + data;
		
		System.out.println(data2);

	}

}