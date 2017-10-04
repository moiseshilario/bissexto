package br.com.bissexto.teste;
import org.junit.Assert;
import org.junit.Test;

import br.com.bissexto.Bissexto;;


public class TesteBissexto {

	@Test
	public void deveAfirmarBissexto() {
		int bissexto1 = 2000;
		int bissexto2 = 2016;
		
		Assert.assertTrue(Bissexto.ehBissexto(bissexto1));
		Assert.assertTrue(Bissexto.ehBissexto(bissexto2));
	}
	
	@Test
	public void testeNegarBissexto() {
		int bissexto1 = 1900;
		int bissexto2 = 1901;

		Assert.assertFalse(Bissexto.ehBissexto(bissexto1));
		Assert.assertFalse(Bissexto.ehBissexto(bissexto2));
		
	}
}
