package ar.edu.unju.fi.tpfinal.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Local {
    
    private int id;

    private String numero;

    private String nombre;

    private String superficie;

    private boolean habilitado;

    private Double costoMes;

    private String logo;

    private String imagen;

    private boolean alquilado;

    private String rubro;

}
