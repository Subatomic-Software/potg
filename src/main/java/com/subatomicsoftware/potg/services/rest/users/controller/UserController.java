package com.subatomicsoftware.potg.services.rest.users.controller;

import com.subatomicsoftware.potg.services.rest.users.logic.UserService;
import com.subatomicsoftware.potg.services.rest.users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by slotterdesktop on 6/11/2016.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody User getUser(@RequestParam(value = "bnetTag",required = true)  String bnetTag){

        User user = null;
        if(bnetTag != null){
            user = userService.getUserByTag(bnetTag);
        }
        return user;

    }

    @RequestMapping(path = "/{id}",method= RequestMethod.GET)
    public @ResponseBody User getUserById(@PathVariable("id") Integer bnetId){

        User user = null;
        if(bnetId != null){
            user = userService.getUserById(bnetId);
        }
        return user;
    }

    @RequestMapping(method= RequestMethod.PUT)
    public @ResponseBody void updateUser(@RequestBody User user){

        userService.updateUserById(user);

    }

}
