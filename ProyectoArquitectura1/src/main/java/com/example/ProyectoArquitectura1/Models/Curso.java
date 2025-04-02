package com.example.ProyectoArquitectura1.Models;

import com.example.ProyectoArquitectura1.Models.Profesor;
import jakarta.persistence.*;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "profesor_id", referencedColumnName = "id")
    private Profesor profesor;

}