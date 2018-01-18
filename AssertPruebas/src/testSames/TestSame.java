package testSames;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class TestSame {

	int i1 = 6;
	int i2 = 6;

	@Test
	public void intTest() throws Exception {

		assertSame(i1, i2);

	}

}