import java.util.Scanner;

public class pr1093 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		int n, i, t;
		int a[]= new int[24];
		n = scan.nextInt(); //���� �Է¹ޱ�
		for(i=1; i<=n; i++) //������ŭ �Է¹ޱ�
		{
		  t = scan.nextInt(); //�о
		  a[t] = a[t]+1; //����ִ� ���� 1��ŭ ���� �ٽ� ����. a[t]+=1 �� ����.
		}
		for(i=1; i<=23; i++)
		{
		  System.out.printf("%d ", a[i]); //1~23 �� �迭�� ����Ǿ��ִ� �� ����ϱ�
		}


	}
}