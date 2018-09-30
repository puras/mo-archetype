package me.puras.mo.archetype.serv.user;

import me.puras.mo.archetype.domain.user.User;
import me.puras.mo.common.service.CrudRepository;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository extends CrudRepository<User> {
}
