package es.uah.criticasUsers.dao;


import es.uah.criticasUsers.model.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RolesDAOImpl implements IRolesDAO {

    @Autowired
    IRolesJPA rolJPA;

    @Override
    public List<Rol> findAll() {
        return rolJPA.findAll();
    }

    @Override
    public Rol findRolById(Integer idRol) {
        Optional<Rol> optional = rolJPA.findById(idRol);
        if (optional.isPresent())  {
        return optional.get();
    }
      return null;

}
@Override
public Rol findRolByRol(String rol){
    return rolJPA.findByRol(rol);

}

    @Override
    public void saveRol(Rol rol) {
        rolJPA.save(rol);

    }

    @Override
    public void deleteRol(Integer idRol) {
        rolJPA.deleteById(idRol);

    }
}
