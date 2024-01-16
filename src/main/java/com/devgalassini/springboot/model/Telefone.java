package com.devgalassini.springboot.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
    @ForeignKey(name="pessoa_id")
    @ManyToOne
    @Getter
    @Setter
    private Pessoa  pessoa;
}
