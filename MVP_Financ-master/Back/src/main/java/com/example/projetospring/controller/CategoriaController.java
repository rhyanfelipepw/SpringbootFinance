package com.example.projetospring.controller;

import com.example.projetospring.model.Categoria;
import com.example.projetospring.repository.CategoriaRepository;
import com.example.projetospring.service.CategoriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/categorias")
@Api(value="API - FinanC")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @Autowired
    private CategoriaRepository repository;

    @ApiOperation(value="Retorna uma lista de categorias")
    @GetMapping
    public ResponseEntity<List<Categoria>> findAll() {
        List<Categoria> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @ApiOperation(value="Retorna a categoria solicitada")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Long id, @AuthenticationPrincipal UserDetails userDetails) {
        System.out.println(userDetails);
        Categoria obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @ApiOperation(value="Cadastra uma categoria")
    @PostMapping
    public ResponseEntity<Categoria> insert(@RequestBody Categoria categoria) {
        categoria = service.insert(categoria);
        return ResponseEntity.ok().body(categoria);
       }

    @ApiOperation(value="Atualiza uma categoria cadastrada")
    @PutMapping(value = "/{id}")
    public ResponseEntity<Categoria> update(@PathVariable Long id, @RequestBody Categoria categoria) {
        categoria = service.update(id, categoria);
        return ResponseEntity.ok().body(categoria);
    }
    
    @ApiOperation(value="Deleta uma categoria")
    @DeleteMapping(value = "/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
