package com.poo.tom.gastos;

import java.math.BigDecimal;
import java.util.Date;

public record GastosList(Long id, TipoDeGasto tipo, Date data, BigDecimal valor, FormaDePagamento forma) {
    public GastosList(Gasto gasto) {
        this(gasto.getId(), gasto.getTipo(), gasto.getData(), gasto.getValor(), gasto.getForma());
    }
}
