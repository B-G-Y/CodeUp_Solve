import java.util.Scanner;
 

public class pr1070{

	public static void main(String[] args) {
		int a;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		switch(a)
		{
		  case 12:
		  case 1:
		  case 2:
			  System.out.printf("%s \n", "winter");
			  break;
		  case 3:
		  case 4:
		  case 5:
			  System.out.printf("%s \n", "spring");
			  break;
		  case 6:
		  case 7:
		  case 8:
			  System.out.printf("%s \n", "summer");;
			  break;
		  case 9:
		  case 10:
		  case 11:
			  System.out.printf("%s \n", "fall");;
			  break;
		  default:
			  break;
		}
		
	}

}

