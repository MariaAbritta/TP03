package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controller.ControllerLoging;
import controller.ControllerPagamentos;
import controller.ControllerUsuarios;
import models.Pagamento;
import models.Usuario;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import view.TelaCadastroCartao;

public class TelaPagamento {

	private JFrame frame;
	private TelaCadastroCartao tcc = new TelaCadastroCartao();


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
		frame.setBounds(100, 100, 450, 328);
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
				if(src == cartao) {
					new TelaCadastroCartao();
					TelaCadastroCartao.main(null);
				}
			}
		});
		
		JButton listar = new JButton("Listar dados");
		listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Printa todas as infos da Pessoa
				for(int i=0; i<=4; i++) {
					if (Pagamento.DadosPagamento[ControllerPagamentos.qtdCartao][i] != null) {
						
					}
				}
				JOptionPane.showMessageDialog(listar, 
						"\nForma de pagamento: " + Pagamento.DadosPagamento[ControllerPagamentos.qtdCartao][0] +
						"\nNumero do cartao: " +	 Pagamento.DadosPagamento[ControllerPagamentos.qtdCartao][1] +
						"\nNome no cartao: " + Pagamento.DadosPagamento[ControllerPagamentos.qtdCartao][2] +
						"\nCVV: " + Pagamento.DadosPagamento[ControllerPagamentos.qtdCartao][3]
						);
				
			}
		});
		listar.setBackground(new Color(204, 255, 255));
		listar.setFont(new Font("Cambria", Font.PLAIN, 15));
		listar.setBounds(165, 143, 110, 32);
		frame.getContentPane().add(listar);
		
		JButton editar = new JButton("Editar");
		editar.setBackground(new Color(153, 204, 255));
		editar.setFont(new Font("Cambria", Font.PLAIN, 15));
		editar.setBounds(165, 186, 110, 32);
		frame.getContentPane().add(editar);
		
		JButton deletar = new JButton("Deletar");
		deletar.setFont(new Font("Cambria", Font.PLAIN, 15));
		deletar.setBackground(new Color(255, 255, 204));
		deletar.setBounds(165, 229, 110, 32);
		frame.getContentPane().add(deletar);
	}

}
