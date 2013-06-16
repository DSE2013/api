package com.xebia.wartelist.repository;

import com.xebia.wartelist.domain.OperationType;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = OperationType.class)
public interface OperationTypeRepository {

    List<com.xebia.wartelist.domain.OperationType> findAll();
}
