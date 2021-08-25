package com.example.projetospring.service;

import com.example.projetospring.model.CategoriaSoma;
import com.example.projetospring.model.Despesa;
import com.example.projetospring.repository.CategoriaRepository;
import com.example.projetospring.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DespesaService {

    @Autowired
    private DespesaRepository repository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional(readOnly = true)
    public Page<Despesa> findAll(Pageable pageable) {
        categoriaRepository.findAll();
        Page<Despesa> result = repository.findAll(pageable);
        return result;
    }

    @Transactional(readOnly = true)
    public List<CategoriaSoma> amountGroupedByCategoria() {
        return repository.amountGroupedByCategoria();
    }

    public Despesa findById(Long id) {
        Optional<Despesa> obj = repository.findById(id);
        return obj.get();
    }

    public Despesa insert(Despesa despesa) {
        return repository.save(despesa);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Despesa update(Long id, Despesa obj) {
        Despesa entity = repository.findById(id).get();
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Despesa entity, Despesa obj) {
        entity.setNome(obj.getNome());
        entity.setPreco(obj.getPreco());
        entity.setDescricao(obj.getDescricao());
        entity.setCategoria(obj.getCategoria());
    }

}
