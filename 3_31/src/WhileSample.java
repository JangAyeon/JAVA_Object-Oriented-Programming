//while���� �̿��� ������ ������ �Է¹ް� ��� ���. 0 �Է½� ����

import java.util.Scanner;
public class WhileSample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int count =0,n=0;
		double sum=0;
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��Ͻÿ�");
		while((n=scanner.nextInt())!=0) {//0�� �ԷµǸ� while�� ���
			sum+=n;
			count++;

		}
		System.out.print("���� ������ "+count+"���̸�");
		System.out.println("����� "+sum/count+"�Դϴ�.");
		
		scanner.close();
	}

}