package com.sofka.demo.services;
import com.sofka.demo.models.UsuarioModel;
import com.sofka.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

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

    public Optional<UsuarioModel> obtenerPorId(long id){
        return UsuarioRepository.findById(id);
    }

    public ArrayList<UsuarioModel>  obtenerPorPrioridad(Integer prioridad) {
        return UsuarioRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id) {
        try{
            UsuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public boolean eliminarTodosLosUsuarios() {
        try{
            UsuarioRepository.deleteAll();
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
