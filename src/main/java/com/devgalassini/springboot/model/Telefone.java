package com.devgalassini.springboot.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Telefone {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter
    @Setter
    private String numero;

    @Getter
    @Setter
    private String tipo;


    @ManyToOne
    @Getter
    @Setter
    private Pessoa  pessoa;
}
