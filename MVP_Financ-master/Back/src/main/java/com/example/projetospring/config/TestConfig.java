package com.example.projetospring.config;

import com.example.projetospring.model.Categoria;
import com.example.projetospring.model.Despesa;
import com.example.projetospring.model.Receitas;
import com.example.projetospring.model.Usuario;
import com.example.projetospring.repository.CategoriaRepository;
import com.example.projetospring.repository.DespesaRepository;
import com.example.projetospring.repository.ReceitaRepository;
import com.example.projetospring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private DespesaRepository despesaRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ReceitaRepository receitaRepository;


    @Override
    public void run(String... args) throws Exception {

        Categoria c1 = new Categoria(null, "Estudo");
        Categoria c2 = new Categoria(null, "Bares e restaurantes");
        Categoria c3 = new Categoria(null, "Estudo12");
        Categoria c4 = new Categoria(null, "Bares e restaurantes12");


        categoriaRepository.saveAll(Arrays.asList(c1, c2, c3, c4));

        Usuario u1 = new Usuario(null, "Raul Rios", "raulrios0907@email.com");
        Usuario u2 = new Usuario(null, "Luisa Ghellere", "luisaghellere@email.com");
        Usuario u3 = new Usuario(null, "Fernando Fritzen", "fefe@email.com");

        usuarioRepository.saveAll(Arrays.asList(u1, u2, u3));

        Despesa d1 = new Despesa(null, "Faculdade", 680.0, "Parcela da faculdade", c1, u1);
        Despesa d2 = new Despesa(null, "cerveja", 30.0,"Cerveja no bar", c2, u2);
        Despesa d3 = new Despesa(null, "pizza", 35.0, "pizza", c2, u3);
        Despesa d4 = new Despesa(null, "Faculdade1", 680.0,"Parcela da faculdade", c1, u3);
        Despesa d5 = new Despesa(null, "cerveja1", 30.0, "Cerveja no bar", c3, u2);
        Despesa d6 = new Despesa(null, "pizza1", 35.0, "pizza", c4, u1);
        Despesa d7 = new Despesa(null, "Faculdade2", 680.0, "Parcela da faculdade", c1, u2);
        Despesa d8 = new Despesa(null, "cerveja2", 30.0,"Cerveja no bar", c2, u3);
        Despesa d9 = new Despesa(null, "pizza2", 35.0, "pizza", c4, u1);

        despesaRepository.saveAll(Arrays.asList(d1, d2, d3, d4, d5, d6, d7, d8, d9));

        Receitas r1 = new Receitas(null, "Salário", 1600.00, "Salário do Serviço", u1);
        Receitas r2 = new Receitas(null, "FreeLance", 500.00, "Freelance pra escola de inglês", u2 );
        Receitas r3 = new Receitas (null, "Irmão", 50.00, "Dinheiro emprestado pro irmão devolvido", u3);

        receitaRepository.saveAll(Arrays.asList(r1, r2, r3));
    }
}
