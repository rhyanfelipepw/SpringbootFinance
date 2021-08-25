package com.example.projetospring.service;

import com.example.projetospring.model.ContasAPagar;
import com.example.projetospring.repository.ContasAPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContasAPagarService {

    @Autowired
    private ContasAPagarRepository repository;

    public ContasAPagar inserir (ContasAPagar contasapagar){
        return repository.save(contasapagar);
    }

    public void deletarConta (Long Id) {

        repository.deleteById(Id);

    }

    public ContasAPagar editarConta (Long Id, ContasAPagar contasapagar) {
        ContasAPagar c1 = repository.findById(Id).get();
        updateData(c1, contasapagar);
        return repository.save(c1);
    }

    private void updateData (ContasAPagar c1, ContasAPagar contasapagar) {
        c1.setNomeConta(contasapagar.getNomeConta());
        c1.setValorConta(contasapagar.getValorConta());
        c1.setCategoria(contasapagar.getCategoria());
    }
}
