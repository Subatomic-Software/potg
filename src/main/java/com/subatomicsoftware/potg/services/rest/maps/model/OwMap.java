package com.subatomicsoftware.potg.services.rest.maps.model;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by slotterdesktop on 6/9/2016.
 */
public class OwMap {

    @Id
    private String mapId;
    private String mapName;
    private String mapType;
    private List<String> mapRoles;
    private String mapThumb;

    public String getMapId() {
        return mapId;
    }

    public void setMapId(String mapId) {
        this.mapId = mapId;
    }

    public String getMapName() {
        return mapName;
    }

    @Required
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getMapType() {
        return mapType;
    }

    @Required
    public void setMapType(String mapType) {
        this.mapType = mapType;
    }

    public List<String> getMapRoles() {
        return mapRoles;
    }

    @Required
    public void setMapRoles(List<String> mapRoles) {
        this.mapRoles = mapRoles;
    }

    @Override
    public String toString() {
        return "OwMap{" +
                "mapId='" + mapId + '\'' +
                ", mapName='" + mapName + '\'' +
                ", mapType='" + mapType + '\'' +
                ", mapRoles=" + mapRoles +
                '}';
    }

    public String getMapThumb() {
        return mapThumb;
    }

    @Required
    public void setMapThumb(String mapThumb) {
        this.mapThumb = mapThumb;
    }
}
