import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
public class UiMulti extends JFrame {

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
	public JLabel lblExample;
	public JLabel lblExampleNumb;
	public JLabel lblPoints;
	public JLabel lblTest;
	public JLabel lblTestSize;

	

	public UiMulti() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setTitle("Gry Matematyczne Nikoli v1.0");
		getContentPane().setLayout(null);

		lblComments = new JLabel(" Wpisz prawidłowy wynik i wciścnij 'enter'.");
		lblComments.setBounds(0, 111, 782, 40);
		lblComments.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblComments.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblComments);

		lblValue1 = new JLabel("");
		lblValue1.setBounds(110, 207, 99, 141);
		lblValue1.setFont(new Font("Tahoma", Font.PLAIN, 80));
		lblValue1.setHorizontalAlignment(SwingConstants.CENTER);
		lblValue1.setVisible(true);
		getContentPane().add(lblValue1);


		lblSignOfAction = new JLabel("*");
		lblSignOfAction.setBounds(221, 225, 99, 141);
		lblSignOfAction.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignOfAction.setFont(new Font("Tahoma", Font.PLAIN, 80));
		lblSignOfAction.setVisible(true);
		getContentPane().add(lblSignOfAction);

		lblValue2 = new JLabel("");
		lblValue2.setBounds(332, 207, 99, 141);
		lblValue2.setHorizontalAlignment(SwingConstants.CENTER);
		lblValue2.setFont(new Font("Tahoma", Font.PLAIN, 80));
		lblValue2.setVisible(true);
		getContentPane().add(lblValue2);

		lblEqualSign = new JLabel("=");
		lblEqualSign.setBounds(443, 207, 99, 141);
		lblEqualSign.setHorizontalAlignment(SwingConstants.CENTER);
		lblEqualSign.setFont(new Font("Tahoma", Font.PLAIN, 80));
		lblEqualSign.setVisible(true);
		getContentPane().add(lblEqualSign);

		txtResult = new JTextField();
		txtResult.setBounds(554, 207, 99, 141);
		txtResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.checkResultMulti();
				btnEnter.setVisible(false);
				btnNext.setVisible(true);
				btnNext.requestFocus();
			}
		});
		txtResult.setFont(new Font("Tahoma", Font.PLAIN, 80));
		getContentPane().add(txtResult);
		txtResult.setColumns(10);
		txtResult.setVisible(true);
		txtResult.requestFocus();
		txtResult.selectAll();
		txtResult.cut();
		txtResult.setBackground(Color.WHITE);

		btnEnter = new JButton("enter");
		btnEnter.setBounds(110, 537, 230, 55);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.checkResultMulti();
				btnEnter.setVisible(false);
				btnNext.setVisible(true);
				
			}
		});
		btnEnter.setForeground(Color.GREEN);
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEnter.setVisible(true);
		getContentPane().add(btnEnter);

		btnBack = new JButton("powrót");
		btnBack.setBounds(423, 537, 230, 55);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnBack.setForeground(Color.RED);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setVisible(true);
		getContentPane().add(btnBack);

		btnNext = new JButton("dalej (spacja)");
		btnNext.setBounds(110, 537, 230, 55);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				btnNext.setVisible(false);
				btnEnter.setVisible(true);
				txtResult.requestFocus();
				txtResult.selectAll();
				txtResult.cut();
				txtResult.setBackground(Color.WHITE);
				logic.MultiNumberOfTryes();
				logic.MultiGameSummary();
				
			}
		});
		btnNext.setForeground(Color.GREEN);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNext.setVisible(false);
		getContentPane().add(btnNext);
		
		JTextArea txtInstructions = new JTextArea();
		txtInstructions.setFocusTraversalKeysEnabled(false);
		txtInstructions.setFocusable(false);
		txtInstructions.setBounds(110, 13, 543, 85);
		txtInstructions.setBackground(Color.YELLOW);
		txtInstructions.setWrapStyleWord(true);
		txtInstructions.setLineWrap(true);
		txtInstructions.setText("Witaj! W tej grze możesz zdobyć maksymalnie 20 punktów rozwiązując poprawnie 20 przykładów na mnożenie. Powodzenia !!! :)");
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
		
		JLabel lblMaxExplAmount = new JLabel("/20");
		lblMaxExplAmount.setHorizontalAlignment(SwingConstants.LEFT);
		lblMaxExplAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMaxExplAmount.setBounds(462, 154, 47, 40);
		getContentPane().add(lblMaxExplAmount);
		
		lblTest = new JLabel("");
		lblTest.setHorizontalAlignment(SwingConstants.LEFT);
		lblTest.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTest.setBounds(575, 423, 78, 40);
		getContentPane().add(lblTest);
		
		lblTestSize = new JLabel("");
		lblTestSize.setHorizontalAlignment(SwingConstants.LEFT);
		lblTestSize.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTestSize.setBounds(98, 423, 78, 40);
		getContentPane().add(lblTestSize);
		lblPoints.setVisible(false);

		logic.btnChoise_1Action();
		logic.setNumbersToList();
	}
}
