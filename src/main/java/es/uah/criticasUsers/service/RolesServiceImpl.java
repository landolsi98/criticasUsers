package es.uah.criticasUsers.service;

import es.uah.criticasUsers.dao.IRolesDAO;
import es.uah.criticasUsers.model.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImpl implements IRolesService {


    @Autowired
    IRolesDAO rolDAO;

    @Override
    public List<Rol> findAll() {
        return rolDAO.findAll();
    }

    @Override
    public Rol findRolById(Integer idRol) {
        return rolDAO.findRolById(idRol);
    }

    @Override
    public void saveRol(Rol rol) {

    }

    @Override
    public void deleteRol(Integer idRol) {

    }
}
