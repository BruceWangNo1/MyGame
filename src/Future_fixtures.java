import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JButton;


public class Future_fixtures {

	private JFrame frame;
	private JTextField txtHome;
	private JTextField txtAway;
	private JTextField txtFutureFixtures;
	private JTextField txtVs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Future_fixtures window = new Future_fixtures();
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
	public Future_fixtures() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtHome = new JTextField();
		txtHome.setText("Home");
		txtHome.setBounds(139, 84, 42, 20);
		frame.getContentPane().add(txtHome);
		txtHome.setColumns(10);
		
		txtAway = new JTextField();
		txtAway.setText("Away");
		txtAway.setBounds(401, 84, 42, 20);
		frame.getContentPane().add(txtAway);
		txtAway.setColumns(10);
		
		txtFutureFixtures = new JTextField();
		txtFutureFixtures.setText("FUTURE FIXTURES");
		txtFutureFixtures.setBounds(246, 0, 98, 20);
		frame.getContentPane().add(txtFutureFixtures);
		txtFutureFixtures.setColumns(10);
		
		txtVs = new JTextField();
		txtVs.setText("VS");
		txtVs.setBounds(288, 139, 25, 20);
		frame.getContentPane().add(txtVs);
		txtVs.setColumns(10);
		
		Choice choice = new Choice();
		choice.setBounds(116, 105, 98, 20);
		frame.getContentPane().add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(382, 105, 98, 20);
		frame.getContentPane().add(choice_1);
		
		JButton btnSimulate = new JButton("Simulate");
		btnSimulate.setBounds(255, 271, 89, 23);
		frame.getContentPane().add(btnSimulate);
	}
}
