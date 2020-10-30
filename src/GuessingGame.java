import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	private JTextField txtGuess; //textField for user's guess	
	private JLabel lblOutput;  //Label for too high or too low output
	private int theNumber;
	public void checkGuess()     //function to check too high or too low I/O
	{
		String guessText=txtGuess.getText();
		String message="";
		//check the guess for too low or too high or correct output
		int guess=Integer.parseInt(guessText);
		
		
		//too high
		if(guess>theNumber)
		{
			message =guess + "too high.Guess Again!";
			lblOutput.setText(message);
			
		}
		//too low
		else if(guess<theNumber)
		{
			message= guess + "too low.Guess Again!";
			lblOutput.setText(message);
			
		}
		
		//right case
		else
		{
			message= guess + "Guess was Right!Let's play again!";
			lblOutput.setText(message);
			newGame();
		}
		
		
	}
	public void newGame() //create a new random number 1 to 100
	{
		theNumber=(int)(Math.random()*100 +1);
		
		
	}
	
	public GuessingGame() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kshitij's Guessing Game\r\n");
		lblNewLabel.setBounds(0, 33, 436, 21);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		JButton btnGuess = new JButton("Guess\r\n");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
			
		});
		btnGuess.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGuess.setBounds(170, 160, 85, 21);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("Enter a number above and click guess\r\n");
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(80, 214, 279, 13);
		getContentPane().add(lblOutput);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 87, 394, 40);
		getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Guess a number between 1 to 100 :\r\n\r\n");
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtGuess = new JTextField();
		panel.add(txtGuess);
		txtGuess.setColumns(10);
	}

	public static void main(String[] args) {
		GuessingGame theGame= new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(430,330));
		theGame.setVisible(true);
		
		
		
		
		

	}
}
