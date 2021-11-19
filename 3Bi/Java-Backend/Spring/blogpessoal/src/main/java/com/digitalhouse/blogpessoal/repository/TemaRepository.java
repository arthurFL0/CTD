package com.digitalhouse.blogpessoal.repository;

import com.digitalhouse.blogpessoal.model.Postagem;
import com.digitalhouse.blogpessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Integer> {
    public Postagem findbyNome (String nome) ;
}
