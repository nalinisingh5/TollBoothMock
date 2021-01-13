package model;

import java.util.List;

public class Toll {
    private String id;
    private Location location;
    private Integer tollBooths;
    private List<TollBooth> tollBoothList;

    public Toll(String id, Location location, Integer tollBooths) {
        this.id = id;
        this.location = location;
        this.tollBooths = tollBooths;
    }

    public Toll(String id, Location location, Integer tollBooths, List<TollBooth> tollBoothList) {
        this.id = id;
        this.location = location;
        this.tollBooths = tollBooths;
        this.tollBoothList = tollBoothList;
    }
}
