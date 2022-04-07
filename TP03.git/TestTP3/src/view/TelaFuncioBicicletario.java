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
import controller.ControllerPagamentos;
import controller.ControllerUsuarios;
import models.Usuario;
import javax.swing.JButton;
import models.Bicicletario;

public class TelaFuncioBicicletario {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFuncioBicicletario window = new TelaFuncioBicicletario();
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
	public TelaFuncioBicicletario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Bicicletario control = new Bicicletario(null, null);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 229);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel tiruloUm_1 = new JLabel("Funcionamento");
		tiruloUm_1.setForeground(SystemColor.desktop);
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(80, 10, 302, 75);
		frame.getContentPane().add(tiruloUm_1);
		
		JLabel lblFuncionamento = new JLabel("Funcionamento");
		lblFuncionamento.setForeground(new Color(51, 204, 255));
		lblFuncionamento.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblFuncionamento.setBounds(70, 0, 312, 75);
		frame.getContentPane().add(lblFuncionamento);
		
		JLabel lblQ = new JLabel("Qual horario voce deseja ir ao bicicletario?:");
		lblQ.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblQ.setBounds(47, 96, 312, 14);
		frame.getContentPane().add(lblQ);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(47, 117, 335, 20);
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
				if (control.StatusFuncionamento(textField.getText())) {
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
				TelaMenu.main(null);
				}
		});
		
		frame.getContentPane().add(check);
		check.setFont(new Font("Cambria", Font.PLAIN, 11));
		check.setBackground(SystemColor.desktop);
		check.setBounds(169, 148, 89, 23);
		frame.getContentPane().add(check);
	}
}
