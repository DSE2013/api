package com.xebia.wartelist.repository;

import com.xebia.wartelist.domain.Operation;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Operation.class)
public interface OperationRepository {

    List<com.xebia.wartelist.domain.Operation> findAll();
}
