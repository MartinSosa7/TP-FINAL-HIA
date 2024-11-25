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
public class Alquiler {
    
    private int id;

    private String numeroAlquiler;

    private int cantidadMesAlquiler;

    private Double plazoMes;

    private Double costoAlquiler;

    private LocalDate fechaAlquiler;

    private Cuota cuota;

    private Usuario usuario;

    private Local local;

}
