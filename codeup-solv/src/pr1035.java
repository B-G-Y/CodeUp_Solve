import java.util.*;
 

public class pr1035{

	public static void main(String[] args) {
		String data;
		int data1;
		String data2;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		data = scan.nextLine();
		data1 = Integer.valueOf(data, 16);
		data2 = Integer.toOctalString(data1);
		System.out.println(data2);
	}

}