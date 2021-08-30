import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class HelloWorld extends JFrame {

	JButton btn;
	JLabel lbl;
	JPanel panel;
	
	public HelloWorld() {
		btn = new JButton();
		lbl = new JLabel();				
		btn.setText("Click Me!");
		setTitle("Hello World from Swing");
		panel = new JPanel();
		btn.setToolTipText("Click the button");
		
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		panel.add(btn);
		panel.add(lbl);
		add(panel);
		
		btn.addMouseListener(new MouseAdapter() {		
			@Override
			public void mouseClicked(MouseEvent ae) {
				btnMouseClicked(ae);
			}
		});
	}
	
	private void btnMouseClicked(MouseEvent ae) {
		lbl.setText("Hello World");
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {			
			@Override
			public void run() {
				new HelloWorld();
			}
		});
	}

}
