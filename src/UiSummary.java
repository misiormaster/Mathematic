import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class UiSummary extends JFrame {

	
	Logic logic = new Logic(this);
	
	
	public JLabel lblGameOver;
	public JLabel lbltxtYourResult;
	public JLabel lblUserPoints;
	public JLabel lblTextPoints;
	public JLabel lblUserMaxPoints;
	public JLabel lblCongratulation;
	
	
	public UiSummary() {
		setTitle("Gry Matematyczne Nikoli v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblGameOver = new JLabel("KONIEC GRY");
		lblGameOver.setForeground(Color.BLUE);
		lblGameOver.setFont(new Font("Century", Font.BOLD, 60));
		lblGameOver.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameOver.setBounds(0, 13, 782, 144);
		getContentPane().add(lblGameOver);
		
		lbltxtYourResult = new JLabel("Twój wynik to: ");
		lbltxtYourResult.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbltxtYourResult.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltxtYourResult.setBounds(144, 184, 236, 68);
		getContentPane().add(lbltxtYourResult);
		
		lblUserPoints = new JLabel("0");
		lblUserPoints.setForeground(Color.BLUE);
		lblUserPoints.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserPoints.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUserPoints.setBounds(383, 184, 45, 68);
		getContentPane().add(lblUserPoints);
		
		
		
		lblTextPoints = new JLabel("punktów.");
		lblTextPoints.setHorizontalAlignment(SwingConstants.LEFT);
		lblTextPoints.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTextPoints.setBounds(500, 184, 155, 68);
		getContentPane().add(lblTextPoints);
		
		JButton btnBack = new JButton("powrót");
		btnBack.setBounds(276, 493, 230, 55);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnBack.setForeground(Color.RED);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setVisible(true);
		getContentPane().add(btnBack);
		
		lblUserMaxPoints = new JLabel("/20");
		lblUserMaxPoints.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserMaxPoints.setForeground(Color.BLUE);
		lblUserMaxPoints.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUserMaxPoints.setBounds(431, 184, 57, 68);
		getContentPane().add(lblUserMaxPoints);
		
		lblCongratulation = new JLabel("Gratulacje :)");
		lblCongratulation.setForeground(Color.BLUE);
		lblCongratulation.setHorizontalAlignment(SwingConstants.CENTER);
		lblCongratulation.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCongratulation.setBounds(157, 319, 484, 68);
		getContentPane().add(lblCongratulation);	
	}
	
}
