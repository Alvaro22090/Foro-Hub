package com.foroHub.Foro_Hub.domain;

import jakarta.persistence.*;
import jakarta.validation.Valid;

import java.time.LocalDate;

@Table(name = "topicos")
@Entity(name = "topico")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDate fecha;
    @Enumerated(EnumType.STRING)
    private StatusTopico status;
    private String autor;
    private String curso;

    public Topico(){}

    public Topico(DatosRegistroTopicos datosRegistroTopicos) {
        this.titulo = datosRegistroTopicos.titulo();
        this.mensaje = datosRegistroTopicos.mensaje();
        this.fecha = datosRegistroTopicos.fecha();
        this.status = datosRegistroTopicos.status();
        this.autor = datosRegistroTopicos.autor();
        this.curso = datosRegistroTopicos.curso();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public StatusTopico getStatus() {
        return status;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }

    public void actualizartopico(DatosActualizarTopico datosActualizarTopico) {
        if(datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if(datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.status() != null){
            this.status = datosActualizarTopico.status();
        }
        if (datosActualizarTopico.curso() != null){
            this.curso = datosActualizarTopico.curso();
        }
    }
}
