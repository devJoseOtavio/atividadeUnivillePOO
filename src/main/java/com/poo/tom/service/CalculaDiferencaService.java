package com.poo.tom.service;

import com.poo.tom.ganhos.Ganho;
import com.poo.tom.ganhos.GanhosRepository;
import com.poo.tom.gastos.Gasto;
import com.poo.tom.gastos.GastosRepository;

public class CalculaDiferencaService {

    private final GanhosRepository ganhosRepository;
    private final GastosRepository gastosRepository;

    public CalculaDiferencaService(Ganho ganho, Gasto gasto) {
        this.ganhosRepository = ganho;
        this.gastosRepository = gasto;
    }

    public Double calcularDiferenca(Long idTabela1, Long idTabela2) {
        Ganho ganho = ganhosRepository.findById(idTabela1).orElseThrow(() -> new IllegalArgumentException("Registro não encontrado na ganho com o ID: "));
        Gasto gasto = gastosRepository.findById(idTabela2).orElseThrow(() -> new IllegalArgumentException("Registro não encontrado na gasto com o ID: "));

        return ganho.getValor() - gasto.getValor();
    }
}
