package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConversorValor {
	private Double valor;
	private Double valorFormatado;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Double getValorFormatado() {
		return valorFormatado;
	}

	public void setValorFormatado(Double valorFormatado) {
		this.valorFormatado = valorFormatado;
	}
	
	public void formatar() {
		valorFormatado = valor;
	}
}
