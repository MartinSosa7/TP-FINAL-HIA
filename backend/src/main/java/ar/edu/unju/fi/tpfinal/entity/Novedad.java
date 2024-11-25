package ar.edu.unju.fi.tpfinal.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Novedad {
    
    private int id;

    private Alquiler alquiler;

    private String descripcion;

    private String estado;

}
