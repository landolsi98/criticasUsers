package es.uah.criticasUsers.service;

import es.uah.criticasUsers.dao.ICriticasDAO;
import es.uah.criticasUsers.model.Critica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CriticasServiceIm implements ICriticasService{


    @Autowired
    ICriticasDAO criticasDAO;

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
        criticasDAO.saveCritica(critica);

    }

    @Override
    public void deleteCritica(Integer idCritica) {
        criticasDAO.deleteCritica(idCritica);

    }
}
