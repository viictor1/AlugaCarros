package com.victor.AlugaCarros.Services;

import java.util.Date;

import com.victor.AlugaCarros.Enteties.Carro;
import com.victor.AlugaCarros.Exceptions.CarroJaAlugadoException;
import com.victor.AlugaCarros.Exceptions.CarroNullException;

public class CarroServices {
	public void alugar(Carro c) throws Exception {
		
		if (c.getAno() <= 0 || c.getMarca() == null || c.getModelo() == null || c.getAlugado() == null) {
			throw new CarroNullException("Alguma atributo do carro é nulo");
		}
		
		if (c.getAlugado() == true){
			throw new CarroJaAlugadoException("Carro já está alugado");
		}
		
		
		c.setAlugado(true);
		c.setDataInicio(new Date());

	}
}
