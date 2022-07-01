package cw7;



abstract class Child {
    private final String name;
    private Location location;

    Child(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    void moveTo(Orphanage orphanage) {
        orphanage.addChild(this);
        location = orphanage.getLocation();
    }

    void moveTo(Location location) {
        if (location == null) {
            throw new StoryViolationException("Location can not be null!");
        }
        this.location = location;
    }

    void introduce() {
        System.out.println("Hello, I am " + name);
    }

    void say(String message, Child to) {
        System.out.println(this.name + " to " + to.getName());
        System.out.println("\t" + message);
    }

    void doSth(String sth) {
        System.out.println("I am " + name + ", I am " + sth);
    }

    String getName() {
        return name;
    }

    Location getLocation() {
        return location;
    }

    void setLocation(Location location) {
        this.location = location;
    }
}
