package es.uah.criticasUsers.service;

import es.uah.criticasUsers.dao.IRolesDAO;
import es.uah.criticasUsers.dao.IUsersDAO;
import es.uah.criticasUsers.model.Rol;
import es.uah.criticasUsers.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceIm implements IUsersService{


    @Autowired
    IUsersDAO usersDAO;
@Autowired

    IRolesDAO rolesDAO;

    @Override
    public List<User> findAll() {
        return usersDAO.findAll();
    }

    @Override
    public User findUserById(Integer idUser) {
        return usersDAO.findUserById(idUser);
    }

    @Override
    public User findUserByUsername(String username) {
        return usersDAO.findUserByUsername(username);
    }

    @Override
    public User findUserByEmail(String email) {
        return usersDAO.findUserByEmail(email);
    }

    @Override
    public User findUserByEmailPassword(String email, String password) {
        return usersDAO.findUserByEmailPassword(email, password);
    }

    @Override
    public void saveUser(User user) {
        Rol rol = rolesDAO.findRolByRol("User");
        user.setRol(rol);
        usersDAO.saveUser(user);

    }

    @Override
    public void deleteUser(Integer idUser) {
        usersDAO.deleteUser(idUser);

    }

    @Override
    public void updateUser(User user) {
        Rol rol = rolesDAO.findRolByRol("User");
        user.setRol(rol);
        usersDAO.updateUser(user);

    }

    @Override
    public void deleteCritica(Integer idUser, Integer idCritica) {
        usersDAO.deleteCritica(idUser, idCritica);

    }
}

