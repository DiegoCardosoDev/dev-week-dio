package com.diegocardoso.devweek.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class FaixaEtaria {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Integer Faixa_i;
    private Integer Faixa_n;
    private String Descricao;
}
