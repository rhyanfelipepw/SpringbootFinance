package com.example.projetospring.repository;

import com.example.projetospring.model.Receitas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receitas, Long> {
}
