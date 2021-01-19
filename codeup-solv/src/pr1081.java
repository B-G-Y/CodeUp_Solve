import java.util.Scanner;

public class pr1081 {
	public static void main(String[] args) {
		
		int i, j;
		int n=0, m=0;
		Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
		for(i=1; i<=n; i++)
		  for(j=1; j<=m; j++)
		    System.out.printf("%d %d\n", i, j);
     
    }
}