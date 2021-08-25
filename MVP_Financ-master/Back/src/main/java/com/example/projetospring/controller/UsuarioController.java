package com.example.projetospring.controller;


import com.example.projetospring.model.Usuario;
import com.example.projetospring.repository.UsuarioRepository;
import com.example.projetospring.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService uServ;

    @GetMapping
    public List<Usuario> listaUsuarios (){
        return uServ.findUsuarios();
    }

    @PostMapping
    public ResponseEntity<Usuario> cadastroUsuario(@RequestBody Usuario usuario){
        usuario = uServ.cadastrarUsuario(usuario);
        return ResponseEntity.ok().body(uServ.cadastrarUsuario(usuario));
    }

    @GetMapping(value = "/{usuarioId}")
    public ResponseEntity<Usuario> findUsuarioById (@PathVariable Long usuarioId){
        Usuario obj = uServ.findUsuarioID(usuarioId);
        return ResponseEntity.ok().body(obj);
    }

    @PutMapping(value = "/{usuarioId}")
    public ResponseEntity<Usuario> alterarUsuario (@RequestBody Usuario usuarios, @PathVariable Long usuarioId){
        usuarios = uServ.alterarUsuario(usuarioId, usuarios);
        return ResponseEntity.ok().body(usuarios);
    }


    @DeleteMapping(value = "/{usuarioId}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> deleteUsaurio(@PathVariable Long usuarioId){
        uServ.deletarUsuario(usuarioId);
        return ResponseEntity.noContent().build();
    }


}
