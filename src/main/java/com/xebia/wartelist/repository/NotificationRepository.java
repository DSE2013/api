package com.xebia.wartelist.repository;

import com.xebia.wartelist.domain.Notification;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Notification.class)
public interface NotificationRepository {

    List<com.xebia.wartelist.domain.Notification> findAll();
}
