package me.puras.mo.archetype.ctrl.rest;

import me.puras.mo.archetype.Constants;
import me.puras.mo.archetype.domain.user.User;
import me.puras.mo.archetype.serv.user.UserService;
import me.puras.mo.common.controller.CrudController;
import me.puras.mo.common.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.REST_PREFIX + "/users")
public class UserController extends CrudController<User> {
    @Autowired
    private UserService service;

    @Override
    public CrudService<User> getService() {
        return service;
    }
}
