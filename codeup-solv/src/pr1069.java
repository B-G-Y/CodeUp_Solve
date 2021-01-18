import java.util.Scanner;
 

public class pr1069{

	public static void main(String[] args) {
		int a;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		switch(a)
		{
		  case 'A': 
			  System.out.printf("%s \n", "best!!!");
			  break;
		  case 'B':
			  System.out.printf("%s \n", "good!!");
			  break;
		  case 'C':
			  System.out.printf("%s \n", "run!");;
			  break;
		  case 'D':
			  System.out.printf("%s \n", "slowly~");;
			  break;
		  default:
			  System.out.printf("%s \n", "what?");;
		}
		
	}

}

