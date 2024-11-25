package ar.edu.unju.fi.tpfinal.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cuota {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Double monto;

    private LocalDate fechaCreacion;
    
    private LocalDate fechaVencimiento;

    private LocalDate fechaPago;

    private String medioPago;

    private String cuponQr;
    
    private boolean pagado;

}
