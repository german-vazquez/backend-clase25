package backendclase25.servicio;

import backendclase25.dao.DomicilioDAOH2;
import backendclase25.dao.IDao;
import backendclase25.modelo.Domicilio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DomicilioService {
    private IDao<Domicilio> domicilioIDao;

    public DomicilioService() {
        this.domicilioIDao = new DomicilioDAOH2();
    }

    public Domicilio guardar(Domicilio domicilio){
        return domicilioIDao.guardar(domicilio);
    }

    public Domicilio buscarDomicilioXId(Integer id){
        return domicilioIDao.buscar(id);
    }

    public List<Domicilio> buscarTodos(){
        return domicilioIDao.buscarTodos();
    }
}
