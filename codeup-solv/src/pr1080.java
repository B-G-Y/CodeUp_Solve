import java.util.Scanner;

public class pr1080 {
	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        
        while(true) {
        	b +=1;
        	sum +=b;
        	if(sum>=a) {
        		System.out.printf("%d", b);
        		break;
        	}
        }
     
    }
}