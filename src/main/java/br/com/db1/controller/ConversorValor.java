package br.com.db1.controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConversorValor {
	private String valor;
	private String valorFormatado;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String getValorFormatado() {
		return valorFormatado;
	}

	public void setValorFormatado(String valorFormatado) {
		this.valorFormatado = valorFormatado;
	}
	
	public void formatar() {
		NumberFormat formatter = new DecimalFormat("#0.000");
		valorFormatado = formatter.format(valor);
	}
}
