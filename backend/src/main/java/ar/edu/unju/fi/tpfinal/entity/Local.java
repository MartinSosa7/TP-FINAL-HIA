package ar.edu.unju.fi.tpfinal.entity;

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
public class Local {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
