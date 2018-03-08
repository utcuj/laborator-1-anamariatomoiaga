package gara;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel window = new Panel();
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
	public Panel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Gara gara = new Gara();
		Tren t1 = new Tren("AC1","10:01","Berlin");
		Tren t2 = new Tren("AC2","05:01","Munchen");
		Tren t3 = new Tren("AC3","16:01","Frankfurt");
		Tren t4 = new Tren("AC4","10:31","Dusseldorf");
		Tren t5 = new Tren("AC5","13:01","Koln");
		gara.add(t1);
		gara.add(t2);
		gara.add(t3);
		gara.add(t4);
		gara.add(t5);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 375, 225);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCodTren = new JLabel("Cod Tren");
		lblCodTren.setBounds(43, 42, 64, 21);
		frame.getContentPane().add(lblCodTren);
		
		textField = new JTextField();
		textField.setBounds(99, 42, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Afisare");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cod = textField.getText();
				String tren = gara.find(cod);
				textField_1.setText(tren);
			}
		});
		btnNewButton.setBounds(206, 41, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(74, 88, 206, 87);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
