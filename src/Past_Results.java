import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Past_Results {

	private JFrame frame;
	private JTextField txtPastResults;
	private JTextField txtWin;
	private JTextField txtLose;
	private JTextField txtDraw;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Past_Results window = new Past_Results();
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
	public Past_Results() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 730, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtPastResults = new JTextField();
		txtPastResults.setText("Past Results");
		txtPastResults.setBounds(393, 135, 86, 20);
		frame.getContentPane().add(txtPastResults);
		txtPastResults.setColumns(10);
		
		txtWin = new JTextField();
		txtWin.setText("Win");
		txtWin.setBounds(393, 166, 44, 20);
		frame.getContentPane().add(txtWin);
		txtWin.setColumns(10);
		
		txtLose = new JTextField();
		txtLose.setText("Lose");
		txtLose.setBounds(393, 197, 44, 20);
		frame.getContentPane().add(txtLose);
		txtLose.setColumns(10);
		
		txtDraw = new JTextField();
		txtDraw.setText("Draw");
		txtDraw.setBounds(393, 232, 44, 20);
		frame.getContentPane().add(txtDraw);
		txtDraw.setColumns(10);
		
		JButton btnNextMatch = new JButton("Next Match");
		btnNextMatch.setBounds(297, 323, 89, 23);
		frame.getContentPane().add(btnNextMatch);
		
		textField = new JTextField();
		textField.setBounds(444, 166, 38, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(447, 197, 38, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(447, 232, 38, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
