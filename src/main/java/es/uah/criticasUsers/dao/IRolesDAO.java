package es.uah.criticasUsers.dao;

import es.uah.criticasUsers.model.Rol;
import org.hibernate.id.IntegralDataTypeHolder;

import java.util.List;

public interface IRolesDAO {


    List<Rol> findAll();


    Rol findRolById(Integer idRol);

Rol findRolByRol (String rol);

    void saveRol(Rol rol);


    void deleteRol(Integer idRol);


}
