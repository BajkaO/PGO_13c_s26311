package cw7;

import java.util.ArrayList;
import java.util.List;

abstract class Character extends Child{
    static List<Status> statuses = new ArrayList<>();

    Character(String name, Location location) {
        super(name, location);
        statuses.add(new Status(name, 100));
    }

    static void moveAllTo(Location location, Child... children) {
        for (Child child : children) {
            child.moveTo(location);
        }
    }

    static void doSth(String sth, Child... children) {
        for (Child child : children) {
            child.doSth(sth);
        }
    }

    static void status() {
        System.out.println("====Status====");
        for (Status status : statuses) {
            System.out.println(status.getName() + " : " + status.getStatus());
        }
        System.out.println("========");
    }

    static void removeStatus(Child child) {
        statuses.removeIf(status -> status.getName().equals(child.getName()));
    }

    static void die(Child child) {
        statuses.stream()
                .filter(status -> status.getName().equals(child.getName()))
                .findFirst()
                .ifPresent(status -> {
                    if ("Harry".equals(child.getName())) {
                        System.out.println(child.getName() + " goes LOL...");
                    }else{
                        status.setStatus(0);
                        System.out.println(child.getName() + " died.");
                    }
                });
    }
}
