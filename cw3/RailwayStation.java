package cw3;

import java.util.ArrayList;
import java.util.List;

public class RailwayStation {

    private String name;
    private int platformsNumber;
    private List<Train> trains = new ArrayList<>();


    public RailwayStation(String name) {
        setName(name);
        platformsNumber = 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name cannot be empty");
        }
        this.name = name;
    }

    public int getPlatformsNumber() {
        return platformsNumber;
    }

    public void setPlatformsNumber(int platformsNumber) {
        if (platformsNumber < 3) {
            throw new RuntimeException("too few platforms");
        }
        this.platformsNumber = platformsNumber;
    }

    public void increaseTracks(int platformsNumber) {
        if (platformsNumber < 0) {
            throw new RuntimeException("too few platforms");
        }
        this.platformsNumber += platformsNumber;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void launchTrain(String name) {
        if(trains.size() >= platformsNumber)
        {
            throw new RuntimeException("too ma");
        }
        trains.add(new Train(name));
    }

}
