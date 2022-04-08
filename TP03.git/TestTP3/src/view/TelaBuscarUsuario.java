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
import controller.ControllerLoging;
import javax.swing.JButton;
import models.Dados;
import view.TelaCadastroUsuario;
/**
 * Tela de buscar usuário
 * @author Maria Abritta e Thyago Moura 
 * @version 1.0 (Abril 2022)
 */
public class TelaBuscarUsuario {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBuscarUsuario window = new TelaBuscarUsuario();
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
	public TelaBuscarUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 238);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFuncionamento = new JLabel("Funcionamento");
		lblFuncionamento.setForeground(SystemColor.desktop);
		lblFuncionamento.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblFuncionamento.setBounds(92, 21, 312, 75);
		frame.getContentPane().add(lblFuncionamento);
		
		JLabel tiruloUm_1 = new JLabel("Funcionamento");
		tiruloUm_1.setForeground(new Color(51, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(82, 10, 302, 75);
		frame.getContentPane().add(tiruloUm_1);
		
		JLabel lblBusquePeloNome = new JLabel("Busque pelo nome do usuario que deseja encontrar:");
		lblBusquePeloNome.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblBusquePeloNome.setBounds(49, 96, 335, 14);
		frame.getContentPane().add(lblBusquePeloNome);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(49, 117, 335, 20);
		frame.getContentPane().add(textField);
		
		/**
		 * Tenta encontrar o usuário em questão.
		 */
		JButton check = new JButton("OK");
		check.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				TelaLoging.usuarioLogado = ControllerLoging.validarBusca(textField.getText());
				if (TelaLoging.usuarioLogado == null) {
					JOptionPane.showMessageDialog(check,
							"Usuario nao encontrado!");				
					} else {
					frame.dispose();
					JOptionPane.showMessageDialog(check,
							"Seu nome : " + TelaLoging.usuarioLogado.getNome() +
									"\nSeu email : " + TelaLoging.usuarioLogado.getEmail() +
									"\nSeu RG : " + TelaLoging.usuarioLogado.getRg() +
									"\nSeu CPF : " + TelaLoging.usuarioLogado.getCpf() +
									"\nSUA Senha : " + TelaLoging.usuarioLogado.getSenha() +
									"\nSeu Telefone : " + TelaLoging.usuarioLogado.getTelefone());
				}
				frame.dispose();
				TelaMenu.main(null);
			}
		});
		check.setFont(new Font("Cambria", Font.PLAIN, 11));
		check.setBackground(SystemColor.desktop);
		check.setBounds(171, 148, 89, 23);
		frame.getContentPane().add(check);
	}
}
