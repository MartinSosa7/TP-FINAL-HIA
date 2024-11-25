package ar.edu.unju.fi.tpfinal.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Promocion {
    
    private int id;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private String descripcion;

    private String imagen;

    private Alquiler alquiler;

    private boolean disponible;

}
