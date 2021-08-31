import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuAndToolbar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAndToolbar frame = new MenuAndToolbar();
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
	public MenuAndToolbar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmAdd = new JMenuItem("Add");
		mnEdit.add(mntmAdd);
		
		JMenuItem mntmCut = new JMenuItem("Cut");
		mnEdit.add(mntmCut);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		JButton btnAdd = new JButton();
		JButton btnCut = new JButton();			
		
		URL imageURLAdd = MenuAndToolbar.class.getResource("./resources/add.png");
		URL imageURLCut = MenuAndToolbar.class.getResource("./resources/cut.png");
		
		Image imgAdd = new ImageIcon(imageURLAdd, "add").getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		Image imgCut = new ImageIcon(imageURLCut, "cut").getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		
		btnAdd.setIcon(new ImageIcon(imgAdd));		
		btnCut.setIcon(new ImageIcon(imgCut));		
		
		toolBar.add(btnAdd);
		toolBar.add(btnCut);
		
		contentPane.add(toolBar, BorderLayout.NORTH);
	}

}
