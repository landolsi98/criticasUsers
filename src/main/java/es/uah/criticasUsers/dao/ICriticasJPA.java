package es.uah.criticasUsers.dao;

import es.uah.criticasUsers.model.Critica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICriticasJPA extends JpaRepository<Critica, Integer> {

    List<Critica> findByIdFilm(int idFilm);
}
