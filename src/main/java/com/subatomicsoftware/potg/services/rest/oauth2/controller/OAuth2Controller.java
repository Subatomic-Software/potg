package com.subatomicsoftware.potg.services.rest.oauth2.controller;

import com.subatomicsoftware.potg.services.rest.users.controller.UserController;
import com.subatomicsoftware.potg.services.rest.users.logic.UserService;
import com.subatomicsoftware.potg.services.rest.users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by slotterdesktop on 6/9/2016.
 */
@RestController
public class OAuth2Controller {

    @Autowired
    UserService userService;

    @RequestMapping({ "/user", "/me" })
    public @ResponseBody User user(OAuth2Authentication auth,
                                   @RequestParam(value = "bnetId", required = false) Integer bnetId) {
        HashMap details = (LinkedHashMap) auth.getUserAuthentication().getDetails();
        User user = null;

        if(details.containsKey("battletag")) {
            user = userService.userLogin(details);
        }else if(details.containsKey("url") && bnetId != null){
            user = userService.linkUserTwitch(details, bnetId);
        }

        return user;
    }

}
