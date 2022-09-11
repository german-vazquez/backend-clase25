package backendclase25.servicio;

import backendclase25.dao.IDao;
import backendclase25.dao.PacienteDAOH2;
import backendclase25.modelo.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacienteService{

    private IDao<Paciente> pacienteIDao;

    public PacienteService() {
        this.pacienteIDao = new PacienteDAOH2();
    }

    public Paciente guardar(Paciente paciente) {
        return pacienteIDao.guardar(paciente);
    }

    public Paciente buscar(Integer id) {
        return pacienteIDao.buscar(id);
    }

    public Paciente buscarXCriterio(String criterio) {
        return pacienteIDao.buscarXCriterio(criterio);
    }

    public List<Paciente> buscarTodos() {
        return pacienteIDao.buscarTodos();
    }
}
