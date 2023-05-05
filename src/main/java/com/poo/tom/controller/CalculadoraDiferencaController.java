package com.poo.tom.controller;

import com.poo.tom.service.CalculaDiferencaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CalculadoraDiferencaController {
    private final CalculaDiferencaService calculadoraDiferencaService;

    public CalculadoraDiferencaController(CalculaDiferencaService calculadoraDiferencaService) {
        this.calculadoraDiferencaService = calculadoraDiferencaService;
    }

    @GetMapping("/{idTabela1}/{idTabela2}")
    public Double calcularDiferenca(@PathVariable Long idTabela1, @PathVariable Long idTabela2) {
        return calculadoraDiferencaService.calcularDiferenca(idTabela1, idTabela2);
    }
}
