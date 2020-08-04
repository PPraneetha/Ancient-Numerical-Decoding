import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;

public class MelaCalc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MelaCalc frame = new MelaCalc();
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
	public MelaCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 668);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Tell me about my ragam!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String S,F,swara1,swara2,swara3;
					int Findex, Sindex, FinalIndex; 
					S = textField.getText();
					F = textField_1.getText();
					
					String [] [] alphabets = {{"nya", "ka", "kha", "ga", "gha", "nga", "cha", "Cha", "ja", "Jha"}, 
							  {"na", "Ta", "Tha","Da", "Dha", "Na", "ta", "tha", "da", "dha"},
							  {"null","pa", "pha","ba","bha","ma", "null", "null", "null", "null", },
							  {"null","ya", "ra", "la", "va", "sha", "Sha", "sa", "ha","null"}};
					
					Findex = MelakarthaCalc.getFirstIndex(alphabets, F);
					Sindex = MelakarthaCalc.getSecondIndex(alphabets, S);
					//FinalIndex = MelakarthaCalc.concat(Findex, Sindex);
					String s1 = Integer.toString(Sindex);
					String s2 = Integer.toString(Findex);
					
					String s = s2.concat(s1); //prints Index number
					
					int Index = Integer.parseInt(s);
					swara1 = MelakarthaCalc.swaraSthanam1(Index);
					swara2 = MelakarthaCalc.swaraSthanam2(Index);
					swara3 = MelakarthaCalc.swaraSthanam3(Index);
					
					textField_2.setText("This is the " + s +"th Melakartha raga. "+ "The swara sthanas are as follows: " + "S " + swara1 + " " + swara2 + " P " + " " + swara3 + " S");
					
			}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please check the chart and enter a valid syllable.");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(742, 446, 204, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Enter 1st syllable: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(658, 282, 140, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter 2nd syllable: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(658, 378, 140, 23);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(808, 285, 160, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(808, 369, 160, 46);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(56, 545, 912, 60);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Welcome to the Katapayadi Wizard!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(259, 25, 443, 41);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtrThekatapayadiSystem = new JTextArea();
		txtrThekatapayadiSystem.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtrThekatapayadiSystem.setWrapStyleWord(true);
		txtrThekatapayadiSystem.setText("\r\n The \"ka-ta-pa-ya-di\" system was used by ancient Indian Mathematicians and Grammarians to  map names to numbers. In the 16th century, Sri \r\n Ramaamaatya propsed the Melakartha system for the first time. Vidwaan  Venkata Makhin  complied these ragas  sequentially and Govindaacharya \r\n standardized these 72 ragams. \r\n\r\n To use this wizard: Refer to the syllable chart below to match the 1st two syllables of the ragam    you have in mind (i.e. The 1st two syllables of \r\n Dheerasankarabharam would be \"dha\" and \"ra\").");
		txtrThekatapayadiSystem.setBounds(56, 76, 912, 149);
		contentPane.add(txtrThekatapayadiSystem);
		
		lblNewLabel_3 = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/swara Table.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(image));
		lblNewLabel_3.setBounds(56, 155, 562, 445);
		contentPane.add(lblNewLabel_3);
	}
}
