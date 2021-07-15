/*���� 8-3 : FlowLayout ��ġ������ Ȱ��
 FlowLayout ��ġ�����ڸ� ����Ͽ� ���� �׸��� ���� 5���� ��ư ��ġ*/

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		
		setTitle("FlowLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();//����Ʈ �� �˾Ƴ���
		
		//���� ����, ���� ���� 30 pixel, ���� ���� 40 pixel ��ġ
		//FlowLayout ����
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculate"));
		
		setSize(300,200); //������ ũ�� 300x200 ����
		setVisible(true); //ȭ�鿡 ������ ���
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}