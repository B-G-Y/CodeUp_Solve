import java.util.Scanner;

public class pr1098 {      // 틀렸음 새로 해야함.
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);

		
		int h, w, n, l, d, x, y, i, j;
		// 세로 가로 막대갯수 막대길이 방향
		// 좌표 
		// for문 i j
		
		h = scan.nextInt(); //세로
		w = scan.nextInt(); //가로
		int[][] a = new int[h][w];  // 판 크기 정하기
		
		n = scan.nextInt(); //막대 개수 입력받기

		for(i=1; i<=n; i++) //막대 개수 만큼 
		{
			l = scan.nextInt();  // 막대길이
			d = scan.nextInt();  // 가로0 세로1
			x = scan.nextInt();  // x좌표
			y = scan.nextInt();  // y좌표
			
			if(d==0) {
				for(j=x; j<=x+l-1; j++) //가로 0->1 바꾸기
				  {
				    a[j][y]= 1;
				  }
			}else {
				for(j=y; j<=y+l-1; j++) //세로 0->1 바꾸기
				  {
				    a[x][j]=1;
				  }
			}
		}
		
		
		for(i=1; i<=h; i++) //한 줄(위에서 아래로) 씩
		{
		  for(j=1; j<=w; j++) //한 열(왼쪽에서 오른쪽으로) 씩
		  {
		    System.out.printf("%d ", a[i][j]); //값 출력
		  }
		  System.out.printf("\n"); //줄 바꾸기
		}
	}
}