package com.example.projetospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetospring.model.Investimentos;
import com.example.projetospring.repository.InvestimentosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetospring.model.Investimentos;
import com.example.projetospring.repository.InvestimentosRepository;

@Service
public class InvestimentosService {

    @Autowired
    private InvestimentosRepository repository;

    public Investimentos inserirInvestimento(Investimentos investimento) {
        return repository.save(investimento);
    }

    public Investimentos editarInvestimento (Long Id, Investimentos investimento) {
        Investimentos c1 = repository.findById(Id).get();
        atualizar(c1, investimento);
        return repository.save(c1);
    }

    private void atualizar (Investimentos c1, Investimentos investimento) {
        c1.setTipo_investimento(investimento.getTipo_investimento());
        c1.setValor_inicial_aplicado(investimento.getValor_inicial_aplicado());
        c1.setMeta_retorno(investimento.getMeta_retorno());
        c1.setLimite_prejuizo(investimento.getLimite_prejuizo());
        c1.setRealizado(investimento.getRealizado());
    }

    public void deletarInvestimento (Long Id) {
        repository.deleteById(Id);
    }
}