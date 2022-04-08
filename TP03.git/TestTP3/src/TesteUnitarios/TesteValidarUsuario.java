package TesteUnitarios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import controller.*;

class TesteValidarUsuario {
	ControllerUsuarios coUser = new ControllerUsuarios();
	
	@Test
	void testValidarNome() {
		assertTrue(coUser.validarNome("ALMEIDA"));
		assertFalse(coUser.validarNome("Almeida"));
		assertFalse(coUser.validarNome("ALME1D4"));
	}
	
	@Test
	void testValidarEmail() {
		assertFalse(coUser.validarEmail("ALMEIDA"));
		assertTrue(coUser.validarEmail("ALMEIDA@"));
		assertTrue(coUser.validarEmail("almeida@"));
		assertFalse(coUser.validarEmail("almeida"));
	}
	
	@Test
	void testValidarRg() {
		assertFalse(coUser.validarRg("ALMEIDA"));
		assertFalse(coUser.validarRg("0123456789"));
		assertFalse(coUser.validarRg("328-494"));
		assertTrue(coUser.validarRg("3281494"));
	}

	@Test
	void testValidarCpf() {
		assertFalse(coUser.validarCpf("ALMEIDA"));
		assertFalse(coUser.validarCpf("123456789123"));
		assertFalse(coUser.validarCpf("A031s988e4"));
		assertTrue(coUser.validarCpf("03159889245"));
	}
	
	@Test
	void testValidarTelefone() {
		assertFalse(coUser.validarTelefone("ALMEIDA"));
		assertFalse(coUser.validarTelefone("ALM31D4"));
		assertFalse(coUser.validarTelefone("12345678912"));
		assertTrue(coUser.validarTelefone("982058321"));
	}
	
	@Test
	void testValidarSenha() {
		assertFalse(coUser.validarSenha("ALM123456"));
		assertFalse(coUser.validarSenha("1234567"));
		assertFalse(coUser.validarSenha("alm1234"));
		assertTrue(coUser.validarSenha("ALM1234"));
	}
}
