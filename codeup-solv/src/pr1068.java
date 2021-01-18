import java.util.Scanner;
 

public class pr1068{

	public static void main(String[] args) {
		int a;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		if(100 >= a && a >=90)
		{
			System.out.printf("%s \n", "A");
		}else if(a>=70){
			System.out.printf("%s \n", "B");
		}else if(a>=40){
			System.out.printf("%s \n", "C");
		}else {
			System.out.printf("%s \n", "D");
		}
		
	}

}

