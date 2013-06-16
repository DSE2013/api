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
public class OperationType {

    @NotNull
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "isfor")
    private Set<TimeSlot> timeslot = new HashSet<TimeSlot>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Operation> operation = new HashSet<Operation>();
}
