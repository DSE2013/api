package com.xebia.wartelist.repository;

import com.xebia.wartelist.domain.Hospital;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Hospital.class)
public interface HospitalRepository {

    List<com.xebia.wartelist.domain.Hospital> findAll();
}
