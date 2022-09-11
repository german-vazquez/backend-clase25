package backendclase25.controller;

import backendclase25.modelo.Paciente;
import backendclase25.servicio.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    private final PacienteService pacienteService;
    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }
    @PostMapping
    public Paciente registrarPaciente(@RequestBody Paciente paciente){
        return pacienteService.guardar(paciente);
    }
    @GetMapping
    public List<Paciente> buscarAllPacientes(){
        return pacienteService.buscarTodos();
    }
}
