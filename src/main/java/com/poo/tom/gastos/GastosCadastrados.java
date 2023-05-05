package com.poo.tom.gastos;

import java.math.BigDecimal;
import java.util.Date;

public record GastosCadastrados(TipoDeGasto tipo, Date data, BigDecimal valor, FormaDePagamento forma) {
}
