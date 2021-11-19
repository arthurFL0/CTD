package com.digitalhouse.blogpessoal.repository;

import com.digitalhouse.blogpessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer>{
   public Usuario findByUsuario(String usuario);
}
