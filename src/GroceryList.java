import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GroceryList extends JFrame {

	private JPanel contentPane;
	private JTextField item;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroceryList frame = new GroceryList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GroceryList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 448, 275);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Grocery Item:");
		lblNewLabel.setBounds(12, 46, 110, 15);
		panel.add(lblNewLabel);
		
		item = new JTextField();
		item.setBounds(140, 44, 171, 19);
		panel.add(item);
		item.setColumns(10);
		
		JTextArea list = new JTextArea();
		list.setBounds(29, 84, 282, 166);
		panel.add(list);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (item.getText().length() != 0) {
					String groceryItem = item.getText();
					list.append(groceryItem + "\n");
					item.setText("");
				}
			}
		});
		
		addButton.setBounds(341, 41, 83, 25);
		panel.add(addButton);
		
		JButton printButton = new JButton("Print");
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(list.getText());
			}
		});
		printButton.setBounds(341, 96, 83, 25);
		panel.add(printButton);
		
		JButton clearButton = new JButton("Clear");
		clearButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				list.setText("");
			}
		});
		clearButton.setBounds(341, 154, 83, 25);
		panel.add(clearButton);
		
		getRootPane().setDefaultButton(addButton);
				
	}
}
