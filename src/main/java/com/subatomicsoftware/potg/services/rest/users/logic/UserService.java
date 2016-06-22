package com.subatomicsoftware.potg.services.rest.users.logic;

import com.subatomicsoftware.potg.services.rest.users.dao.UserRepository;
import com.subatomicsoftware.potg.services.rest.users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

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

    public User updateUser(User user) {
        User tmp = userRepository.findByBnetId(user.getBnetId());
        if(tmp == null){
            return userRepository.save(user);
        }
        user.setUserId(tmp.getUserId());
        return userRepository.save(user);
    }

    public User userLogin(HashMap bnetHash) {
        User user;
        String bnetTag = (String) bnetHash.get("battletag");
        Integer bnetId = (Integer) bnetHash.get("id");
        user = getUserById(bnetId);
        if(user == null){
            user = new User();
            user.setBnetId(bnetId);
            user.setBnetTag(bnetTag);
            user = userRepository.save(user);
        }
        return user;
    }

    public User linkUserTwitch(HashMap details, Integer bnetId) {
        User user = getUserById(bnetId);
        if(user != null){
            user.setTwitchURL((String) details.get("url"));
            user = updateUser(user);
        }
        return user;
    }
}
