package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;

public class Calc {

	private JFrame frame;
	private JTextField tf;
	private JTextField tf2;
	private JLabel holder;
	double firstnum;
	double secondnum;
	double result;
	double result2;
	double hold1;
	double hold2;
	String answer;
	String oper;
	
	

	
	
	
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 324, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("mayowa's calc");
		
		
		tf = new JTextField();
		tf.setBorder(null);
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tf.setBounds(10, 86, 277, 62);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = tf.getText() + btn7.getText();
				tf.setText(number);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn7.setBounds(10, 159, 63, 56);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = tf.getText() + btn8.getText();
				tf.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn8.setBounds(83, 159, 63, 56);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = tf.getText() + btn9.getText();
				tf.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn9.setBounds(156, 159, 63, 56);
		frame.getContentPane().add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				holder.getText().valueOf(firstnum);
				
				if (holder.getText().equals(null)) {
				oper = "+";
				firstnum = Double.parseDouble(tf.getText());
				tf.setText("");
				tf2.setText(firstnum + oper);
				
				}
				else if (oper.equals("+")){
					secondnum = Double.parseDouble(tf.getText());
					firstnum = (secondnum) + (firstnum);
					tf.setText("");
					oper = "+";
					tf2.setText(firstnum + oper);	
				}
				
				else if (oper.equals("-")){
					secondnum = Double.parseDouble(tf.getText());
					firstnum = (secondnum) - (firstnum);
					tf.setText("");
					oper = "+";
					tf2.setText(firstnum + oper);	
				}
				
				else if (oper.equals("/")){
					secondnum = Double.parseDouble(tf.getText());
					firstnum = (secondnum) / (firstnum);
					tf.setText("");
					oper = "+";
					tf2.setText(firstnum + oper);	
				}
				
				else if (oper.equals("*")){
					secondnum = Double.parseDouble(tf.getText());
					firstnum = (secondnum) * (firstnum);
					tf.setText("");
					oper = "+";
					tf2.setText(firstnum + oper);	
				}
				
				else if (oper.equals("%")){
					secondnum = Double.parseDouble(tf.getText());
					firstnum = (secondnum) % (firstnum);
					tf.setText("");
					oper = "+";
					tf2.setText(firstnum + oper);	
				}
	
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnplus.setBounds(228, 159, 63, 56);
		frame.getContentPane().add(btnplus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = tf.getText() + btn4.getText();
				tf.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn4.setBounds(10, 226, 63, 56);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = tf.getText() + btn5.getText();
				tf.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn5.setBounds(83, 226, 63, 56);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = tf.getText() + btn6.getText();
				tf.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn6.setBounds(156, 226, 63, 56);
		frame.getContentPane().add(btn6);
		
		JButton btnmin = new JButton("-");
		btnmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				holder.getText().valueOf(firstnum);
				
				if (holder.getText().equals(null)) {
				oper = "-";
				firstnum = Double.parseDouble(tf.getText());
				tf.setText("");
				tf2.setText(firstnum + oper);
				
				}
				else {
					secondnum = Double.parseDouble(tf.getText());
					firstnum = firstnum - secondnum;
					tf.setText("");
					oper = "-";
					tf2.setText(firstnum + oper);
					
				}
			}
		});
		btnmin.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnmin.setBounds(228, 226, 63, 56);
		frame.getContentPane().add(btnmin);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = tf.getText() + btn1.getText();
				tf.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn1.setBounds(10, 293, 63, 56);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = tf.getText() + btn2.getText();
				tf.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn2.setBounds(83, 293, 63, 56);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = tf.getText() + btn3.getText();
				tf.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn3.setBounds(156, 293, 63, 56);
		frame.getContentPane().add(btn3);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				holder.getText().valueOf(firstnum);
				
				if (holder.getText().equals(null)) {
				oper = "*";
				firstnum = Double.parseDouble(tf.getText());
				tf.setText("");
				tf2.setText(firstnum + oper);
				
				}
				else {
					secondnum = Double.parseDouble(tf.getText());
					firstnum = firstnum * secondnum;
					tf.setText("");
					oper = "*";
					tf2.setText(firstnum + oper);
					
				}
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnmul.setBounds(228, 293, 63, 56);
		frame.getContentPane().add(btnmul);
		
		JButton btnC = new JButton(" c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(null);
				tf2.setText(null);
				firstnum = 0.00;
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnC.setBounds(10, 359, 63, 56);
		frame.getContentPane().add(btnC);
		
		JButton button_12 = new JButton("0");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = tf.getText() + button_12.getText();
				tf.setText(number);
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_12.setBounds(83, 359, 63, 56);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("%");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				holder.getText().valueOf(firstnum);
				
				if (holder.getText().equals(null)) {
				oper = "%";
				firstnum = Double.parseDouble(tf.getText());
				tf.setText("");
				tf2.setText(firstnum + oper);
				
				}
				else {
					secondnum = Double.parseDouble(tf.getText());
					firstnum =  firstnum % secondnum;
					tf.setText("");
					oper = "%";
					tf2.setText(firstnum + oper);
					
				}
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_13.setBounds(156, 359, 63, 56);
		frame.getContentPane().add(button_13);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				holder.getText().valueOf(firstnum);
				
				if (holder.getText().equals(null)) {
				oper = "/";
				firstnum = Double.parseDouble(tf.getText());
				tf.setText("");
				tf2.setText(firstnum + oper);
				
				}
				else {
					secondnum = Double.parseDouble(tf.getText());
					firstnum =  firstnum / secondnum;
					tf.setText("");
					oper = "/";
					tf2.setText(firstnum + oper);
					
				}
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 17));
		btndiv.setBounds(228, 359, 63, 56);
		frame.getContentPane().add(btndiv);
		
		JButton btnufe = new JButton("←");
		btnufe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String back =  null;
				if (tf.getText().length()>1) {
					StringBuilder str = new StringBuilder(tf.getText());
					str.deleteCharAt(tf.getText().length() - 1);
					back = str.toString();
					tf.setText(back);
				}
				else return;
				
				
				
			}
		});
		btnufe.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnufe.setBounds(10, 426, 96, 56);
		frame.getContentPane().add(btnufe);
		
		JButton button_17 = new JButton("=");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(tf.getText());
				if (oper.equals("+")) {
					result = firstnum + secondnum;
					answer = String.format("%.10f", result);
					tf.setText(answer);
					tf2.setText(firstnum + oper + secondnum);
				}
				
				else if (oper.equals("-")) {
					result = firstnum - secondnum;
					answer = String.format("%.10f", result);
					tf.setText(answer);
					tf2.setText(firstnum + oper + secondnum);
				}
				
				else if (oper.equals("*")) {
					result = firstnum * secondnum;
					answer = String.format("%.10f", result);
					tf.setText(answer);
					tf2.setText(firstnum + oper + secondnum);
				}
				else if (oper.equals("/")) {
					result = firstnum / secondnum;
					answer = String.format("%.10f", result);
					tf.setText(answer);
					tf2.setText(firstnum + oper + secondnum);
				}
				else if (oper.equals("%")) {
					result = firstnum % secondnum;
					answer = String.format("%.10f", result);
					tf.setText(answer);
					tf2.setText(firstnum + oper + secondnum);
				}
			
			}
			
			
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_17.setBounds(228, 426, 63, 56);
		frame.getContentPane().add(button_17);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = tf.getText() + btndot.getText();
				tf.setText(number);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 17));
		btndot.setBounds(156, 426, 63, 56);
		frame.getContentPane().add(btndot);
		
		tf2 = new JTextField();
		tf2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tf2.setBackground(Color.WHITE);
		tf2.setBorder(null);
		tf2.setBounds(10, 11, 277, 75);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		holder = new JLabel("holder");
		holder.setVisible(false);
		holder.setBounds(108, 426, 41, 56);
		frame.getContentPane().add(holder);
	}
}
