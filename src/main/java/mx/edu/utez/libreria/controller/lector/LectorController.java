package mx.edu.utez.libreria.controller.lector;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

///Agregamos las anotaciones para decir que es un contralador
@RestController
///La ruta donde lo vamos a buscar
@RequestMapping("/lector")
@CrossOrigin({"*"})
public class LectorController {
}
