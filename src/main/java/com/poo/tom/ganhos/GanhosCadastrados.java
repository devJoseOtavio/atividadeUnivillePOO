package com.poo.tom.ganhos;

import java.math.BigDecimal;
import java.util.Date;

public record GanhosCadastrados(TipoDeGanho tipoDeGanho, Date data, BigDecimal valor) {
}
