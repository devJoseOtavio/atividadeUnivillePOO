package com.poo.tom.controller;

import com.poo.tom.gastos.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tom")
public class TomController {

    @Autowired
    private GastosRepository repository;

    @PostMapping
    public void cadastrarGastos(@RequestBody GastosCadastrados dados) {
        repository.save(new Gasto(dados));
    }

    @GetMapping
    public Page<GastosList> gastosList(@PageableDefault(size = 10, sort = {"tipo"}) Pageable paginate) {
        return repository.findAll(paginate).map(GastosList::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid AtualizaGastos dados) {
        var gasto = repository.getReferenceById(dados.id());
        gasto.atualizaGastos(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
