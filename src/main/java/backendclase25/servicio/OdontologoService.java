package backendclase25.servicio;

import backendclase25.dao.IDao;
import backendclase25.dao.OdontologoDAOH2;
import backendclase25.modelo.Odontologo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OdontologoService{

    private IDao<Odontologo> odontologoIDao;

    public OdontologoService() {
        this.odontologoIDao = new OdontologoDAOH2();
    }

    public Odontologo guardar(Odontologo odontologo) {
        return odontologoIDao.guardar(odontologo);
    }

    public Odontologo buscar(Integer id) {
        return odontologoIDao.buscar(id);
    }

        public Odontologo buscarXCriterio(String criterio) {
        return odontologoIDao.buscarXCriterio(criterio);
    }

    public List<Odontologo> buscarTodos() {
        return odontologoIDao.buscarTodos();
    }
}
