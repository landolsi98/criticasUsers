package es.uah.criticasUsers.Controller;


import es.uah.criticasUsers.model.Rol;
import es.uah.criticasUsers.service.IRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RolesController {

    @Autowired
    IRolesService rolesService;

    @GetMapping("/roles")
    public List<Rol> findAll() {
        return rolesService.findAll();
    }

    @GetMapping("/roles/{id}")
    public Rol findRolById(@PathVariable("id") Integer id) {
        return rolesService.findRolById(id);
    }

    @PostMapping("/roles")
    public void saveRol(@RequestBody Rol rol) {
        rolesService.saveRol(rol);
    }

    @DeleteMapping("/roles/{id}")
    public void deleteRol(@PathVariable("id") Integer id) {
        rolesService.deleteRol(id);
    }

}
