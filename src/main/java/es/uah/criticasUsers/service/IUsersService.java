package es.uah.criticasUsers.service;

import es.uah.criticasUsers.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUsersService {

    List<User> findAll();

    User findUserById (Integer idUser);

    User findUserByUsername(String username);

    User findUserByEmail (String email);

    User findUserByEmailPassword (String email, String password);

    void saveUser(User user);

    void deleteUser(Integer idUser);

    void updateUser(User user);

    void deleteCritica(Integer idUser, Integer idCritica);


}
