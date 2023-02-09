package es.uah.criticasUsers.dao;

import es.uah.criticasUsers.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersJPA extends JpaRepository<User, Integer> {

    User findByUsername (String username);
    User findByEmail (String email);

    User findByEmailAndPassword(String email, String password);
}
