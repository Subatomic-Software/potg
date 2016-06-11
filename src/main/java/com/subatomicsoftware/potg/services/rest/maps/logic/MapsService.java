package com.subatomicsoftware.potg.services.rest.maps.logic;

import com.subatomicsoftware.potg.services.rest.maps.dao.MapsRepository;
import com.subatomicsoftware.potg.services.rest.maps.model.OwMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slotterdesktop on 6/9/2016.
 */
@Service
public class MapsService {

    @Autowired
    MapsRepository mapsRepository;

    public OwMap generateTestMap(){
        OwMap owMap = new OwMap();
        owMap.setMapName("jabrawlter");
        owMap.setMapType("KOTH");
        List list = new ArrayList<>();
        list.add("OFFENSE");
        list.add("DEFENCE");
        owMap.setMapRoles(list);
        owMap.setMapThumb("mapname.jpg");

        return mapsRepository.save(owMap);
    }

    public List<OwMap> getAllMaps() {
        return mapsRepository.findAll();
    }

    public OwMap getMapByName(String mapName) {
        return mapsRepository.findByMapName(mapName);
    }

    public List<OwMap> getMapByType(String mapType) {
        return mapsRepository.findByMapType(mapType);
    }

    public OwMap addMap(OwMap owMap) {
        return mapsRepository.save(owMap);
    }
}
