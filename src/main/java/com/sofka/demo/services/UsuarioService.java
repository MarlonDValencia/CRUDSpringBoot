package com.sofka.demo.services;
import com.sofka.demo.models.UsuarioModel;
import com.sofka.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService{
    @Autowired
    UsuarioRepository UsuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuario(){
        return (ArrayList<UsuarioModel>)UsuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return UsuarioRepository.save(usuario);
    }
}
