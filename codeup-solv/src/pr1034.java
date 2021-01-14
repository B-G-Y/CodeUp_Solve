import java.util.*;
 

public class pr1034{

	public static void main(String[] args) {
		String data;
		int data1;
		
		Scanner scan = new Scanner(System.in);
		data = scan.nextLine();
		data1 = Integer.valueOf(data, 16);
		scan.close();
		System.out.println(data1);
	}

}