package com.xebia.wartelist.repository;

import com.xebia.wartelist.domain.Patient;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Patient.class)
public interface PatientRepository {

    List<com.xebia.wartelist.domain.Patient> findAll();
}
