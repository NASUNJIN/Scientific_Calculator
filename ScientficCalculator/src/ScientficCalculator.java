import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class ScientficCalculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientficCalculator window = new ScientficCalculator();
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
	public ScientficCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("-윤고딕320", Font.PLAIN, 12));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTFIC CALCULATOR");
		lblNewLabel.setFont(new Font("-윤고딕330", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 10, 296, 40);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 60, 405, 70);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Sin");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton.setBounds(10, 140, 73, 70);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_1.setBounds(10, 219, 73, 70);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("0");
		btnNewButton_2.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_2.setBounds(10, 299, 73, 70);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_3.setBounds(10, 379, 73, 70);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u221A");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_4.setBounds(10, 459, 73, 70);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnLog = new JButton("log");
		btnLog.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnLog.setBounds(10, 539, 73, 70);
		frame.getContentPane().add(btnLog);
		
		JButton btnIn = new JButton("In");
		btnIn.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnIn.setBounds(10, 619, 73, 70);
		frame.getContentPane().add(btnIn);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnCos.setBounds(93, 140, 73, 70);
		frame.getContentPane().add(btnCos);
		
		JButton btnx_1 = new JButton("1/x");
		btnx_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnx_1.setBounds(93, 219, 73, 70);
		frame.getContentPane().add(btnx_1);
		
		JButton btnNewButton_9 = new JButton("(");
		btnNewButton_9.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_9.setBounds(93, 299, 73, 70);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("7");
		btnNewButton_10.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_10.setBounds(93, 379, 73, 70);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("4");
		btnNewButton_11.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_11.setBounds(93, 459, 73, 70);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("1");
		btnNewButton_12.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_12.setBounds(93, 539, 73, 70);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("+/-");
		btnNewButton_13.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_13.setBounds(93, 619, 73, 70);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnTan.setBounds(176, 140, 73, 70);
		frame.getContentPane().add(btnTan);
		
		JButton btnx = new JButton("|x|");
		btnx.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnx.setBounds(176, 219, 73, 70);
		frame.getContentPane().add(btnx);
		
		JButton btnNewButton_16 = new JButton(")");
		btnNewButton_16.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_16.setBounds(176, 299, 73, 70);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("8");
		btnNewButton_17.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_17.setBounds(176, 379, 73, 70);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("5");
		btnNewButton_18.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_18.setBounds(176, 459, 73, 70);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("2");
		btnNewButton_19.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_19.setBounds(176, 539, 73, 70);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("0");
		btnNewButton_20.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_20.setBounds(176, 619, 73, 70);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnC.setBounds(259, 140, 73, 70);
		frame.getContentPane().add(btnC);
		
		JButton btnExp = new JButton("exp");
		btnExp.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnExp.setBounds(259, 219, 73, 70);
		frame.getContentPane().add(btnExp);
		
		JButton btnN = new JButton("n!");
		btnN.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnN.setBounds(259, 299, 73, 70);
		frame.getContentPane().add(btnN);
		
		JButton btnNewButton_24 = new JButton("9");
		btnNewButton_24.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_24.setBounds(259, 379, 73, 70);
		frame.getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("6");
		btnNewButton_25.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_25.setBounds(259, 459, 73, 70);
		frame.getContentPane().add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("3");
		btnNewButton_26.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_26.setBounds(259, 539, 73, 70);
		frame.getContentPane().add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton(".");
		btnNewButton_27.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_27.setBounds(259, 619, 73, 70);
		frame.getContentPane().add(btnNewButton_27);
		
		JButton btnDel = new JButton("del");
		btnDel.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnDel.setBounds(342, 140, 73, 70);
		frame.getContentPane().add(btnDel);
		
		JButton btnMod = new JButton("mod");
		btnMod.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnMod.setBounds(342, 219, 73, 70);
		frame.getContentPane().add(btnMod);
		
		JButton btnNewButton_30 = new JButton("/");
		btnNewButton_30.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_30.setBounds(342, 299, 73, 70);
		frame.getContentPane().add(btnNewButton_30);
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnX.setBounds(342, 379, 73, 70);
		frame.getContentPane().add(btnX);
		
		JButton btnNewButton_32 = new JButton("-");
		btnNewButton_32.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_32.setBounds(342, 459, 73, 70);
		frame.getContentPane().add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("+");
		btnNewButton_33.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_33.setBounds(342, 539, 73, 70);
		frame.getContentPane().add(btnNewButton_33);
		
		JButton btnNewButton_34 = new JButton("=");
		btnNewButton_34.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		btnNewButton_34.setBounds(342, 619, 73, 70);
		frame.getContentPane().add(btnNewButton_34);
		frame.setBounds(100, 100, 437, 732);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
