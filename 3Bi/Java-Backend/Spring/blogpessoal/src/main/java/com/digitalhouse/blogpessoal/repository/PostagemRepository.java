package com.digitalhouse.blogpessoal.repository;

import com.digitalhouse.blogpessoal.model.Postagem;
import com.digitalhouse.blogpessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Integer> {
    public Postagem findByPostagem(String titulo);
}
