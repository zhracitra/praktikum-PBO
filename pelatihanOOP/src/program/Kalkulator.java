package program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Kalkulator {

	private JFrame frame;
	private JTextField textField;

	// inisialisasi
	double firstnum,secondnum,result;
	String operation,answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
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
	public Kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 492, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn7.getText();
				textField.setText(Number);
			}
		});
		btn7.setBounds(39, 97, 85, 31);
		frame.getContentPane().add(btn7);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(12, 10, 461, 63);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn4.getText();
				textField.setText(Number);
			}
		});
		btn4.setBounds(39, 138, 85, 31);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn1.getText();
				textField.setText(Number);
			}
		});
		btn1.setBounds(39, 179, 85, 31);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn0.getText();
				textField.setText(Number);
			}
		});
		btn0.setBounds(39, 220, 85, 31);
		frame.getContentPane().add(btn0);
		
		JButton btnclear = new JButton("C");
		btnclear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setBounds(146, 220, 85, 31);
		frame.getContentPane().add(btnclear);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn2.getText();
				textField.setText(Number);
			}
		});
		btn2.setBounds(146, 179, 85, 31);
		frame.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn5.getText();
				textField.setText(Number);
			}
		});
		btn5.setBounds(146, 138, 85, 31);
		frame.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn8.getText();
				textField.setText(Number);
			}
		});
		btn8.setBounds(146, 97, 85, 31);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn9.getText();
				textField.setText(Number);
			}
		});
		btn9.setBounds(251, 97, 85, 31);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn6.getText();
				textField.setText(Number);
			}
		});
		btn6.setBounds(251, 138, 85, 31);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn3.getText();
				textField.setText(Number);
			}
		});
		btn3.setBounds(251, 179, 85, 31);
		frame.getContentPane().add(btn3);
		
		JButton btnhasil = new JButton("=");
		btnhasil.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnhasil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-") {
				result = firstnum - secondnum;
				answer = String.format("%.2f", result);
				textField.setText(answer);
				}
				else if(operation == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnhasil.setBounds(251, 220, 85, 31);
		frame.getContentPane().add(btnhasil);
		
		JButton btnplus = new JButton("+");
		btnplus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnplus.setBounds(359, 97, 85, 31);
		frame.getContentPane().add(btnplus);
		
		JButton btnkurang = new JButton("-");
		btnkurang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnkurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnkurang.setBounds(359, 138, 85, 31);
		frame.getContentPane().add(btnkurang);
		
		JButton btnkali = new JButton("*");
		btnkali.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnkali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnkali.setBounds(359, 179, 85, 31);
		frame.getContentPane().add(btnkali);
		
		JButton btnbagi = new JButton("/");
		btnbagi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnbagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnbagi.setBounds(359, 220, 85, 31);
		frame.getContentPane().add(btnbagi);
	}
}
