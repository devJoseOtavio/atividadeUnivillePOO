package com.poo.tom.gastos;

import java.math.BigDecimal;
import java.util.Date;

public record GastosList(Long id, Tipo tipo, Date data, BigDecimal valor, Forma forma) {
    public GastosList(Gasto gasto) {
        this(gasto.getId(), gasto.getTipo(), gasto.getData(), gasto.getValor(), gasto.getForma());
    }
}
