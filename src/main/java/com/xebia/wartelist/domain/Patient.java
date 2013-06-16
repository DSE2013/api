package com.xebia.wartelist.domain;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
public class Patient {

    @NotNull
    private String ssn;

    @NotNull
    private double latitude;

    @NotNull
    private double longitude;

    @OneToOne
    private User user1;
}
