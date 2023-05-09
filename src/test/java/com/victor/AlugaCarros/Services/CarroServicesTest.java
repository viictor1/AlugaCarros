package com.victor.AlugaCarros.Services;

import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.victor.AlugaCarros.Enteties.Carro;

@SpringBootTest
public class CarroServicesTest {
	
	@Test
	public void testeAlugar() {
		CarroServices service = new CarroServices();
		Carro c = new Carro("uno", "fiat", 2004);
		Date hoje = new Date();
		service.alugar(c);
		
		Assert.assertTrue(c.getAlugado());
	    Assert.assertTrue(c.getDataInicio().equals(hoje));
		Assert.assertTrue(c.getDataFim() == null);
		
	}
}
