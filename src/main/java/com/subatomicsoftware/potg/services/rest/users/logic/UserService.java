package com.subatomicsoftware.potg.services.rest.users.logic;

import com.subatomicsoftware.potg.services.rest.users.dao.UserRepository;
import com.subatomicsoftware.potg.services.rest.users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by slotterdesktop on 6/11/2016.
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUserById(Integer bnetId) {
        return userRepository.findByBnetId(bnetId);
    }

    public User getUserByTag(String bnetTag) {
        return userRepository.findByBnetTag(bnetTag);
    }

    public void updateUserById(User user) {
        User tmp = userRepository.findByBnetId(user.getBnetId());
        if(tmp == null){
            return; //todo
        }
        user.setId(tmp.getId());
        userRepository.save(user);
    }
}
