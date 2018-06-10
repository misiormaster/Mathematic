import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UiSubtraction extends JFrame {

	Logic logic = new Logic(this);

	public JButton btnEnter;
	public JLabel lblComments;
	public JLabel lblValue1;
	public JLabel lblSignOfAction;
	public JLabel lblValue2;
	public JLabel lblEqualSign;
	public JTextField txtResult;
	public JButton btnBack;
	public JButton btnNext;
	public JTextField txtCalculations;
	public JLabel lblComments2;
	public JLabel lblExample;
	public JLabel lblExampleNumb;
	public JLabel lblPoints;

	public UiSubtraction() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setTitle("Gry Matematyczne Nikoli v1.0");
		getContentPane().setLayout(null);

		lblComments = new JLabel(" Wpisz prawidłowy wynik i wciścnij 'enter'.");
		lblComments.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblComments.setHorizontalAlignment(SwingConstants.CENTER);
		lblComments.setBounds(0, 111, 782, 40);
		getContentPane().add(lblComments);

		lblValue1 = new JLabel("");
		lblValue1.setFont(new Font("Tahoma", Font.PLAIN, 80));
		lblValue1.setHorizontalAlignment(SwingConstants.CENTER);
		lblValue1.setBounds(110, 207, 99, 141);
		lblValue1.setVisible(true);
		getContentPane().add(lblValue1);


		lblSignOfAction = new JLabel("-");
		lblSignOfAction.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignOfAction.setFont(new Font("Tahoma", Font.PLAIN, 80));
		lblSignOfAction.setBounds(221, 207, 99, 141);
		lblSignOfAction.setVisible(true);
		getContentPane().add(lblSignOfAction);

		lblValue2 = new JLabel("");
		lblValue2.setHorizontalAlignment(SwingConstants.CENTER);
		lblValue2.setFont(new Font("Tahoma", Font.PLAIN, 80));
		lblValue2.setBounds(332, 207, 99, 141);
		lblValue2.setVisible(true);
		getContentPane().add(lblValue2);

		lblEqualSign = new JLabel("=");
		lblEqualSign.setHorizontalAlignment(SwingConstants.CENTER);
		lblEqualSign.setFont(new Font("Tahoma", Font.PLAIN, 80));
		lblEqualSign.setBounds(443, 207, 99, 141);
		lblEqualSign.setVisible(true);
		getContentPane().add(lblEqualSign);

		txtResult = new JTextField();
		txtResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.checkResultSubtraction();
				btnEnter.setVisible(false);
				btnNext.setVisible(true);
				btnNext.requestFocus();
			}
		});
		txtResult.setFont(new Font("Tahoma", Font.PLAIN, 80));
		txtResult.setBounds(554, 207, 99, 141);
		getContentPane().add(txtResult);
		txtResult.setColumns(10);
		txtResult.setVisible(true);
		txtResult.requestFocus();
		txtResult.selectAll();
		txtResult.cut();
		txtResult.setBackground(Color.WHITE);

		btnEnter = new JButton("enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.checkResultSubtraction();
				btnEnter.setVisible(false);
				btnNext.setVisible(true);
			}
		});
		btnEnter.setForeground(Color.GREEN);
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEnter.setBounds(110, 550, 230, 55);
		btnEnter.setVisible(true);
		getContentPane().add(btnEnter);

		btnBack = new JButton("powrót");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnBack.setForeground(Color.RED);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(423, 550, 230, 55);
		btnBack.setVisible(true);
		getContentPane().add(btnBack);

		btnNext = new JButton("dalej (spacja)");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				logic.getSubtrationRandomNumbers();

				btnNext.setVisible(false);
				btnEnter.setVisible(true);
				txtResult.requestFocus();
				txtCalculations.selectAll();
				txtCalculations.cut();
				txtResult.selectAll();
				txtResult.cut();
				txtResult.setBackground(Color.WHITE);
				logic.SubNumberOfTryes();
				logic.ASubGameSummary();
			}
		});
		btnNext.setForeground(Color.GREEN);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNext.setBounds(110, 550, 230, 55);
		btnNext.setVisible(false);
		getContentPane().add(btnNext);
		
		txtCalculations = new JTextField();
		txtCalculations.setHorizontalAlignment(SwingConstants.CENTER);
		txtCalculations.setFont(new Font("Tahoma", Font.PLAIN, 37));
		txtCalculations.setBounds(110, 361, 543, 74);
		getContentPane().add(txtCalculations);
		txtCalculations.setColumns(10);
		//txtCalculations.requestFocus();
		//txtCalculations.selectAll();
		//txtCalculations.cut();
		
		
		lblComments2 = new JLabel("Miejsce na Twoje obliczenia.");
		lblComments2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblComments2.setHorizontalAlignment(SwingConstants.CENTER);
		lblComments2.setBounds(110, 448, 543, 40);
		getContentPane().add(lblComments2);
		
		JTextArea txtInstructions = new JTextArea();
		txtInstructions.setFocusTraversalKeysEnabled(false);
		txtInstructions.setFocusable(false);
		txtInstructions.setBounds(110, 13, 543, 85);
		txtInstructions.setBackground(Color.YELLOW);
		txtInstructions.setWrapStyleWord(true);
		txtInstructions.setLineWrap(true);
		txtInstructions.setText("Witaj! W tej grze możesz zdobyć maksymalnie 20 punktów rozwiązując poprawnie 20 przykładów na odejmowanie. Powodzenia !!! :)");
		txtInstructions.setToolTipText("");
		txtInstructions.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		getContentPane().add(txtInstructions);
		
		lblExample = new JLabel("Przykład nr: ");
		lblExample.setHorizontalAlignment(SwingConstants.CENTER);
		lblExample.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblExample.setBounds(281, 154, 150, 40);
		getContentPane().add(lblExample);
		
		lblExampleNumb = new JLabel("1");
		lblExampleNumb.setForeground(Color.BLUE);
		lblExampleNumb.setHorizontalAlignment(SwingConstants.LEFT);
		lblExampleNumb.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblExampleNumb.setBounds(429, 154, 32, 40);
		getContentPane().add(lblExampleNumb);
		
		lblPoints = new JLabel("0");
		lblPoints.setEnabled(true);
		lblPoints.setBounds(639, 550, 15, 35);
		getContentPane().add(lblPoints);
		lblPoints.setVisible(false);
		
		JLabel lblMaxExplAmount = new JLabel("/20");
		lblMaxExplAmount.setHorizontalAlignment(SwingConstants.LEFT);
		lblMaxExplAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMaxExplAmount.setBounds(462, 154, 47, 40);
		getContentPane().add(lblMaxExplAmount);
		lblPoints.setVisible(false);

		logic.getSubtrationRandomNumbers();
	}

}
