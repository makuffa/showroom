package showroom;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Calculator
{

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Calculator window = new Calculator();
					
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.																					setBounds(100, 100, 271, 358);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.																					setBounds(10, 11, 234, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length() > 0) 
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 13));
		btnBackspace.																			setBounds(10, 66,60, 50);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn7.																					setBounds(10, 115,60, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn4.																					setBounds(10, 164,60, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn1.																					setBounds(10, 213,60, 50);
		frame.getContentPane().add(btn1);
		
		
		JButton btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_clear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_clear.																					setBounds(69, 66,60, 50);
		frame.getContentPane().add(btn_clear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn8.																					setBounds(69, 115,60, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn5.																					setBounds(69, 164,60, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn2.																					setBounds(69, 213,60, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn0.																					setBounds(10, 262,60, 50);
		frame.getContentPane().add(btn0);
		
		JButton btn_doubleZero = new JButton("00");
		btn_doubleZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_doubleZero.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_doubleZero.																					setBounds(128, 66,60, 50);
		frame.getContentPane().add(btn_doubleZero);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn9.																					setBounds(128, 115,60, 50);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn6.																					setBounds(128, 164,60, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn3.																					setBounds(128, 213,60, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_dot.getText();
				textField.setText(number);
			}
		});
		btn_dot.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_dot.																					setBounds(69, 262,60, 50);
		frame.getContentPane().add(btn_dot);
		
		JButton btn_divide = new JButton("/");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btn_divide.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_divide.																					setBounds(187, 66,60, 50);
		frame.getContentPane().add(btn_divide);
		
		JButton btn_multiply = new JButton("*");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btn_multiply.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_multiply.																					setBounds(187, 115,60, 50);
		frame.getContentPane().add(btn_multiply);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btn_minus.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_minus.																					setBounds(187, 164,60, 50);
		frame.getContentPane().add(btn_minus);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btn_plus.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_plus.																					setBounds(187, 213,60, 50);
		frame.getContentPane().add(btn_plus);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation=="+") 
				{
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);	
				}
				else if(operation=="-") 
				{
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);	
				}
				else if(operation=="*") 
				{
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);	
				}
				else if(operation=="/") 
				{
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);	
				}
				else if(operation=="%") 
				{
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);	
				}
			}
		});
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_equal.																					setBounds(128, 262,60, 50);
		frame.getContentPane().add(btn_equal);
		
		
		JButton btn_percent1 = new JButton("%");
		btn_percent1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btn_percent1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_percent1.setBounds(187, 262, 60, 50);
		frame.getContentPane().add(btn_percent1);
	}
}

