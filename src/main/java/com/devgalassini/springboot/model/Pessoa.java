package com.devgalassini.springboot.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Pessoa implements Serializable {


    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String sobrenome;
    @Setter
    @Getter
    private int idade;
    @Setter
    @Getter
    @OneToMany(mappedBy = "pessoa")
    private List<Telefone>telefones;
}
