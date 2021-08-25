package com.example.projetospring.mappers;

import com.example.projetospring.model.Usuario;
import org.mapstruct.factory.Mappers;

public abstract class UsuarioMapper {
    public static final UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    public abstract Usuario toUsuario(Usuario usuario);
}