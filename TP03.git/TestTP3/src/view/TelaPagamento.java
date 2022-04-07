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
		frame.setBounds(100, 100, 450, 318);
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

		JButton listar = new JButton("Listar dados");
		listar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				for (Pagamento pgt : Dados.getPagamentos()) {

					JOptionPane.showMessageDialog(listar,
							"\nForma de pagamento: " + pgt.getFormaDePagamento() +
									"\nNumero do cartao: " + pgt.getNumeroDoCartao() +
									"\nNome no cartao: " + pgt.getNomeNoCartao() +
									"\nCVV: " + pgt.getCodigoDeSeguranca() + "\n\n");

				}
			}
		});
		
		JButton listar1 = new JButton("Listar dados");
		listar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Printa todas as infos de pagamento
				JOptionPane.showMessageDialog(listar1,
//						"Seu nome : " + TelaLoging.usuarioLogado.getNome() +
								"\nForma de pagamento : " + Usuario.getCartoes()
//								"\nNome no cartao : " + Dados.getPagamentos().get(Dados.getPagamentos().size()-1).getNomeNoCartao() +
//								"\nNumero do cartao : " +  Dados.getPagamentos().get(Dados.getPagamentos().size()-1).getNumeroDoCartao() +
//								"\nCodigo de segurança : " +  Dados.getPagamentos().get(Dados.getPagamentos().size()-1).getCodigoDeSeguranca()
								);
			}
		});
		listar1.setBackground(new Color(204, 255, 255));
		listar1.setFont(new Font("Cambria", Font.PLAIN, 15));
		listar1.setBounds(165, 143, 110, 32);
		frame.getContentPane().add(listar1);

		JButton deletar = new JButton(
				"Deletar");
		deletar.setFont(new Font("Cambria", Font.PLAIN, 15));
		deletar.setBackground(new Color(255, 255, 204));
		deletar.setBounds(165, 186, 110, 32);
		frame.getContentPane().add(deletar);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setFont(new Font("Cambria", Font.PLAIN, 15));
		btnPagar.setBackground(new Color(255, 204, 255));
		btnPagar.setBounds(165, 229, 110, 32);
		frame.getContentPane().add(btnPagar);
	}

}
