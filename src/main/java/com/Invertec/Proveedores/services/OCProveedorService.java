package com.Invertec.Proveedores.services;

import com.Invertec.Proveedores.entities.OCProveedor;
import com.Invertec.Proveedores.repositories.OCProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OCProveedorService{

    @Autowired
    private OCProveedorRepository ocProveedorRepository;



    public List<OCProveedor> findByNombreCliente(String cliente) {
        List<OCProveedor> ListOcProveedor = ocProveedorRepository.findByNombreCliente(cliente);

        // Formatear string antes de devolver la lista

        ListOcProveedor.forEach(ocProveedor -> {
            ocProveedor.setNombreProveedor(ocProveedor.getNombreProveedor().trim());
            ocProveedor.setDescripcionMaterial(ocProveedor.getDescripcionMaterial().trim());

            // Formatear fecha

            String fechaOriginal = ocProveedor.getFecha();
            if(fechaOriginal != null && fechaOriginal.length() == 8){
                String fechaFormateada = fechaOriginal.substring(6,8) + "-" +
                                         fechaOriginal.substring(4,6) + "-" +
                                         fechaOriginal.substring(0,4);

                ocProveedor.setFecha(fechaFormateada);

            }
        });

        return ListOcProveedor;

    }
}
