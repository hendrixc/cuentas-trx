package com.banquito.core.cuentastrx.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor 
public class CuentaCliente {

    @Id
    private String codigo;
    private String codigoProducto;
    private String codigoCliente;
    private String codigoAgencia;
    private String numeroCuenta;
    private Date fechaCreacion;
    private BigDecimal saldoDiaponible;
    private BigDecimal saldoContable;
    private Date fechaUltimaActualizacion;
    
    @OneToMany(mappedBy = "cuenta")
    private List<TransaccionCuenta> transacciones;

    public CuentaCliente(String codigo) {
        this.codigo = codigo;
    }

    
}
