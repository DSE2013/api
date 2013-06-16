package com.xebia.wartelist.repository;

import com.xebia.wartelist.domain.TimeSlot;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = TimeSlot.class)
public interface TimeSlotRepository {

    List<com.xebia.wartelist.domain.TimeSlot> findAll();
}
