package com.subatomicsoftware.potg.services.rest.users.dao;

import com.subatomicsoftware.potg.services.rest.users.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by slotterdesktop on 6/11/2016.
 */
public interface UserRepository extends MongoRepository<User, String> {
    public User findByBnetId(Integer bnetId);
    public User findByBnetTag(String bnetTag);
}
