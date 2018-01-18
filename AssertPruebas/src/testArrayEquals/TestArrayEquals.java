package testArrayEquals;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayEquals {

	@Test
	public void testArrayEquals() {

		// Este array simboliza el resultado que deseamos obtener
		String[] resultEsperado = { "esto", "es una", "prueba" };

		// Este array es lo que obtenemos realmente

		String[] resultObten = { "esto", "es una", "prueba" };
		assertArrayEquals(resultEsperado, resultObten);
	}

}
