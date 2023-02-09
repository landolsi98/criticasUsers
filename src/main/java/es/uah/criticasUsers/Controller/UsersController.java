package es.uah.criticasUsers.Controller;

import es.uah.criticasUsers.model.User;
import es.uah.criticasUsers.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    IUsersService usersService;


    @GetMapping("/users")
    public List<User> findAll() {
        return usersService.findAll();
    }

    @GetMapping("/users/{id}")
    public User findUserById(@PathVariable("id") Integer idUser){
        return usersService.findUserById(idUser);
    }

    @GetMapping("/users/email/{email}")
    public User findUserByEmail(@PathVariable("email") String email) {
        return usersService.findUserByEmail(email);
    }
    @GetMapping ("users/username/{username}")
    public User findUserByUsername(@PathVariable("username") String username) {
        return usersService.findUserByUsername(username);
    }

    @GetMapping("users/login/{email}/{password}")
    public User findUserByEmailWithPassword(@PathVariable("email") String email, @PathVariable ("password")String password) {
        return usersService.findUserByEmailPassword(email, password);
    }

    @PostMapping ("/users")
    public void saveUser(@RequestBody User user) {
        usersService.saveUser(user);
    }
    @PutMapping("/users")
    public void updateUser(@RequestBody User user){

        usersService.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable ("id") Integer idUser){
        usersService.deleteUser(idUser);
    }





}
