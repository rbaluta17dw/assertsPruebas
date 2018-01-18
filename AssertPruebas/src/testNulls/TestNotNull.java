package testNulls;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestNotNull {
	
	
	@Test
	
	public void test(){
		
		Lista listaTest = new Lista();
		assertNotNull(listaTest.getNombre());
		
	}
}
