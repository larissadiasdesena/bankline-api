package com.dio.santandander.bankline.api.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Embedded;

import javax.persistence.*;

@Entity
@Table(name = "tab_correntista")

public class Correntista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
	
	@Column(length = 60)
     private String cpf;
	
	
     private String nome;
     
     @Embedded
     private Conta conta;
     
    
     @Entity
     public Conta getConta() {
    	 return conta;
     }
     
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
     
     
}
