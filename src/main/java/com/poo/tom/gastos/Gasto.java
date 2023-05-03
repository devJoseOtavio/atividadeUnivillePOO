package com.poo.tom.gastos;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class Gasto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    @JsonFormat
    private Date data;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private Forma forma;

    public Gasto(GastosCadastrados gastos) {
        this.tipo = gastos.tipo();
        this.data = gastos.data();
        this.valor = gastos.valor();
        this.forma = gastos.forma();
    }

    public void atualizaGastos(AtualizaGastos gastos) {
        if (gastos.data() != null) this.data = gastos.data();

        if (gastos.valor() != null) this.valor = gastos.valor();
    }
}
