import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UiMenu extends JFrame {

	Logic logic = new Logic(this);
	
	

	public JButton btnChoice_1;
	public JButton btnChoice_2;
	public JButton btnChoice_3;
	public JButton btnChoice_4;
	public JButton btnExit;
	public JLabel lblComments;

	public UiMenu() {
		
			
		

		setTitle("Gry Matematyczne Nikoli v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblTitle = new JLabel("\" Gry Matematyczne \"");
		lblTitle.setForeground(Color.MAGENTA);
		lblTitle.setFont(new Font("Snap ITC", Font.PLAIN, 30));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 0, 782, 74);
		getContentPane().add(lblTitle);

		lblComments = new JLabel("Cześć ! Wybierz co chcesz robić.");
		lblComments.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblComments.setHorizontalAlignment(SwingConstants.CENTER);
		lblComments.setBounds(0, 136, 782, 40);
		getContentPane().add(lblComments);

		btnChoice_1 = new JButton("Mnożenie");
		btnChoice_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				UiMulti mul = new UiMulti();
				mul.setSize(800,700);
				mul.setLocationRelativeTo(null);
				mul.setVisible(true);
			}
		});
		btnChoice_1.setForeground(Color.BLUE);
		btnChoice_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChoice_1.setBounds(221, 207, 340, 55);
		getContentPane().add(btnChoice_1);

		btnChoice_2 = new JButton("Dzielenie");
		btnChoice_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UiDivision div = new UiDivision();
				div.setSize(800,700);
				div.setLocationRelativeTo(null);
				div.setVisible(true);
			}
		});
		btnChoice_2.setForeground(Color.RED);
		btnChoice_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChoice_2.setBounds(221, 293, 340, 55);
		getContentPane().add(btnChoice_2);

		btnChoice_3 = new JButton("Dodawanie");
		btnChoice_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UiAddition add = new UiAddition();
				add.setSize(800,700);
				add.setLocationRelativeTo(null);
				add.setVisible(true);
				//add.txtCalculations.requestFocus();
			}
		});
		btnChoice_3.setForeground(Color.GREEN);
		btnChoice_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChoice_3.setBounds(221, 379, 340, 55);
		getContentPane().add(btnChoice_3);

		btnChoice_4 = new JButton("Odejmowanie");
		btnChoice_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UiSubtraction sub = new UiSubtraction();
				sub.setSize(800,700);
				sub.setLocationRelativeTo(null);
				sub.setVisible(true);
				//sub.txtCalculations.requestFocus();
			}
		});
		btnChoice_4.setForeground(Color.ORANGE);
		btnChoice_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChoice_4.setBounds(221, 465, 340, 55);
		getContentPane().add(btnChoice_4);

		btnExit = new JButton("Wyjście");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.MAGENTA);
		btnExit.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		btnExit.setBounds(276, 550, 230, 55);
		getContentPane().add(btnExit);
	}





}
