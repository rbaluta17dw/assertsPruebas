package testTrueFalse;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTrue {

	public boolean esPar(int numero) {

		boolean resultado = false;
		if (numero % 2 == 0) {
			resultado = true;
		}
		return resultado;

	}

	@Test
	public void testPar() {

		TestTrue test1 = new TestTrue();
		assertTrue(test1.esPar(2));
	}

}
