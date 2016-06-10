package com.subatomicsoftware.potg.services.rest.heroes.controller;

        import com.subatomicsoftware.potg.services.rest.heroes.logic.HeroesService;
        import com.subatomicsoftware.potg.services.rest.heroes.model.Hero;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.MediaType;
        import org.springframework.web.bind.annotation.*;

/**
 * Created by seezoo on 6/6/2016.
 */
@RestController
@RequestMapping("/heroes/{id}")
public class HeroController {

    @Autowired
    HeroesService heroesService;

    @RequestMapping(method=RequestMethod.GET,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Hero getHero(@PathVariable("id") String heroId) {
        if(heroId!=null) {
            return heroesService.getHeroById(heroId);
        }
        return null;
    }

    @RequestMapping(method= RequestMethod.PUT)
    public @ResponseBody Hero setHero(@PathVariable("id") String heroId) {


        return null;
    }

    @RequestMapping(method= RequestMethod.DELETE)
    public @ResponseBody void deleteHero(@PathVariable("id") String heroId) {
        heroesService.deleteHero(heroId);
    }

}
