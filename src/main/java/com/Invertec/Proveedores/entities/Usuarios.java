package com.Invertec.Proveedores.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String usuario;

    private String contraseña;

    @ManyToMany
    @JoinTable(
            name = "usuarios_roles",
            joinColumns  = @JoinColumn(name="usuario_id"),
            inverseJoinColumns  = @JoinColumn(name="rol_id"),
            uniqueConstraints = { @UniqueConstraint(columnNames = {"usuario_id, rol_id"})}
    )
    private List<Roles> roles;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }
}
