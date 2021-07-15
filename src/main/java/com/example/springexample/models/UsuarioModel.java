/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springexample.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *s
 * @author rsaldana
 */
@Entity
@Table(name = "usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long usuario_id;
    
    @NotNull
    @Size(min = 3, message = "Se requiere entrar un Nombre.")
    @Pattern(regexp = "[a-z]", message = "Solo Letras")
    private String nombre;
    @NotNull
    @Size(min = 3, message = "Se requiere entrar un Apellido")
    @Pattern(regexp = "[a-z]", message = "Solo Letras")
    private String apellido;
    @NotNull
    @Size(min = 1, message = "Se requiere entrar la Edad.")
    @Pattern(regexp = "[1-9]", message = "Solo Numero")
    private Integer edad;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contacto_id")
    @Pattern(regexp = "[0-9]", message = "Solo Numero")
    private ContactoModel contacto_id_usuario;
    
    
    
    

    public Long getId() {
        return usuario_id;
    }

    public void setId(Long id) {
        this.usuario_id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public ContactoModel getContacto_id_usuario() {
        return contacto_id_usuario;
    }

    public void setContacto_id_usuario(ContactoModel contacto_id_usuario) {
        this.contacto_id_usuario = contacto_id_usuario;
    }

    
    
    
}
