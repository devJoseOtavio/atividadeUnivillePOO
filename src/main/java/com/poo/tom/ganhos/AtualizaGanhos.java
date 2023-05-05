package com.poo.tom.ganhos;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;

public record AtualizaGanhos(@NotNull Long id, TipoDeGanho tipo, Date data, BigDecimal valor) {
}
