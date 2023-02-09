package es.uah.criticasUsers.service;

import es.uah.criticasUsers.dao.ICriticasDAO;
import es.uah.criticasUsers.dao.IUsersDAO;
import es.uah.criticasUsers.model.Critica;
import es.uah.criticasUsers.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CriticasServiceIm implements ICriticasService{


    @Autowired
    ICriticasDAO criticasDAO;

    @Autowired
    IUsersDAO usersDAO;

    @Override
    public List<Critica> findAll() {
        return criticasDAO.findAll();
    }

    @Override
    public Critica findCriticaById(Integer idCritica) {
        return  criticasDAO.findCriticaById(idCritica);
    }

    @Override
    public List<Critica> findCriticaByIdFilm(Integer idFilm) {
        return criticasDAO.findCriticaByIdFilm(idFilm);
    }

    @Override
    public void saveCritica(Critica critica) {
       // User user = usersDAO.findUserById(1);
      //  critica.setUser(user);
        criticasDAO.saveCritica(critica);

    }

    @Override
    public void deleteCritica(Integer idCritica) {
        criticasDAO.deleteCritica(idCritica);

    }
}
