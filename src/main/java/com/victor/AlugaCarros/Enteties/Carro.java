package com.victor.AlugaCarros.Enteties;

import java.util.Date;

public class Carro {
	private String marca, modelo;
	private int ano;
	private Date dataInicio, dataFim;
	private Boolean alugado;
	
	
	public Carro(String marca, String modelo, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.dataFim = null;
		this.alugado = false;
	}


	public Carro() {
		
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public Date getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}


	public Date getDataFim() {
		return dataFim;
	}


	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}


	public Boolean getAlugado() {
		return alugado;
	}


	public void setAlugado(Boolean alugado) {
		this.alugado = alugado;
	}

	
}
