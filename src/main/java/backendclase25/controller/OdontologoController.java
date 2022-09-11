package backendclase25.controller;

import backendclase25.modelo.Odontologo;
import backendclase25.servicio.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    private final OdontologoService odontologoService;
    @Autowired
    public OdontologoController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }
    @PostMapping
    public Odontologo registrarOdontologo(@RequestBody Odontologo odontologo){
        return odontologoService.guardar(odontologo);
    }
    @GetMapping
    public List<Odontologo> buscarAllOdontologos(){
        return odontologoService.buscarTodos();
    }
}
