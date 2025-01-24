package drawPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExecMyDrawPanel {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		JFrame f = new JFrame("MyDraw simple");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		JButton button = new JButton("画像として保存");
		
		ActionListener handler = new FileSave(drawPanel,"画像.png");
		
		button.addActionListener(handler);
		
		
		f.add(drawPanel, BorderLayout.CENTER);
		f.add(button, BorderLayout.SOUTH);
		
		f.pack();
		
		f.setVisible(true);
		
		

	}//main()-end

}
