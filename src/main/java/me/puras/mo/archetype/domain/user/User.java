package me.puras.mo.archetype.domain.user;

import lombok.Data;
import me.puras.mo.common.domain.DomainModel;

@Data
public class User extends DomainModel {
    private String name;
    private String avatar;
    private String email;
}
