package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import controller.ControllerLoging;
import models.Usuario;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLoging {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	static Usuario usuarioLogado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoging window = new TelaLoging();
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
	public TelaLoging() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel tiruloUm_1 = new JLabel("Loging");
		tiruloUm_1.setForeground(SystemColor.desktop);
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(153, 13, 194, 75);
		frame.getContentPane().add(tiruloUm_1);

		JLabel lblLoging = new JLabel("Loging");
		lblLoging.setForeground(new Color(51, 204, 204));
		lblLoging.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblLoging.setBounds(143, 0, 204, 75);
		frame.getContentPane().add(lblLoging);

		JLabel tituloUm = new JLabel("Insira os dados necesarios ");
		tituloUm.setForeground(Color.BLACK);
		tituloUm.setFont(new Font("Elephant", Font.PLAIN, 17));
		tituloUm.setBackground(Color.CYAN);
		tituloUm.setBounds(110, 88, 239, 31);
		frame.getContentPane().add(tituloUm);

		JLabel lblParaEfetuarSeu = new JLabel("para efetuar seu loging: ");
		lblParaEfetuarSeu.setFont(new Font("Elephant", Font.PLAIN, 17));
		lblParaEfetuarSeu.setBounds(120, 114, 239, 13);
		frame.getContentPane().add(lblParaEfetuarSeu);

		JLabel tituloNome = new JLabel("Nome (Letras maiusculas):");
		tituloNome.setFont(new Font("Cambria", Font.PLAIN, 15));
		tituloNome.setBounds(53, 152, 176, 14);
		frame.getContentPane().add(tituloNome);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(53, 173, 335, 20);
		frame.getContentPane().add(textField);

		JLabel tituloSenha = new JLabel("Senha (Deve comecar com 3 letras maiusculas e ");
		tituloSenha.setVerticalAlignment(SwingConstants.BOTTOM);
		tituloSenha.setHorizontalAlignment(SwingConstants.LEFT);
		tituloSenha.setFont(new Font("Cambria", Font.PLAIN, 15));
		tituloSenha.setBounds(53, 214, 335, 14);
		frame.getContentPane().add(tituloSenha);

		JLabel lblTerminarCom = new JLabel("terminar com 4 numeros):");
		lblTerminarCom.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTerminarCom.setHorizontalAlignment(SwingConstants.LEFT);
		lblTerminarCom.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblTerminarCom.setBounds(53, 228, 335, 14);
		frame.getContentPane().add(lblTerminarCom);

		passwordField = new JPasswordField();
		passwordField.setBounds(53, 251, 335, 20);
		frame.getContentPane().add(passwordField);

		JButton check = new JButton("OK");
		check.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				TelaLoging.usuarioLogado = ControllerLoging.validarLogin(textField.getText(), passwordField.getText());
				if (TelaLoging.usuarioLogado == null) {
					// login deu errado, refazer login
				} else {
					frame.dispose();
					TelaMenu.main(null);
				}
			}
		});
		check.setFont(new Font("Cambria", Font.PLAIN, 11));
		check.setBackground(SystemColor.desktop);
		check.setBounds(171, 287, 89, 23);
		frame.getContentPane().add(check);
	}
}