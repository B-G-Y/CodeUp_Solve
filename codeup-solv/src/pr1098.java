import java.util.Scanner;

public class pr1098 {      // Ʋ���� ���� �ؾ���.
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);

		
		int h, w, n, l, d, x, y, i, j;
		// ���� ���� ���밹�� ������� ����
		// ��ǥ 
		// for�� i j
		
		h = scan.nextInt(); //����
		w = scan.nextInt(); //����
		int[][] a = new int[h][w];  // �� ũ�� ���ϱ�
		
		n = scan.nextInt(); //���� ���� �Է¹ޱ�

		for(i=1; i<=n; i++) //���� ���� ��ŭ 
		{
			l = scan.nextInt();  // �������
			d = scan.nextInt();  // ����0 ����1
			x = scan.nextInt();  // x��ǥ
			y = scan.nextInt();  // y��ǥ
			
			if(d==0) {
				for(j=x; j<=x+l-1; j++) //���� 0->1 �ٲٱ�
				  {
				    a[j][y]= 1;
				  }
			}else {
				for(j=y; j<=y+l-1; j++) //���� 0->1 �ٲٱ�
				  {
				    a[x][j]=1;
				  }
			}
		}
		
		
		for(i=1; i<=h; i++) //�� ��(������ �Ʒ���) ��
		{
		  for(j=1; j<=w; j++) //�� ��(���ʿ��� ����������) ��
		  {
		    System.out.printf("%d ", a[i][j]); //�� ���
		  }
		  System.out.printf("\n"); //�� �ٲٱ�
		}
	}
}