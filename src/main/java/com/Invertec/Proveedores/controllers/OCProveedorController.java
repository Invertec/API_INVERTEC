package com.Invertec.Proveedores.controllers;

import com.Invertec.Proveedores.entities.OCProveedor;
import com.Invertec.Proveedores.services.OCProveedorService;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/invertec")
@CrossOrigin(origins = "*")
public class OCProveedorController {

    @Autowired
    private OCProveedorService ocProveedorService;

    @GetMapping("/proveedor/{cliente}")
    public ResponseEntity<?> getOCProveedor2(@PathVariable @NotBlank(message = "Por favor ingresar código de cliente") String cliente) {

        // Validación 1: Verificar si el cliente es nulo o está vacío
        if (cliente == null || cliente.trim().isEmpty()) {
            return new ResponseEntity<>("El parámetro 'cliente' no puede estar vacío.", HttpStatus.BAD_REQUEST);
        }

        // Validación 3: Verificar si el resultado de la consulta está vacío
        List<OCProveedor> resultado = ocProveedorService.findByNombreCliente(cliente);
        if (resultado.isEmpty()) {
            return new ResponseEntity<>("No se encontraron datos para el cliente proporcionado.", HttpStatus.NOT_FOUND);
        }

        // Si todo está bien, retornar los datos
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }
}
