package com.web_api.controller;

import com.web_api.model.Usuario;
import com.web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping()
    public List<Usuario> getUsers() {

        return repository.listAll();
    }

    @DeleteMapping("/{id}")
    public void deleteUsers(@PathVariable ("id") Integer id) {
        repository.remove(id);
    }

    @PostMapping()
    public void postUsers(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

    @PutMapping()
    public void putUsers(@RequestBody Usuario usuario) {
        repository.update(usuario);
    }





}
