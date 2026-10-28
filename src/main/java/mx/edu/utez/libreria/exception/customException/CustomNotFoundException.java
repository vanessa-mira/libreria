package mx.edu.utez.libreria.exception.customException;

public class CustomNotFoundException extends RuntimeException {
    public CustomNotFoundException(String mensaje) {
        super (mensaje);
    }
}
