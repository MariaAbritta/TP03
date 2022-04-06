package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import models.Bicicleta;
import models.Bicicletario;

import javax.swing.JButton;

public class TelaAlugarBikesSarah {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 * @return 
	 */
	public static String main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlugarBikesSarah window = new TelaAlugarBikesSarah();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return null;
	}

	/**
	 * Create the application.
	 */
	public TelaAlugarBikesSarah() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Bicicleta control = new Bicicleta(null, 0);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 231);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBikesSarah = new JLabel("Bikes Sarah");
		lblBikesSarah.setForeground(SystemColor.desktop);
		lblBikesSarah.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblBikesSarah.setBounds(94, 13, 312, 75);
		frame.getContentPane().add(lblBikesSarah);
		
		JLabel tiruloUm_1 = new JLabel("Bikes Sarah");
		tiruloUm_1.setForeground(new Color(51, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(84, 0, 302, 75);
		frame.getContentPane().add(tiruloUm_1);
		
		JLabel lblQ = new JLabel("Quantas bikes deseja alugar?");
		lblQ.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblQ.setBounds(46, 96, 312, 14);
		frame.getContentPane().add(lblQ);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(46, 117, 335, 20);
		frame.getContentPane().add(textField);
		
		JButton check = new JButton("OK");
		check.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String msgErro = "";
				String msgOk = "";

				if (textField.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "Preencha todos o campo!", "Falta de dados",
							JOptionPane.ERROR_MESSAGE);

					return;
				}
				if (control.alugarBikessarah(textField.getText())) {
					msgErro += "Inativo!\n";
				}
				if (msgErro.length() > 0) {
					JOptionPane.showMessageDialog(null, msgErro, ":(", JOptionPane.INFORMATION_MESSAGE);
				}
				if (!control.StatusFuncionamento(textField.getText())) {
					msgOk += "Ativo!\n";
				}
				if (msgOk.length() > 0) {
					JOptionPane.showMessageDialog(null, msgOk, ":)", JOptionPane.INFORMATION_MESSAGE);
				}
					frame.dispose();
					TelaBicicletario.main(null);
				}
		});
		check.setFont(new Font("Cambria", Font.PLAIN, 11));
		check.setBackground(SystemColor.desktop);
		check.setBounds(168, 148, 89, 23);
		frame.getContentPane().add(check);
	}
}
