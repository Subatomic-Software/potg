package com.subatomicsoftware.potg.restservices.heroes.controller;

        import com.subatomicsoftware.potg.restservices.heroes.model.Hero;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.bind.annotation.RestController;

/**
 * Created by seezoo on 6/6/2016.
 */
@RestController
@RequestMapping("/heroes")
public class HeroEndPoints {

    @RequestMapping(method= RequestMethod.GET,path = "/{hero_id}")
    public @ResponseBody Hero getHero() {
        Hero h1 = new Hero();
        return h1;
    }

    @RequestMapping(method= RequestMethod.PUT,path = "/{hero_id}")
    public @ResponseBody void setHero() {

    }

}
