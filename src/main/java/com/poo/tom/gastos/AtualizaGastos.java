package com.poo.tom.gastos;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;

public record AtualizaGastos(@NotNull Long id, TipoDeGasto tipo, Date data, BigDecimal valor, FormaDePagamento forma) {
}
