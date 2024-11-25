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
public class Alquiler {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String numeroAlquiler;

    private int cantidadMesAlquiler;

    private Double plazoMes;

    private Double costoAlquiler;

    private LocalDate fechaAlquiler;

}
