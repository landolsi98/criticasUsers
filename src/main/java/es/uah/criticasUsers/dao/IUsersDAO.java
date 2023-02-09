package es.uah.criticasUsers.dao;

import es.uah.criticasUsers.model.User;

import java.util.List;

public interface IUsersDAO {

    List<User> findAll();

    User findUserById(Integer idUser);

    User findUserByUsername (String username);

    User findUserByEmail (String email);


    User findUserByEmailPassword(String email, String password);


    void saveUser(User user);

    void deleteUser (Integer idUser);

    void updateUser (User user);

    void deleteCritica (Integer idUser, Integer idCritica);

}
