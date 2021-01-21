import java.util.Scanner;

public class pr1097 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);

		
		int n, i, j, x, y;
		int a[][]=new int[20][20];
		
		for(i=1; i<=19; i++) //한 줄씩 바둑판 상황 입력 받기
		  for(j=1; j<=19; j++)
		   a[i][j] = scan.nextInt();;

		   n = scan.nextInt(); //좌표 개수 입력받기

		for(i=1; i<=n; i++) //좌표의 개수만큼
		{
			x = scan.nextInt();
			y = scan.nextInt();
		  for(j=1; j<=19; j++) //가로 줄 흑<->백 바꾸기
		  {
		    if(a[x][j]==0) a[x][j]=1;
		    else a[x][j] = 0;
		  }
		  for(j=1; j<=19; j++) //세로 줄 흑<->백 바꾸기
		  {
		    if(a[j][y]==0) a[j][y]=1;
		    else a[j][y] = 0;
		  }
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