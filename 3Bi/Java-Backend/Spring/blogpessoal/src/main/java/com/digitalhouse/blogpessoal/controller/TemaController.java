package com.digitalhouse.blogpessoal.controller;


import com.digitalhouse.blogpessoal.model.Postagem;
import com.digitalhouse.blogpessoal.model.Tema;
import com.digitalhouse.blogpessoal.model.Usuario;
import com.digitalhouse.blogpessoal.repository.PostagemRepository;
import com.digitalhouse.blogpessoal.repository.TemaRepository;
import com.digitalhouse.blogpessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tema")
public class TemaController {


    @Autowired
    private TemaRepository temaRepository;


    @GetMapping
    private ResponseEntity<List<Tema>> getAll() {
        return ResponseEntity.ok(temaRepository.findAll());
    }


    @GetMapping ("/{id}")
    private ResponseEntity<Tema> getById(@PathVariable Integer id) {
        return temaRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/tema/{nome}")
    private ResponseEntity<Postagem> getby (@PathVariable String nome){
        return ResponseEntity.ok(temaRepository.findbyNome(nome));
    }

    @PostMapping
    private ResponseEntity<Tema> post(@RequestBody Tema tema) {
        return ResponseEntity.status(HttpStatus.CREATED).body(temaRepository.save(tema));
    }

    @PutMapping
    private ResponseEntity<Tema> put(@RequestBody Tema tema) {
        return ResponseEntity.status(HttpStatus.OK).body(temaRepository.save(tema));
    }


    @DeleteMapping("/{id}")
    public void delete (@PathVariable Integer id) {
        temaRepository.deleteById(id);
    }

}
