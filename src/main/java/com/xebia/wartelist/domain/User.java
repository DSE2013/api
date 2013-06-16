package com.xebia.wartelist.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
public class User {

    @NotNull
    private String email;

    @NotNull
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Notification> notification = new HashSet<Notification>();
}
