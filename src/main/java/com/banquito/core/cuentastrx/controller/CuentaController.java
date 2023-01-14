package com.banquito.core.cuentastrx.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banquito.core.cuentastrx.dto.CuentaRQ;
import com.banquito.core.cuentastrx.dto.CuentaRS;



@RestController
@RequestMapping("/api/v1/cuentas")
public class CuentaController {
    
    @PostMapping
    public ResponseEntity<?> crear(@RequestBody CuentaRQ cuenta) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modificar(@RequestBody CuentaRQ cuenta, @PathVariable String id) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CuentaRS> obtenerPorId(@PathVariable String id) {
        return null;
    }

    @GetMapping("/{estado}{fecha}")
    public ResponseEntity<List<CuentaRS>> obtenerCuentas(@PathVariable String estado, @PathVariable String fecha ) {
        return null;
    }
}
