package backendclase25.controller;

import backendclase25.modelo.Odontologo;
import backendclase25.modelo.Paciente;
import backendclase25.servicio.OdontologoService;
import backendclase25.servicio.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/index")
public class InicioController {
    private final PacienteService pacienteService;
    private final OdontologoService odontologoService;

    @Autowired
    public InicioController(PacienteService pacienteService, OdontologoService odontologoService) {
        this.pacienteService = pacienteService;
        this.odontologoService = odontologoService;
    }
    @GetMapping
    public String mostrarDatosDePrueba(Model model, @RequestParam("email") String email, @RequestParam("id") Integer id){
        Paciente paciente= pacienteService.buscarXCriterio(email);
        model.addAttribute("nombre", paciente.getNombre());
        model.addAttribute("apellido", paciente.getApellido());
        Odontologo odontologo = odontologoService.buscar(id);
        model.addAttribute("matricula", odontologo.getMatricula());
        return "index";
    }
}
