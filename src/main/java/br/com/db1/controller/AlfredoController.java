package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AlfredoController {
	private String nome;
	private Integer idade;
	private EstadosSulBrasil estadosSul;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public void exibirDadosAlfredo() {
		setNome("Alfredo Frederico Pereira da Silva II");
		setIdade(10);
	}
	
	public EstadosSulBrasil getEstadosSul() {
		return estadosSul;
	}
	
	public EstadosSulBrasil[] getListaEstados() {
		return EstadosSulBrasil.values();
	}
	
}
