package com.xebia.wartelist.repository;

import com.xebia.wartelist.domain.Doctor;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Doctor.class)
public interface DoctorRepository {

    List<com.xebia.wartelist.domain.Doctor> findAll();
}
