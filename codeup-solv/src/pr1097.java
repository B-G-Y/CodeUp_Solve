import java.util.Scanner;

public class pr1097 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);

		
		int n, i, j, x, y;
		int a[][]=new int[20][20];
		
		for(i=1; i<=19; i++) //�� �پ� �ٵ��� ��Ȳ �Է� �ޱ�
		  for(j=1; j<=19; j++)
		   a[i][j] = scan.nextInt();;

		   n = scan.nextInt(); //��ǥ ���� �Է¹ޱ�

		for(i=1; i<=n; i++) //��ǥ�� ������ŭ
		{
			x = scan.nextInt();
			y = scan.nextInt();
		  for(j=1; j<=19; j++) //���� �� ��<->�� �ٲٱ�
		  {
		    if(a[x][j]==0) a[x][j]=1;
		    else a[x][j] = 0;
		  }
		  for(j=1; j<=19; j++) //���� �� ��<->�� �ٲٱ�
		  {
		    if(a[j][y]==0) a[j][y]=1;
		    else a[j][y] = 0;
		  }
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