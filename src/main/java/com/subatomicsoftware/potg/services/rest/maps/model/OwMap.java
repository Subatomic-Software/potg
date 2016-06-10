package com.subatomicsoftware.potg.services.rest.maps.model;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by slotterdesktop on 6/9/2016.
 */
public class OwMap {

    @Id
    private String id;
    private String mapName;
    private String mapType;
    private List<String> mapRoles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getMapType() {
        return mapType;
    }

    public void setMapType(String mapType) {
        this.mapType = mapType;
    }

    public List<String> getMapRoles() {
        return mapRoles;
    }

    public void setMapRoles(List<String> mapRoles) {
        this.mapRoles = mapRoles;
    }

    @Override
    public String toString() {
        return "OwMap{" +
                "id='" + id + '\'' +
                ", mapName='" + mapName + '\'' +
                ", mapType='" + mapType + '\'' +
                ", mapRoles=" + mapRoles +
                '}';
    }
}
