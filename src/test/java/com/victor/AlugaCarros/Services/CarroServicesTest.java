package com.victor.AlugaCarros.Services;

import static org.hamcrest.CoreMatchers.is;

import java.util.Date;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import com.victor.AlugaCarros.Enteties.Carro;

public class CarroServicesTest {
	
	public Carro senario() throws Exception{
		CarroServices service = new CarroServices();
		Carro c = new Carro("uno", "fiat", 2004);

		service.alugar(c);			
		
		return c;
	}
	
	@Test
	public void testeAlugadoTrue() throws Exception {
		Carro c = senario();
		Assert.assertTrue(c.getAlugado());	
	}
	
	@Test
	public void testeDataInicioIsHoje() throws Exception {
		Carro c = senario();
		Assert.assertTrue(c.getDataInicio().equals(new Date()));
	}
	
	@Test
	public void testeDataFimIsNull() throws Exception {
		Carro c = senario();
		Assert.assertNull(c.getDataFim());
	}
	
	@Test
	public void testeAtributoCarroNull() {
		CarroServices service = new CarroServices();
		try {
			service.alugar(new Carro());
			Assert.fail();
		} catch (Exception e) {
			MatcherAssert.assertThat(e.getMessage(), is("Alguma atributo do carro é nulo"));
		}
		
	}
	

}
