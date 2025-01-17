package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import models.Dados;
import models.Pagamento;
import models.Usuario;
/**
 * Tela de pagamento.
 * @author Maria Abritta e Thyago Moura 
 * @version 1.0 (Abril 2022)
 */
public class TelaPagamento {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPagamento window = new TelaPagamento();
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
	public TelaPagamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblPagamento = new JLabel("Pagamento");
		lblPagamento.setForeground(SystemColor.desktop);
		lblPagamento.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblPagamento.setBounds(122, 14, 231, 75);
		frame.getContentPane().add(lblPagamento);

		JLabel tiruloUm_1 = new JLabel("Pagamento");
		tiruloUm_1.setForeground(new Color(51, 204, 204));
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(112, 0, 241, 75);
		frame.getContentPane().add(tiruloUm_1);

		JButton cartao = new JButton("Cartao");
		cartao.setBackground(new Color(204, 255, 153));
		cartao.setFont(new Font("Cambria", Font.PLAIN, 15));
		cartao.setBounds(165, 100, 110, 32);
		frame.getContentPane().add(cartao);
		cartao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();
				if (src == cartao) {
					new TelaCadastroCartao();
					TelaCadastroCartao.main(null);
				}
			}
		});
		
		/**
		 * Lista os dados do cart�o cadastrado
		 */
		JButton listar1 = new JButton("Listar dados");
		listar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Printa todas as infos da Pessoa
				if(
						TelaCadastroCartao.textForma != null &&
						TelaCadastroCartao.txtNumCartao != null &&
						TelaCadastroCartao.txtNome != null &&
						TelaCadastroCartao.textCVV != null
						) {
					JOptionPane.showMessageDialog(listar1,
							"Forma de pagamento: " + TelaCadastroCartao.textForma.getText() +
									"\nNumero do cartao : " + TelaCadastroCartao.txtNumCartao.getText() +
									"\nNome no cartao : " + TelaCadastroCartao.txtNome.getText() +
									"\nCVV: " + TelaCadastroCartao.textCVV.getText());
				}
				else {
					JOptionPane.showMessageDialog(listar1,"Nenhum cartao cadastrado!");
				}
				
				frame.dispose();
				TelaMenu.main(null);
			}
		});
		listar1.setBackground(new Color(204, 255, 255));
		listar1.setFont(new Font("Cambria", Font.PLAIN, 15));
		listar1.setBounds(165, 143, 110, 32);
		frame.getContentPane().add(listar1);

		/**
		 * Apaga os dados do cart�o deletado.
		 */
		JButton deletar = new JButton("Deletar");
		deletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dados.getPagamentos().remove(TelaCadastroCartao.cartaoCadastrado);
				System.out.println(Dados.getPagamentos().size());
				JOptionPane.showMessageDialog(deletar, "Cartao deletado.");
				frame.dispose();
				TelaMenu.main(null);
			}
		});
		deletar.setFont(new Font("Cambria", Font.PLAIN, 15));
		deletar.setBackground(new Color(255, 255, 204));
		deletar.setBounds(165, 223, 110, 32);
		frame.getContentPane().add(deletar);
		
		/**
		 * Busca pelo CVV do cart�o em quest�o
		 */
		JButton buscar = new JButton("Buscar");
		buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();
				if (src == buscar) {
					frame.dispose();
					TelaBuscarCartao.main(null);
				}
			}
		});
		buscar.setFont(new Font("Cambria", Font.PLAIN, 15));
		buscar.setBackground(SystemColor.desktop);
		buscar.setBounds(165, 186, 110, 26);
		frame.getContentPane().add(buscar);
	}

}
