package com.Invertec.Proveedores.repositories;

import com.Invertec.Proveedores.entities.OCProveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OCProveedorRepository extends JpaRepository<OCProveedor, String> {

    // Buscar por el nombre del proveedor utilizando una consulta SQL
    @Query(value = "SELECT * FROM dbo.vw_OrdenCompraProveedor_Detalle WHERE Cliente = ?1", nativeQuery = true)
    List<OCProveedor> findByNombreCliente(String cliente);

}
