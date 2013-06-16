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
public class Hospital {

    @NotNull
    private String name;

    @NotNull
    private double latitude;

    @NotNull
    private double longitude;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "provides")
    private Set<TimeSlot> timeslot = new HashSet<TimeSlot>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "worksat")
    private Set<HospitalEmployee> hospitalemployee = new HashSet<HospitalEmployee>();
}
