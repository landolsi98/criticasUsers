package es.uah.criticasUsers.Controller;

import es.uah.criticasUsers.model.Critica;
import es.uah.criticasUsers.service.ICriticasService;
import es.uah.criticasUsers.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CriticasController {


    @Autowired
    ICriticasService criticasService;

    @Autowired
    IUsersService usersService;


    @GetMapping("/criticas")
    public List<Critica> findAll(){
        return criticasService.findAll();
    }

    @GetMapping("/criticas/{id}")
    public Critica findCriticaById(Integer idCritica){
        return criticasService.findCriticaById(idCritica);
    }

    @GetMapping ("/criticas/film/{idFilm}")
    public List<Critica> findCriticaByIdFilm(@PathVariable ("idFilm") Integer idFilm){
        return criticasService.findCriticaByIdFilm(idFilm);
    }

    @PostMapping("/criticas")
    public void saveCritica(@RequestBody Critica critica) {
        System.out.println(critica.getUser());
        var user= critica.getUser();
        critica.setUser(usersService.findUserById(user.getIdUser()));
        criticasService.saveCritica(critica);
    }

    @DeleteMapping("/criticas/{id}")
    public void eliminarCritica(@PathVariable("id") Integer idCritica) {
        criticasService.deleteCritica(idCritica);
    }

}
