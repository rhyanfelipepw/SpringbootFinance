package com.example.projetospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.projetospring.model.Planejamento;
import com.example.projetospring.repository.PlanejamentoRepository;

@Service
public class PlanejamentoService {

	@Autowired
	private PlanejamentoRepository repository;

	public Planejamento inserirPlanejamento(Planejamento planejamento) {
		return repository.save(planejamento);
	}

	public Planejamento editarPlanejamento(Long id_planejamento, Planejamento planejamento) {
		Planejamento c1 = repository.findById(id_planejamento).get();
		atualizar(c1, planejamento);
		return repository.save(c1);

	}

	private void atualizar (Planejamento c1, Planejamento planejamento) {
		c1.setObjetivo_planejamento(planejamento.getObjetivo_planejamento());
		c1.setData_planejamento(planejamento.getData_planejamento());
		c1.setValor_planejamento(planejamento.getValor_planejamento());
	}

	public void deletarPlanejamento(Long id_planejamento) {
		repository.deleteById(id_planejamento);
	}
}