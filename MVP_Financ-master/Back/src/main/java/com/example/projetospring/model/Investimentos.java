package com.example.projetospring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Investimentos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_investimento;
	private String tipo_investimento;
	private double valor_inicial_aplicado;
	private double meta_retorno;
	private double limite_prejuizo;
	private double realizado;

	public Investimentos() {
	}

	public Investimentos(Long id_investimento, String tipo_investimento, double valor_inicial_aplicado,
						 double meta_retorno, double limite_prejuizo, double realizado) {
		this.id_investimento = id_investimento;
		this.tipo_investimento = tipo_investimento;
		this.valor_inicial_aplicado = valor_inicial_aplicado;
		this.meta_retorno = meta_retorno;
		this.limite_prejuizo = limite_prejuizo;
		this.realizado = realizado;
	}

	public Long getId_investimento() {
		return id_investimento;
	}

	public void setId_investimento(Long id_investimento) {
		this.id_investimento = id_investimento;
	}

	public String getTipo_investimento() {
		return tipo_investimento;
	}

	public void setTipo_investimento(String tipo_investimento) {
		this.tipo_investimento = tipo_investimento;
	}

	public double getValor_inicial_aplicado() {
		return valor_inicial_aplicado;
	}

	public void setValor_inicial_aplicado(double valor_inicial_aplicado) {
		this.valor_inicial_aplicado = valor_inicial_aplicado;
	}

	public double getMeta_retorno() {
		return meta_retorno;
	}

	public void setMeta_retorno(double meta_retorno) {
		this.meta_retorno = meta_retorno;
	}

	public double getLimite_prejuizo() {
		return limite_prejuizo;
	}

	public void setLimite_prejuizo(double limite_prejuizo) {
		this.limite_prejuizo = limite_prejuizo;
	}

	public double getRealizado() {
		return realizado;
	}

	public void setRealizado(double realizado) {
		this.realizado = realizado;
	}

}
