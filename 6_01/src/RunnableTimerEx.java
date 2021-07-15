/*���� 12-2 : Runnable �������̽��� �̿��Ͽ� 1�� ������ ����ϴ� Ÿ�̸� ������ �����*/

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable{
	private JLabel timerLabel;
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel=timerLabel;
	}
	//������ �ڵ�, run()�� �����ϸ� ������ ����
	public void run() {
		int n=0;//Ÿ�̸� ī��Ʈ ��
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);//1�� ���� ���� ��
			}
			catch(InterruptedException e) {return;}
		}
		
	}
}
public class RunnableTimerEx extends JFrame {
	
	public RunnableTimerEx() {
		setTitle("Runnable�� ������ Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		//Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel=new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);//���̺��� ����Ʈ�ҿ� ����
		
		TimerRunnable runnable=new TimerRunnable(timerLabel);
		Thread th=new Thread(runnable);//������ ��ü ����
		setSize(250,150);
		setVisible(true);
		th.start();//Ÿ�̸� �����尡 ������ �����ϰ� ��
		
	}
	
	public static void main(String[] args) {
		new RunnableTimerEx();
	}
	

}