import java.util.Scanner;

public class pr1096 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		int n, i, j, x, y;
		int a[][]=new int[20][20];
		
		n = scan.nextInt();
		
		for(i=1; i<=n; i++)
		{
			x = scan.nextInt();
			y = scan.nextInt();
			a[x][y]=1;
		}
		for(i=1; i<=19; i++) //한 줄(위에서 아래로) 씩
		{
		  for(j=1; j<=19; j++) //한 열(왼쪽에서 오른쪽으로) 씩
		  {
		    System.out.printf("%d ", a[i][j]); //값 출력
		  }
		  System.out.printf("\n"); //줄 바꾸기
		}

	}
}