package com.Invertec.Proveedores.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vw_OrdenCompraProveedor_Detalle", schema= "dbo")
public class OCProveedor {

    @Id
    @Column(name = "Orden_Compra")
    private String ordenCompra;


    @Column(name = "Cliente")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String cliente;


    @Column(name = "Fecha")
    private String fecha;

    @Column(name = "Nombre_Proveedor")
    private String nombreProveedor;

    @Column(name = "Posicion")
    private String posicion;

    private String descripcionMaterial;

    private String cantidad;

    private String precioNeto;

    public String getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(String ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionMaterial(String descripcionMaterial) {
        this.descripcionMaterial = descripcionMaterial;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(String precioNeto) {
        this.precioNeto = precioNeto;
    }
}


