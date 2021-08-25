package com.example.projetospring.service;


import com.example.projetospring.model.Receitas;
import com.example.projetospring.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository rRep;

    public List<Receitas> listReceitas (){
        return rRep.findAll();
    }

    public Receitas findReceitaById(Long id){
        Optional<Receitas> obj = rRep.findById(id);
        return obj.get();
    }

    public Receitas cadastroReceita (Receitas receitas){
        return rRep.save(receitas);
    }

    public void deleteReceita (Long id){
        rRep.deleteById(id);
    }

    public Receitas alterarReceita (Long id, Receitas receita){
        Receitas entity = rRep.getOne(id);
        updateData(entity, receita);
        return rRep.save(entity);
    }

    public void updateData (Receitas entity, Receitas obj){
        entity.setNome(obj.getNome());
        entity.setDescricao(obj.getDescricao());
        entity.setValor(obj.getValor());
    }
}
