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
		for(i=1; i<=19; i++) //�� ��(������ �Ʒ���) ��
		{
		  for(j=1; j<=19; j++) //�� ��(���ʿ��� ����������) ��
		  {
		    System.out.printf("%d ", a[i][j]); //�� ���
		  }
		  System.out.printf("\n"); //�� �ٲٱ�
		}

	}
}