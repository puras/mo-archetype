package me.puras.mo.archetype.serv.user;

import me.puras.mo.archetype.domain.user.User;
import me.puras.mo.common.service.CrudRepository;
import me.puras.mo.common.service.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends CrudServiceImpl<User> implements UserService {
    @Autowired
    private UserRepository repo;

    @Override
    public CrudRepository<User> getRepository() {
        return repo;
    }
}
