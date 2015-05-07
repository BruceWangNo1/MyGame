import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.TextArea;
import javax.swing.JSpinner;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Choice;
import javax.swing.JTextPane;


public class football {

	private JFrame frame;
	private JTextField txtSelectYourSelect;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					football window = new football();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public football() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 639, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogo = new JButton("Logo");
		btnLogo.setBounds(10, 34, 89, 23);
		frame.getContentPane().add(btnLogo);
		
		txtSelectYourSelect = new JTextField();
		txtSelectYourSelect.setText("Select your team");
		txtSelectYourSelect.setBounds(232, 115, 114, 20);
		frame.getContentPane().add(txtSelectYourSelect);
		txtSelectYourSelect.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(283, 209, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		Choice choice = new Choice();
		choice.setBounds(345, 115, 72, 20);
		frame.getContentPane().add(choice);
		
		JTextPane txtpnTeamSelection = new JTextPane();
		txtpnTeamSelection.setText("TEAM SELECTION");
		txtpnTeamSelection.setBounds(257, 11, 91, 20);
		frame.getContentPane().add(txtpnTeamSelection);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
