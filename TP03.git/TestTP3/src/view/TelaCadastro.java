package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import controller.ControllerPagamentos;
import controller.ControllerUsuarios;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import models.Usuario;

public class TelaCadastro {

	private JFrame frame;
	public JTextField txtNome;
	public JTextField txtEmail;
	public JTextField txtRG;
	public JTextField txtCPF;
	public JTextField txtTel;
	public JPasswordField senha;
	static public String[][] usuario = new String[50][50];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro window = new TelaCadastro();
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
	public TelaCadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		ControllerUsuarios control = new ControllerUsuarios();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 706);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel tituloUm = new JLabel("Insira os dados necesarios ");
		tituloUm.setFont(new Font("Elephant", Font.PLAIN, 17));
		tituloUm.setForeground(Color.BLACK);
		tituloUm.setBackground(Color.CYAN);
		tituloUm.setBounds(111, 99, 239, 31);
		frame.getContentPane().add(tituloUm);

		JLabel tituloDois = new JLabel("para efetuar seu cadastro: ");
		tituloDois.setFont(new Font("Elephant", Font.PLAIN, 17));
		tituloDois.setBounds(121, 125, 239, 13);
		frame.getContentPane().add(tituloDois);

		JLabel tituloNome = new JLabel("Nome (Letras maiusculas):");
		tituloNome.setFont(new Font("Cambria", Font.PLAIN, 15));
		tituloNome.setBounds(46, 165, 176, 14);
		frame.getContentPane().add(tituloNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(46, 186, 335, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel_2_1 = new JLabel("E-mail:");
		lblNewLabel_2_1.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(46, 246, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(46, 267, 335, 20);
		frame.getContentPane().add(txtEmail);

		JLabel tituloRG = new JLabel("RG:");
		tituloRG.setVerticalAlignment(SwingConstants.BOTTOM);
		tituloRG.setFont(new Font("Cambria", Font.PLAIN, 15));
		tituloRG.setBounds(46, 327, 46, 14);
		frame.getContentPane().add(tituloRG);

		txtRG = new JTextField();
		txtRG.setColumns(10);
		txtRG.setBounds(46, 348, 335, 20);
		frame.getContentPane().add(txtRG);

		JLabel tituloCPF = new JLabel("CPF:");
		tituloCPF.setHorizontalAlignment(SwingConstants.LEFT);
		tituloCPF.setVerticalAlignment(SwingConstants.BOTTOM);
		tituloCPF.setFont(new Font("Cambria", Font.PLAIN, 15));
		tituloCPF.setBounds(46, 408, 46, 14);
		frame.getContentPane().add(tituloCPF);

		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(46, 429, 335, 20);
		frame.getContentPane().add(txtCPF);

		JLabel tituloTel = new JLabel("Telefone:");
		tituloTel.setHorizontalAlignment(SwingConstants.TRAILING);
		tituloTel.setVerticalAlignment(SwingConstants.BOTTOM);
		tituloTel.setFont(new Font("Cambria", Font.PLAIN, 15));
		tituloTel.setBounds(46, 489, 59, 14);
		frame.getContentPane().add(tituloTel);

		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(46, 510, 335, 20);
		frame.getContentPane().add(txtTel);

		JLabel tituloSenha = new JLabel("Senha (Deve comecar com 3 letras maiusculas e ");
		tituloSenha.setVerticalAlignment(SwingConstants.BOTTOM);
		tituloSenha.setHorizontalAlignment(SwingConstants.LEFT);
		tituloSenha.setFont(new Font("Cambria", Font.PLAIN, 15));
		tituloSenha.setBounds(46, 570, 335, 14);
		frame.getContentPane().add(tituloSenha);

		senha = new JPasswordField();
		senha.setBounds(46, 607, 335, 20);
		frame.getContentPane().add(senha);

		JButton check = new JButton("OK");
		check.setFont(new Font("Cambria", Font.PLAIN, 11));
		check.setBackground(SystemColor.desktop);
		check.setBounds(181, 633, 89, 23);
		check.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String msgErro = "";

				if (txtNome.getText().length() == 0 || txtEmail.getText().length() == 0 || txtRG.getText().length() == 0
						|| txtCPF.getText().length() == 0 || txtTel.getText().length() == 0
						|| senha.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "Alguma informacao esta vazia! Preencha todos os campos!", "Falta de dados",
							JOptionPane.ERROR_MESSAGE);

					return;
				}
				if (!control.validarNome(txtNome.getText())) {
					msgErro += "Nome invalido\n";
				}
				if (!control.validarEmail(txtEmail.getText())) {
					msgErro += "Email invalido\n";
				}
				if (!control.validarRg(txtRG.getText())) {
					msgErro += "Rg invalido\n";
				}
				if (!control.validarCpf(txtCPF.getText())) {
					msgErro += "Cpf invalido\n";
				}
				if (!control.validarTelefone(txtTel.getText())) {
					msgErro += "Telefone invalido\n";
				}
				if (!control.validarSenha(senha.getText())) {
					System.out.println(senha.getPassword());
					msgErro += "Senha invalida\n";
				}

				if (msgErro.length() > 0) {
					JOptionPane.showMessageDialog(null, msgErro, "ERRO", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Confirmar Cadastro", "Deseja Confirmar o Cadastro ?",
							JOptionPane.DEFAULT_OPTION);
					//registrar os dados no back
					Usuario.usuario[ControllerUsuarios.qtdUser][0] = txtNome.getText();
					Usuario.usuario[ControllerUsuarios.qtdUser][1] = txtEmail.getText();
					Usuario.usuario[ControllerUsuarios.qtdUser][2] = txtRG.getText();
					Usuario.usuario[ControllerUsuarios.qtdUser][3] = txtCPF.getText();
					Usuario.usuario[ControllerUsuarios.qtdUser][4] = senha.getText();
					Usuario.usuario[ControllerUsuarios.qtdUser][5] = txtTel.getText();
					//contar usuarios cadastrados
					ControllerUsuarios.contaUser();
					//Registar os nomes no array de pagamento
					ControllerPagamentos.dadosPagamento();
					//outros
					frame.dispose();
					TelaMenu.main(null);
				}
			}
		});
		
		frame.getContentPane().add(check);

		JLabel lblTerminarCom = new JLabel("terminar com 4 numeros):");
		lblTerminarCom.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTerminarCom.setHorizontalAlignment(SwingConstants.LEFT);
		lblTerminarCom.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblTerminarCom.setBounds(46, 584, 335, 14);
		frame.getContentPane().add(lblTerminarCom);

		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setForeground(SystemColor.desktop);
		lblCadastro.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblCadastro.setBounds(146, 25, 204, 75);
		frame.getContentPane().add(lblCadastro);

		JLabel tiruloUm_1 = new JLabel("Cadastro");
		tiruloUm_1.setForeground(new Color(51, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(136, 11, 194, 75);
		frame.getContentPane().add(tiruloUm_1);
	}

	@SuppressWarnings("unused")
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}