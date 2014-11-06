package com.algaworks.viisemsi.model;

public enum StatusFuncionario {

	ATIVO("Ativo"), 
	FERIAS("Em férias"),
	INATIVO("Inativo");
	
	private String descricao;

	StatusFuncionario(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}