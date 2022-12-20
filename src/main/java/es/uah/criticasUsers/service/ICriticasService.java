package es.uah.criticasUsers.service;

import es.uah.criticasUsers.model.Critica;

import java.util.List;

public interface ICriticasService {

    List<Critica> findAll();

    Critica findCriticaById(Integer idCritica);

    List<Critica> findCriticaByIdFilm(Integer idFilm);

    void saveCritica(Critica critica);

    void deleteCritica(Integer idCritica);
}
