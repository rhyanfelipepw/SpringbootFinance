package com.example.projetospring.controller;

import com.example.projetospring.model.ContasAReceber;
import com.example.projetospring.repository.ContasAReceberRepository;
import com.example.projetospring.service.ContasAReceberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/contasareceber")
@Api(value="API - FinanC")
public class ContasAReceberController {

        @Autowired
        private ContasAReceberService service;

        @Autowired
        private ContasAReceberRepository repository;

        @ApiOperation(value="Retorna uma lista de contas a serem recebidas")
        @GetMapping
        public List<ContasAReceber> listaContas(){
            return repository.findAll();
        }

        @ApiOperation(value="Cadastra uma conta a ser recebida")
        @PostMapping
        public ResponseEntity<ContasAReceber> contasareceber (@RequestBody ContasAReceber contasareceber){
            contasareceber = service.inserir(contasareceber);
            return ResponseEntity.ok().body(contasareceber);
        }

        @ApiOperation(value="Atualiza uma conta cadastrada para recebimento")
        @PutMapping(value = "/{Id}")
        public ResponseEntity<ContasAReceber> contasareceber (@PathVariable Long Id, @RequestBody ContasAReceber contasareceber){

            contasareceber = service.editarConta(Id,contasareceber);
            return ResponseEntity.ok().body(contasareceber);
        }

        @ApiOperation(value="Deleta uma conta a receber")
        @DeleteMapping(value = "/{Id}")
        public ResponseEntity<Void> deletarConta(@PathVariable Long Id) {

            service.deletarConta(Id);
            return ResponseEntity.noContent().build();
        }
}




