package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class maiusculaMinusculaController {
	private String palavra;
	private String resultado;
	
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public void maiuscula() {
		resultado = palavra.toUpperCase();
	}
	
	public void minuscula() {
		resultado = palavra.toLowerCase();
	}
	
	
	
	
	
}
