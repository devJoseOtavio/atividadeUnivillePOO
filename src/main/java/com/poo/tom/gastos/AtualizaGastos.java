package com.poo.tom.gastos;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;

public record AtualizaGastos(@NotNull Long id, Tipo tipo, Date data, BigDecimal valor, Forma forma) {
}
