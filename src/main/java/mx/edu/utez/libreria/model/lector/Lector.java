package mx.edu.utez.libreria.model.lector;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

///Las notaciones
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

///Decimos que es una entidad
@Entity

///Nombre de la tabla en la base de datos

@Table(name = "Lector")

public class Lector {
    ///LO que llavará nuestra tabla de base de datos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
///Utlizamos los column
@Column(nullable = false)
    private String nombre;

@Column(nullable = false)
    private boolean activo;

@Column(nullable = false)
    private boolean membresiaPremium;
}
