import java.util.*;

public class pr1025{
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        for(int i = 0; i < s.length(); i++) {
            System.out.println("[" + s.charAt(i) + "]");
        }
    }
}