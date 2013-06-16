package com.xebia.wartelist.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
public class Doctor {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reserves")
    private Set<Operation> operation = new HashSet<Operation>();

    @OneToOne
    private User user1;
}
