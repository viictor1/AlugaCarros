package com.victor.AlugaCarros.Services;

import java.util.Date;
import java.util.List;

import com.victor.AlugaCarros.Enteties.Carro;
import com.victor.AlugaCarros.Exceptions.CarroJaAlugadoException;
import com.victor.AlugaCarros.Exceptions.CarroNullException;

public class CarroServices {
	public void alugar(List<Carro> listaCarros) throws Exception {
		for (Carro c : listaCarros) {
			if (c.getAno() <= 0 || c.getMarca() == null || c.getModelo() == null) {
				throw new CarroNullException("Alguma atributo do carro é nulo");
			}
			
			if (c.getAlugado() == true){
				throw new CarroJaAlugadoException("Carro já está alugado");
			}
			
			c.setDataInicio(new Date());
			c.setAlugado(true);
		}	
	}
}
