package com.xebia.wartelist.repository;

import com.xebia.wartelist.domain.HospitalEmployee;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = HospitalEmployee.class)
public interface HospitalEmployeeRepository {

    List<com.xebia.wartelist.domain.HospitalEmployee> findAll();
}
