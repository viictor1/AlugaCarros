package com.victor.AlugaCarros.Services;

import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.victor.AlugaCarros.Enteties.Carro;

@SpringBootTest
public class CarroServicesTest {
	
	public Carro scenario() {
		CarroServices service = new CarroServices();
		Carro c = new Carro("uno", "fiat", 2004);
		service.alugar(c);
		return c;
	}
	
	@Test
	public void testeAlugadoTrue() {
		Carro c = scenario();
		Assert.assertTrue(c.getAlugado());	
	}
	
	@Test
	public void testeDataInicioIsHoje() {
		Carro c = scenario();
		Assert.assertTrue(c.getDataInicio().equals(new Date()));
	}
	
	@Test
	public void testeDataFimIsNull() {
		Carro c = scenario();
		Assert.assertNull(c.getDataFim());
	}

}
