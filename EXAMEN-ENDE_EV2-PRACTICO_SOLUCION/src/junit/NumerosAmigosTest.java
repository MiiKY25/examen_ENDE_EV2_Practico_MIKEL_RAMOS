package junit;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumerosAmigosTest {

	@Test
	public void testAmigoMal() {
		
		NumerosAmigos num = new NumerosAmigos(22, 284);
		boolean resultado = num.amigo();
		assertFalse(resultado);		
	}

	@Test
	public void testAmigoPerfecto() {
		
		NumerosAmigos num = new NumerosAmigos(220, 284);
		boolean resultado = num.amigo();
		assertTrue(resultado);		
	}
	
	@Test
	public void testEsCeroN1() {

		NumerosAmigos num = new NumerosAmigos(0, 284);
		Integer resultado = num.esN1IgualAN2();
		assertNull(resultado);

	}
	
	@Test
	public void testN1yN2SonIguales() {

		Integer valorEsperado = 1;

		NumerosAmigos num = new NumerosAmigos(284, 284);
		Integer resultado = num.esN1IgualAN2();
		assertEquals(valorEsperado, resultado);

	}
	
	
	@Test
	public void testN1yN2NoSonIguales() {

		Integer valorEsperado = 1;

		NumerosAmigos num = new NumerosAmigos(2, 6);
		Integer resultado = num.esN1IgualAN2();
		assertNotEquals(valorEsperado, resultado,0);

	}
	


}
