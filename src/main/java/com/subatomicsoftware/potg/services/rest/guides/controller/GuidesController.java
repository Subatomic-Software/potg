package com.subatomicsoftware.potg.services.rest.guides.controller;

import com.subatomicsoftware.potg.services.rest.guides.logic.GuidesService;
import com.subatomicsoftware.potg.services.rest.guides.model.Guide;
import com.subatomicsoftware.potg.services.rest.heroes.logic.HeroesService;
import com.subatomicsoftware.potg.services.rest.heroes.model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seezoo on 6/13/2016.
 */
@RestController
@RequestMapping("/api/guides")
public class GuidesController {

    @Autowired
    private GuidesService guidesService;

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody
    List<Guide> getGuides(@RequestParam(value = "heroName",required = false)  String heroName,
                          @RequestParam(value = "guideTitle",required = false)  String guideTitle) {
        List<Guide> guides = new ArrayList<>();
        if(heroName==null && guideTitle==null) {
            return guidesService.getAllGuides();
        }else if(heroName!= null){
            guides.addAll(guidesService.findGuidesByHeroName(heroName));
        }else if(guideTitle!= null){
            guides.add(guidesService.findGuideByTitle(guideTitle));
        }
        return guides;
    }

    @RequestMapping(method= RequestMethod.POST)
    public @ResponseBody Guide creatGuide(@RequestBody Guide guide) {
        return guidesService.saveGuide(guide);
    }

    @RequestMapping(path="/test",method= RequestMethod.GET)
    public @ResponseBody Guide createTestGuide() {
        return guidesService.generateTestGuide();
    }
}
