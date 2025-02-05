package com.subatomicsoftware.potg.services.rest.maps.controller;

import com.subatomicsoftware.potg.services.rest.maps.dao.MapsRepository;
import com.subatomicsoftware.potg.services.rest.maps.logic.MapsService;
import com.subatomicsoftware.potg.services.rest.maps.model.OwMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slotterdesktop on 6/9/2016.
 */
@RestController
@RequestMapping("/api/maps")
public class MapsController {

    @Autowired
    MapsService mapsService;

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody List<OwMap> getMaps(@RequestParam(value = "mapName",required = false)  String mapName,
                                             @RequestParam(value = "mapType",required = false)  String mapType){
        List<OwMap> maps = new ArrayList<>();
        if(mapName == null && mapType == null){
            return mapsService.getAllMaps();
        }else if(mapName != null){
            maps.add(mapsService.getMapByName(mapName));
        }else if(mapType != null){
            maps.addAll(mapsService.getMapByType(mapType));
        }
        return maps;
    }

    @RequestMapping(method= RequestMethod.POST)
    public @ResponseBody OwMap createMap(@RequestBody OwMap owMap){
        return mapsService.addMap(owMap);
    }

    @RequestMapping(path = "/test", method= RequestMethod.GET)
    public @ResponseBody OwMap createTestMap(){
        return mapsService.generateTestMap();
    }

}
