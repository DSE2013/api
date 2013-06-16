package com.xebia.wartelist.repository;

import com.xebia.wartelist.domain.User;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = User.class)
public interface UserRepository {

    List<com.xebia.wartelist.domain.User> findAll();
}
