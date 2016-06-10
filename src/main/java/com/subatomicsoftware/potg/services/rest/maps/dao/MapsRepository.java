package com.subatomicsoftware.potg.services.rest.maps.dao;

import com.subatomicsoftware.potg.services.rest.maps.model.OwMap;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by slotterdesktop on 6/9/2016.
 */
public interface MapsRepository extends MongoRepository<OwMap, String> {
    public OwMap findByMapName(String mapName);
    public List<OwMap> findByMapType(String mapType);
}
