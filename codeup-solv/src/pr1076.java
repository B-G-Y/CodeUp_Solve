import java.util.Scanner;
 

public class pr1076{

	public static void main(String[] args) {
		char a;
		char t= 'a';
		Scanner scan = new Scanner(System.in);
		a = scan.next().charAt(0);
		
		do
		{
			System.out.printf("%c ", t);
			t+=1;
		}while(t< a +1);
		
	}
}

