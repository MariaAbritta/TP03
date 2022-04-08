package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import models.Bicicleta;
import models.Plano1440;
import models.Plano30;
import models.Plano60;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Tela de pagamento final.
 * @author Maria Abritta e Thyago Moura 
 * @version 1.0 (Abril 2022)
 */
public class TelaPagamentoFinal {

	private JFrame frame;
	Plano30 pl30 = new Plano30();
	Plano60 pl60 = new Plano60();
	Plano1440 pl1440 = new Plano1440();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPagamentoFinal window = new TelaPagamentoFinal();
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
	public TelaPagamentoFinal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel tiruloUm_1 = new JLabel("Pagamento");
		tiruloUm_1.setForeground(SystemColor.desktop);
		tiruloUm_1.setFont(new Font("Elephant", Font.PLAIN, 37));
		tiruloUm_1.setBounds(121, 25, 241, 75);
		frame.getContentPane().add(tiruloUm_1);
		
		JLabel lblPagamento = new JLabel("Pagamento");
		lblPagamento.setForeground(new Color(51, 204, 204));
		lblPagamento.setFont(new Font("Elephant", Font.PLAIN, 37));
		lblPagamento.setBounds(111, 14, 231, 75);
		frame.getContentPane().add(lblPagamento);
		
		JLabel lblEscolhaQualPlano = new JLabel("Escolha qual plano voce gostaria de usar");
		lblEscolhaQualPlano.setForeground(Color.BLACK);
		lblEscolhaQualPlano.setFont(new Font("Elephant", Font.PLAIN, 17));
		lblEscolhaQualPlano.setBackground(Color.CYAN);
		lblEscolhaQualPlano.setBounds(45, 85, 368, 31);
		frame.getContentPane().add(lblEscolhaQualPlano);
		
		JLabel lblVoceGostariaDe = new JLabel("Apos escolher o plano o pagamento sera");
		lblVoceGostariaDe.setFont(new Font("Elephant", Font.PLAIN, 17));
		lblVoceGostariaDe.setBounds(55, 111, 340, 13);
		frame.getContentPane().add(lblVoceGostariaDe);
		
		JButton cartao = new JButton("Plano 30 minutos");
		cartao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				JOptionPane.showMessageDialog(cartao, pl30.valorTotalPagamento(null));
				frame.dispose();
				TelaInicial.main(null);
			}
		});
		cartao.setFont(new Font("Cambria", Font.PLAIN, 15));
		cartao.setBackground(new Color(204, 255, 153));
		cartao.setBounds(143, 161, 152, 32);
		frame.getContentPane().add(cartao);
		
		JButton listar1 = new JButton("Plano 1 hora");
		listar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				JOptionPane.showMessageDialog(listar1, pl60.valorTotalPagamento(null));
				frame.dispose();
				TelaInicial.main(null);
			}
		});
		listar1.setFont(new Font("Cambria", Font.PLAIN, 15));
		listar1.setBackground(new Color(204, 255, 255));
		listar1.setBounds(143, 204, 152, 31);
		frame.getContentPane().add(listar1);
		
		JButton buscar = new JButton("Plano 24 horas");
		buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				JOptionPane.showMessageDialog(buscar, pl1440.valorTotalPagamento(null));
				frame.dispose();
				TelaInicial.main(null);
			}
		});
		buscar.setFont(new Font("Cambria", Font.PLAIN, 15));
		buscar.setBackground(SystemColor.desktop);
		buscar.setBounds(143, 246, 152, 27);
		frame.getContentPane().add(buscar);
		
		JLabel lblRealizadoAutomaticamente = new JLabel("realizado automaticamente.");
		lblRealizadoAutomaticamente.setFont(new Font("Elephant", Font.PLAIN, 17));
		lblRealizadoAutomaticamente.setBounds(101, 127, 241, 13);
		frame.getContentPane().add(lblRealizadoAutomaticamente);
	}
}
