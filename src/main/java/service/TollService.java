package service;

import model.Location;
import model.Toll;
import model.TollBooth;
import repository.TollRepository;

import java.util.List;

public class TollService {
    public void addToll(String id, Location location, Integer numberOfTollBooths, List<TollBooth> tollBooths) {
    Toll toll = new Toll(id, location, numberOfTollBooths, tollBooths);
    TollRepository.tollMap.putIfAbsent(id, toll);
    }
}
