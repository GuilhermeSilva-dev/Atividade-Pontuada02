package com.example.AtividadePontuada02.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_clientes")
public class ClienteModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private String DataNascimento;

    @Column(nullable = false)
    private String email;
    
    private String senha;
}
