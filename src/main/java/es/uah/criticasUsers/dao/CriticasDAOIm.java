package es.uah.criticasUsers.dao;

import es.uah.criticasUsers.model.Critica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CriticasDAOIm  implements ICriticasDAO{

    @Autowired
    ICriticasJPA criticasJPA;

    @Override
    public List<Critica> findAll() {
        return criticasJPA.findAll();
    }

    @Override
    public List<Critica> findCriticaByIdFilm(Integer idFilm) {
        return criticasJPA.findByIdFilm(idFilm);
    }

    @Override
    public Critica findCriticaById(Integer idCritica) {
        Optional<Critica> optional = criticasJPA.findById(idCritica);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }


    @Override
    public void saveCritica(Critica critica) {
        criticasJPA.save(critica);
    }

    @Override
    public void deleteCritica(Integer idCritica) {
        criticasJPA.deleteById(idCritica);
    }
}
