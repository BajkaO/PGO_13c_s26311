package cw7;

import java.util.ArrayList;
import java.util.List;

class Orphanage {
    private final String name;
    private final Location location;
    private final List<Child> children;

    Orphanage(String name, Location location) {
        this.name = name;
        this.location = location;
        this.children = new ArrayList<>();
    }

    void addChild(Child child) {
        child.setLocation(location);
        children.add(child);
    }

    Location getLocation() {
        return location;
    }
}
