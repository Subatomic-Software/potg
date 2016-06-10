package com.subatomicsoftware.potg.services.rest.oauth2.controller;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by slotterdesktop on 6/9/2016.
 */
@RestController
public class OAuth2Controller {

    @RequestMapping({ "/user", "/me" })
    @ResponseBody
    public Map user(OAuth2Authentication auth) {
        HashMap details = (LinkedHashMap) auth.getUserAuthentication().getDetails();
        return details;
    }

}
