package mx.edu.utez.libreria.exception.customException;

public class CustomBadRequestException extends RuntimeException{
    public CustomBadRequestException(String mensaje){
        super(mensaje);
    }
}
