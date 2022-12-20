package es.uah.criticasUsers.dao;

import es.uah.criticasUsers.model.Critica;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ICriticasDAO {

    List<Critica> findAll();

    List<Critica> findCriticaByIdFilm (Integer idFilm);

    Critica findCriticaById (Integer idCritica);

    void saveCritica(Critica critica);

    void deleteCritica(Integer idCritica);

}
