package com.devgalassini.springboot.model;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numero;
    private String tipo;
    @ManyToOne
    private Pessoa  pessoa;
}
