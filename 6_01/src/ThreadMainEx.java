/*���� 12-3 : main ������ Ȯ�ΰ� ������ ������ �˾Ƴ��� �ڵ�
 main() �޼ҵ� ������ ���� ������ ������ ���� Thread ��ü�� �˾Ƴ��� 
 ���� ���� ���� �����忡 ���� �پ��� ���� ���*/
public class ThreadMainEx {
	public static void main(String[] args) {
		long id=Thread.currentThread().getId(); //������ ���̵�
		String name=Thread.currentThread().getName(); //������ �̸� 
		int priority=Thread.currentThread().getPriority(); //������ �켱����
		Thread.State s=Thread.currentThread().getState(); //������ ���°�
	
		System.out.println("���� ������ �̸�= "+name);
		System.out.println("���� ������ id= "+id);
		System.out.println("���� ������ �켱 ����= "+priority);
		System.out.println("���� ������ ���� = "+s);
	}
	

}