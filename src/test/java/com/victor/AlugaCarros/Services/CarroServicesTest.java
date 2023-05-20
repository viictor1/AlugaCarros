package com.victor.AlugaCarros.Services;

import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.victor.AlugaCarros.Enteties.Carro;

public class CarroServicesTest {
	
	private CarroServices service = new CarroServices();
	List<Carro> listaCarros = new ArrayList<Carro>();
	private Carro c1 = new Carro("uno", "fiat", 2004);
	private Carro c2 = new Carro("gol", "bolinha", 2010);
	
	@BeforeEach
	public void senario() throws Exception{	
		listaCarros.add(c1);
		listaCarros.add(c2);
		service.alugar(listaCarros);
	}
	
	@Test
	public void testeAlugadoTrue() throws Exception {
		for (Carro c : listaCarros) {
			Assert.assertTrue(c.getAlugado());				
		}
	}
	
	@Test
	public void testeDataInicioIsHoje() throws Exception {
		for (Carro c : listaCarros) {
			Assert.assertEquals(c.getDataInicio(), new Date());			
		}
	}
	
	@Test
	public void testeDataFimIsNull() throws Exception {
		for (Carro c : listaCarros) {
			Assert.assertNull(c.getDataFim());			
		}
	}
	
	@Test
	public void testeAtributoCarroNull() {
		CarroServices service = new CarroServices();
		try {
			List<Carro> list = new ArrayList<Carro>();
			list.add(new Carro());
			service.alugar(list);
			Assert.fail();
		} catch (Exception e) {
			MatcherAssert.assertThat(e.getMessage(), is("Alguma atributo do carro é nulo"));
		}
		
	}
	

}
