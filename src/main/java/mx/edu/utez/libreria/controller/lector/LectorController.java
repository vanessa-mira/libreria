package mx.edu.utez.libreria.controller.lector;

import mx.edu.utez.libreria.model.lector.Lector;
import mx.edu.utez.libreria.service.lector.LectorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

///Agregamos las anotaciones para decir que es un contralador
@RestController
///La ruta donde lo vamos a buscar
@RequestMapping("/lector")
@CrossOrigin({"*"})
public class LectorController {

    private final LectorService lectorService;

    public LectorController(LectorService lectorService) {
        this.lectorService = lectorService;
    }

    @PutMapping("/{id}/rehabilitar")
    public ResponseEntity<Lector> rehabilitarLector(@PathVariable Long id) {
        return ResponseEntity.status(200).body(lectorService.rehabilitarLector(id));
    }
}


