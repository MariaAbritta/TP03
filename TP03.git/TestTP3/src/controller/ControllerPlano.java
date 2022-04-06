package controller;

import models.Cartao;
import models.Plano30;
import models.Plano60;
import models.Plano1440;

public class ControllerPlano {
	public static void aceitarPlano30min(Plano30 p30,String resposta) {
		p30.valorTotalPagamento(resposta);
		//usr.getCartoes().add(new Cartao(numero, cvv, nome));
	}
	
	// validacoes
		public boolean validarResposta(String respostaCartao) {
			boolean verificar = true;
			if (respostaCartao.substring(0).matches("[A-Z]*")) {
				verificar = true;
			}
			if (!respostaCartao.substring(0).matches("[A-Z]*")) {
				verificar = false;
			}
			return verificar;
		}
}
