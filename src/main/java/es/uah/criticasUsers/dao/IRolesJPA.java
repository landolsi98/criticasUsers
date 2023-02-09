package es.uah.criticasUsers.dao;

import es.uah.criticasUsers.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRolesJPA  extends JpaRepository<Rol, Integer> {

    Rol findByRol (String rol);


}

