package com.victor.AlugaCarros.Services;

import java.util.Date;

import com.victor.AlugaCarros.Enteties.Carro;

public class CarroServices {
	public void alugar(Carro c) {
		if (c.getAlugado() == true){
			return;
		}
		else {
			c.setAlugado(true);
			c.setDataInicio(new Date());
		}
	}
}
