package testEquals;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEquals {

	public int sumar(int a, int b) {

		int suma = a + b;

		return suma;

	}

	@Test

	public void testEquals() {

		TestEquals test1 = new TestEquals();

		int result = test1.sumar(2, 2);

		int esper = 4;

		assertEquals(esper, result);
	}

}
