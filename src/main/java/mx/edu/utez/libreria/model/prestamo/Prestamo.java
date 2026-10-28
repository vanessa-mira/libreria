package mx.edu.utez.libreria.model.prestamo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
///Nombre de la tabla
@Table(name="Prestamos")

///Declaramos que es una entidad
@Entity

public class Prestamo {
    ///id (Long)
    /// lector (ManyToOne)
    /// libro (ManyToOne)
    /// fechaPrestamo (LocalDate)
    /// fechaDevolucionMaxima (LocalDate)
    /// estado (PRESTADO, DEVUELTO, VENCIDO)

    ///El id nescesita un id autoincremetable
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private ManyToOne lector;
    private ManyToOne libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucionMaxima;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoPrestamo estado;
}
