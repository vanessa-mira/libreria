package mx.edu.utez.libreria.controller.prestamo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//La notaciones para decir que es un contralador
@RestController
///La ruta en lo que lo vamos a buscar

@RequestMapping("/prestamo")
///Para dar permisos

@CrossOrigin({"*"})
public class PrestamoController {
}
