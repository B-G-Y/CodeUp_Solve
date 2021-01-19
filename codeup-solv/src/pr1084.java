import java.util.Scanner;

public class pr1084{
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		int i, j, k, c=0;
		int r= scan.nextInt();
		int g= scan.nextInt();
		int b= scan.nextInt();

		for(i=0; i<r; i++)
		  for(j=0; j<g; j++)
		    for(k=0; k<b; k++)
		    {
		      System.out.printf("%d %d %d\n", i, j, k);
		      c++;
		    }

		System.out.printf("%d ", c);

	}
}