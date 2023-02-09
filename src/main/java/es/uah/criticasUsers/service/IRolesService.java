package es.uah.criticasUsers.service;

import es.uah.criticasUsers.model.Rol;

import java.util.List;

public interface IRolesService {

    List<Rol> findAll();

    Rol findRolById(Integer idRol);

    void saveRol(Rol rol);

    void deleteRol(Integer idRol);

}