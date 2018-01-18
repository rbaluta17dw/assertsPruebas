package testSames;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNotSame {

	int i1 = 6;
	int i2 = 5;

	@Test
	public void intTest() throws Exception {

		assertNotSame(i1, i2);

	}

}
