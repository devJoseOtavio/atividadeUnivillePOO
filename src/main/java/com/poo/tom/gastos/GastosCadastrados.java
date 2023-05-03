package com.poo.tom.gastos;

import java.math.BigDecimal;
import java.util.Date;

public record GastosCadastrados(Tipo tipo, Date data, BigDecimal valor, Forma forma) {
}
