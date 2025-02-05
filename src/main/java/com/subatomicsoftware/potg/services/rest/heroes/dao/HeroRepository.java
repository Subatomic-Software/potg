package com.subatomicsoftware.potg.services.rest.heroes.dao;
import java.util.List;

import com.subatomicsoftware.potg.services.rest.heroes.model.Hero;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HeroRepository extends MongoRepository<Hero, String> {
    public Hero findByHeroName(String heroName);
    public List<Hero> findByHeroRole(String heroRole);
}
