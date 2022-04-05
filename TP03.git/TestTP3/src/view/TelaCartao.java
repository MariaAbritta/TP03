package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import controller.ControllerPagamentos;
import controller.ControllerUsuarios;
import models.Pagamento;

public class TelaCartao {

	private JFrame frame;
	private JTextField textForma;
	private JTextField txtNumCartao;
	private JTextField txtNome;
	private JTextField textCVV;
	static public String[][] cartao = new String[50][50];



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCartao window = new TelaCartao();
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
	public TelaCartao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ControllerPagamentos control = new ControllerPagamentos();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel tiruloUm_1 = new JLabel("Cadastro");
		tiruloUm_1.setForeground(new Color(51, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(126, 0, 194, 75);
		frame.getContentPane().add(tiruloUm_1);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setForeground(SystemColor.desktop);
		lblCadastro.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblCadastro.setBounds(136, 14, 204, 75);
		frame.getContentPane().add(lblCadastro);
		
		JLabel tituloUm = new JLabel("Insira os dados necesarios ");
		tituloUm.setForeground(Color.BLACK);
		tituloUm.setFont(new Font("Elephant", Font.PLAIN, 17));
		tituloUm.setBackground(Color.CYAN);
		tituloUm.setBounds(99, 73, 239, 31);
		frame.getContentPane().add(tituloUm);
		
		JLabel tituloDois = new JLabel("para efetuar seu cadastro: ");
		tituloDois.setFont(new Font("Elephant", Font.PLAIN, 17));
		tituloDois.setBounds(109, 99, 239, 13);
		frame.getContentPane().add(tituloDois);
		
		JLabel tituloForma = new JLabel("Forma de pagamento(Letras maiusculas):");
		tituloForma.setFont(new Font("Cambria", Font.PLAIN, 15));
		tituloForma.setBounds(51, 136, 289, 14);
		frame.getContentPane().add(tituloForma);
		
		textForma = new JTextField();
		textForma.setColumns(10);
		textForma.setBounds(51, 157, 335, 20);
		frame.getContentPane().add(textForma);
		
		JLabel tituloNumCartao = new JLabel("Numero do cartao:");
		tituloNumCartao.setFont(new Font("Cambria", Font.PLAIN, 15));
		tituloNumCartao.setBounds(51, 217, 127, 14);
		frame.getContentPane().add(tituloNumCartao);
		
		txtNumCartao = new JTextField();
		txtNumCartao.setColumns(10);
		txtNumCartao.setBounds(51, 238, 335, 20);
		frame.getContentPane().add(txtNumCartao);
		
		JLabel tituloNome = new JLabel("Nome(Letras maiusculas):");
		tituloNome.setVerticalAlignment(SwingConstants.BOTTOM);
		tituloNome.setFont(new Font("Cambria", Font.PLAIN, 15));
		tituloNome.setBounds(51, 298, 177, 14);
		frame.getContentPane().add(tituloNome);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(51, 319, 335, 20);
		frame.getContentPane().add(txtNome);
		
		JLabel tituloCVV = new JLabel("CVV:");
		tituloCVV.setVerticalAlignment(SwingConstants.BOTTOM);
		tituloCVV.setHorizontalAlignment(SwingConstants.LEFT);
		tituloCVV.setFont(new Font("Cambria", Font.PLAIN, 15));
		tituloCVV.setBounds(51, 379, 46, 14);
		frame.getContentPane().add(tituloCVV);
		
		textCVV = new JTextField();
		textCVV.setColumns(10);
		textCVV.setBounds(51, 400, 335, 20);
		frame.getContentPane().add(textCVV);
		
		JButton check = new JButton("OK");
		check.setFont(new Font("Cambria", Font.PLAIN, 11));
		check.setBackground(SystemColor.desktop);
		check.setBounds(173, 444, 89, 23);
		frame.getContentPane().add(check);
		check.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String msgErro = "";

				if (textForma.getText().length() == 0 || txtNumCartao.getText().length() == 0 || txtNome.getText().length() == 0
						|| textCVV.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "Alguma informacao esta vazia! Preencha todos os campos!", "Falta de dados",
							JOptionPane.ERROR_MESSAGE);

					return;
				}
				if (!control.validarFormaDePagamento(textForma.getText())) {
					msgErro += "Forma de pagamento invalida\n";
				}
				if (!control.validarNumCartao(txtNumCartao.getText())) {
					msgErro += "Numero de cartao invalido\n";
				}
				if (!control.validarNomeCartao(txtNome.getText())) {
					msgErro += "Nome invalido\n";
				}
				if (!control.validarCvvCartao(textCVV.getText())) {
					msgErro += "CVV invalido\n";
				}
				if (msgErro.length() > 0) {
					JOptionPane.showMessageDialog(null, msgErro, "ERRO", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Confirmar Cadastro", "Deseja Confirmar o Cadastro?",
							JOptionPane.DEFAULT_OPTION);
					//registrar os dados no back
					Pagamento.DadosPagamento[ControllerPagamentos.qtdCartao][0] = textForma.getText();
					Pagamento.DadosPagamento[ControllerPagamentos.qtdCartao][1] = txtNumCartao.getText();
					Pagamento.DadosPagamento[ControllerPagamentos.qtdCartao][2] = txtNome.getText();
					Pagamento.DadosPagamento[ControllerPagamentos.qtdCartao][3] = textCVV.getText();

					//contar usuarios cadastrados
					ControllerPagamentos.contaCartoes();
					//Registar os nomes no array de pagamento
					ControllerPagamentos.dadosPagamento();
					//outros
					frame.dispose();
					TelaMenu.main(null);
				}
			}
		});
		frame.getContentPane().add(check);
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
