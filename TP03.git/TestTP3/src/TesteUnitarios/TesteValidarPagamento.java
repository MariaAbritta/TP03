package TesteUnitarios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import controller.*;

class TesteValidarPagamento {

	ControllerPagamentos ctrPag = new ControllerPagamentos();
	
	@Test
	void testValidarFormaDePagamento() {
		assertTrue(ctrPag.validarFormaDePagamento("DEBITO"));
		assertFalse(ctrPag.validarFormaDePagamento("debito"));
		assertFalse(ctrPag.validarFormaDePagamento("1234"));
	}
	
	@Test
	void testValidarNumCartao() {
		assertTrue(ctrPag.validarNumCartao("0123012301230123"));
		assertFalse(ctrPag.validarNumCartao("numCartao"));
		assertFalse(ctrPag.validarNumCartao("num123123123123"));
		assertFalse(ctrPag.validarNumCartao("012301230123"));
	}
	
	@Test
	void testValidarNomeCartao() {
		assertTrue(ctrPag.validarNomeCartao("THYAGOMOURA"));
		assertFalse(ctrPag.validarNomeCartao("ThyagoMoura"));
		assertFalse(ctrPag.validarNomeCartao("Thy4go"));
		assertFalse(ctrPag.validarNomeCartao("1234"));
	}
	
	@Test
	void testValidarCvvCartao() {
		assertTrue(ctrPag.validarCvvCartao("328"));
		assertFalse(ctrPag.validarCvvCartao("123456"));
		assertFalse(ctrPag.validarCvvCartao("3e8"));
	}
}
