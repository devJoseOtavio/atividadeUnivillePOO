package com.poo.tom.ganhos;

import com.poo.tom.gastos.FormaDePagamento;
import com.poo.tom.gastos.TipoDeGasto;

import java.math.BigDecimal;
import java.util.Date;

public record GanhosList(Long id, TipoDeGanho tipo, Date data, BigDecimal valor) {
    public GanhosList(Ganho ganho) {
        this(ganho.getId(), ganho.getTipoDeGanho(), ganho.getData(), ganho.getValor());
    }
}
