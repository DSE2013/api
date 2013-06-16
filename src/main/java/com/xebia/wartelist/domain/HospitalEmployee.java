package com.xebia.wartelist.domain;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
public class HospitalEmployee {

    @OneToOne
    private User user1;

    @ManyToOne
    private Hospital hospital;
}
