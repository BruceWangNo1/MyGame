

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JPasswordField;

import java.awt.TextArea;
import java.awt.Button;
import java.awt.image.*;

public class Login {

	private JFrame frame;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 592, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("eng-software.jpg")).getImage();
		//ImageIcon img = new ImageIcon(this.getClass().getResource("/eng-software.jpg"));
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 254, 54);
		frame.getContentPane().add(lblNewLabel);
		
		Label label = new Label("UserName: ");
		label.setBounds(260, 20, 62, 22);
		frame.getContentPane().add(label);
		
		TextField textField = new TextField();
		textField.setBounds(328, 20, 71, 22);
		frame.getContentPane().add(textField);
		
		Label label_1 = new Label("Password:");
		label_1.setBounds(408, 20, 62, 22);
		frame.getContentPane().add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setText("");
		passwordField.setBounds(476, 20, 90, 22);
		frame.getContentPane().add(passwordField);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(7, 98, 247, 186);
		frame.getContentPane().add(textArea);
		
		Label label_2 = new Label("UserName:");
		label_2.setBounds(260, 153, 71, 22);
		frame.getContentPane().add(label_2);
		
		Label label_3 = new Label("Password");
		label_3.setBounds(260, 181, 71, 22);
		frame.getContentPane().add(label_3);
		
		Label label_4 = new Label("First Name:");
		label_4.setBounds(260, 98, 71, 22);
		frame.getContentPane().add(label_4);
		
		Label label_5 = new Label("Surname:");
		label_5.setBounds(260, 125, 71, 22);
		frame.getContentPane().add(label_5);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(328, 98, 129, 22);
		frame.getContentPane().add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(328, 125, 129, 22);
		frame.getContentPane().add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(328, 153, 129, 22);
		frame.getContentPane().add(textField_3);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(328, 183, 129, 20);
		frame.getContentPane().add(passwordField_1);
		
		Button button = new Button("Register");
		button.setBounds(270, 253, 200, 50);
		frame.getContentPane().add(button);
		
		Label label_6 = new Label("Email:");
		label_6.setBounds(260, 209, 62, 22);
		frame.getContentPane().add(label_6);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(328, 209, 129, 22);
		frame.getContentPane().add(textField_4);
	}
}
