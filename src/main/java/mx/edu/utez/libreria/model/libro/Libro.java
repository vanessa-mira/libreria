package mx.edu.utez.libreria.model.libro;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
///NOMBRE DE LA TABLA SIEMPRE ES DONDE ESTA EL MODEL
@Table(name = "Libros")
///DECLARAR QUE ES UNA ENTIDAD
@Entity
public class Libro {
    ///EL LIBRO NECESITA UN ID INCREMENTABLE
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    ///DEclaramos lo que va a llevar nuestra tabla
    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private int ejemplaresDisponibles;
}
