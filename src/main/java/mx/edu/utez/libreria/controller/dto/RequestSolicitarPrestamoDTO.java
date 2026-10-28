package mx.edu.utez.libreria.controller.dto;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//Agregamos las anotaciones
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RequestSolicitarPrestamoDTO {

    //Declaramos los que se necesita para el prestamo del libro
    //El id del lector y el id del libro
    @NotNull(message = "El id del lector es obligatorio")
private Long LectorId;

    @NotNull(message = "El id del libro es obligatorio")
    private Long LibroId;





}
