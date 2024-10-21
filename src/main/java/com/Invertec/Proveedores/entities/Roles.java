package com.Invertec.Proveedores.entities;

import jakarta.persistence.*;

@Entity
@Table(name="roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private  String nombre_rol;

    public Roles(){

    }

    public Roles(String nombre_rol){
        this.nombre_rol = nombre_rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }
}
