package es.uah.criticasUsers.dao;

import es.uah.criticasUsers.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class UserDAOIm  implements IUsersDAO {

    @Autowired
    IUsersJPA usersJPA;

    @Autowired
    ICriticasJPA criticasJPA;

    @Override
    public List<User> findAll() {
        return usersJPA.findAll();
    }

    @Override
    public User findUserById(Integer idUser) {
        Optional<User> optional = usersJPA.findById(idUser);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public User findUserByUsername(String username) {
        Optional<User> optional = Optional.ofNullable(usersJPA.findByUsername(username));
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        Optional<User> optional = Optional.ofNullable(usersJPA.findByEmail(email));
        if (optional.isPresent()) {
            return optional.get();

        }
        return null;
    }



    @Override
    public User findUserByEmailPassword(String email, String password) {
        Optional<User> optional = Optional.ofNullable(usersJPA.findByEmailAndPassword(email, password));
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public void saveUser (User user){
        usersJPA.save(user);
    }
    @Override
    public void deleteUser (Integer idUser) {
        usersJPA.deleteById(idUser);
    }
    @Override
    public void updateUser (User user) {
        usersJPA.save(user);
    }
    @Override
    public void deleteCritica(Integer idUser, Integer idCritica) {
        User user = findUserById(idUser);
        if (user != null) {
            user.removeCritica(criticasJPA.findById(idCritica).orElse(null));
        }
        criticasJPA.deleteById(idCritica);
    }
}

