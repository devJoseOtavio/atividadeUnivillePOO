package com.poo.tom.ganhos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.poo.tom.gastos.AtualizaGastos;
import com.poo.tom.gastos.GastosCadastrados;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "gastos")
@Entity(name = "Gasto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Ganho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoDeGanho tipoDeGanho;

    @JsonFormat
    private Date data;

    private BigDecimal valor;

    public Ganho(GanhosCadastrados ganho) {
        this.tipoDeGanho = ganho.tipoDeGanho();
        this.data = ganho.data();
        this.valor = ganho.valor();
    }

    public void atualizaGastos(AtualizaGanhos ganho) {
        if (ganho.data() != null) this.data = ganho.data();

        if (ganho.valor() != null) this.valor = ganho.valor();
    }
}
