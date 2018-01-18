package testTrueFalse;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFalse {

	public boolean esPar(int numero) {

		boolean resultado = false;
		if (numero % 2 == 0) {
			resultado = true;
		}
		return resultado;

	}

	@Test
	public void testPar() {

		TestFalse test1 = new TestFalse();
		assertFalse(test1.esPar(5));
	}

}
