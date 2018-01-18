package testNulls;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNull {

	@Test
	public void test(){
			
			Lista listaTest = new Lista();
			assertNull(listaTest.getNombre());
			
		}
}


