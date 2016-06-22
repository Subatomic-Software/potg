package com.subatomicsoftware.potg.services.rest.guides.logic;

import com.subatomicsoftware.potg.services.rest.guides.dao.GuidesRepository;
import com.subatomicsoftware.potg.services.rest.guides.model.Guide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seezoo on 6/13/2016.
 */
@Service
public class GuidesService {

    @Autowired
    private GuidesRepository guidesRepository;

    public Guide generateTestGuide(){
        Guide guide = new Guide();

        guide.setGuideTitle("Fire Winston on Fire");
        guide.setHeroName("WINSTON");
        guide.setHeroImg("winston img");
        return guidesRepository.save(guide);
    }

    public Guide saveGuide(Guide guide){
        return guidesRepository.save(guide);
    }

    public Guide findGuideByTitle(String guideTitle){
        return guidesRepository.findByGuideTitle(guideTitle);
    }

    public List<Guide> findGuidesByHeroName(String heroName){
        List<Guide> guides = guidesRepository.findByHeroName(heroName);
        return guides;
    }

    public List<Guide> getAllGuides(){
        return guidesRepository.findAll();
    }
}
