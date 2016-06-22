package com.subatomicsoftware.potg.services.rest.guides.dao;

import com.subatomicsoftware.potg.services.rest.guides.model.Guide;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by seezoo on 6/13/2016.
 */
public interface GuidesRepository extends MongoRepository<Guide, String> {
    public Guide findByGuideTitle(String guideTitle);
    public List<Guide> findByHeroName(String heroName);
}
