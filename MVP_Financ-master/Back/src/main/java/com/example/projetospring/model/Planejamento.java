package com.example.projetospring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Planejamento {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_planejamento;
	private String objetivo_planejamento;
	private Date data_planejamento;
	private double valor_planejamento;

	public Planejamento() {
	}

	public Planejamento(Long id_planejamento, String objetivo_planejamento, Date data_planejamento,
						double valor_planejamento) {
		this.id_planejamento = id_planejamento;
		this.objetivo_planejamento = objetivo_planejamento;
		this.data_planejamento = data_planejamento;
		this.valor_planejamento = valor_planejamento;
	}

	public Long getId_planejamento() {
		return id_planejamento;
	}

	public void setId_planejamento(Long id_planejamento) {
		this.id_planejamento = id_planejamento;
	}

	public String getObjetivo_planejamento() {
		return objetivo_planejamento;
	}

	public void setObjetivo_planejamento(String objetivo_planejamento) {
		this.objetivo_planejamento = objetivo_planejamento;
	}

	public Date getData_planejamento() {
		return data_planejamento;
	}

	public void setData_planejamento(Date data_planejamento) {
		this.data_planejamento = data_planejamento;
	}

	public double getValor_planejamento() {
		return valor_planejamento;
	}

	public void setValor_planejamento(double valor_planejamento) {
		this.valor_planejamento = valor_planejamento;
	}

}
