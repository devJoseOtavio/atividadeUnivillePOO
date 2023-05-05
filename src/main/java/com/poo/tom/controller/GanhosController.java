package com.poo.tom.controller;

import com.poo.tom.ganhos.*;
import com.poo.tom.gastos.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

public class GanhosController {

    @Autowired
    private GanhosRepository repository;

    @PostMapping
    public void cadastrarGanhos(@RequestBody GanhosCadastrados dados) {
        repository.save(new Ganho(dados));
    }

    @GetMapping
    public Page<GanhosList> ganhosList(@PageableDefault(size = 10, sort = {"tipo"}) Pageable paginate) {
        return repository.findAll(paginate).map(GanhosList::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid AtualizaGanhos dados) {
        var ganho = repository.getReferenceById(dados.id());
        ganho.atualizaGastos(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
