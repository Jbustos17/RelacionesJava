package com.example.ProyectoArquitectura1.Models;

import jakarta.persistence.*;

@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "perfil")
    private Profesor profesor;
}
