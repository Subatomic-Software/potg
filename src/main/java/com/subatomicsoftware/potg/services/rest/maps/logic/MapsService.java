package com.subatomicsoftware.potg.services.rest.maps.logic;

import com.subatomicsoftware.potg.services.rest.maps.dao.MapsRepository;
import com.subatomicsoftware.potg.services.rest.maps.model.OwMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by slotterdesktop on 6/9/2016.
 */
@Service
public class MapsService {

    @Autowired
    MapsRepository mapsRepository;

    public List<OwMap> getAllMaps() {
        return mapsRepository.findAll();
    }

    public OwMap getMapByName(String mapName) {
        return mapsRepository.findByMapName(mapName);
    }

    public List<OwMap> getMapByType(String mapType) {
        return mapsRepository.findByMapType(mapType);
    }
}
