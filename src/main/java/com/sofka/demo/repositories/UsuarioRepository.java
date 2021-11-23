package com.sofka.demo.repositories;
import com.sofka.demo.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long>{
    //Debe ser un método abstracto
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);

}
