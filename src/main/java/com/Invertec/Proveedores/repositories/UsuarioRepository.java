package com.Invertec.Proveedores.repositories;

import com.Invertec.Proveedores.entities.Usuarios;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository <Usuarios, Long> {

}
