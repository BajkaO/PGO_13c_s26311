package cw7;

import java.util.ArrayList;
import java.util.List;

class Voldemort extends Character {
    private final List<String> horcruxes;
    private final List<Child> targets;

    Voldemort(Riddle riddle) {
        super("Lord Voldemort", riddle.getLocation());
        Character.removeStatus(riddle);
        this.targets = new ArrayList<>();
        this.horcruxes = new ArrayList<>();
    }

    void createHorcruxes(int n) {
        int startIndex = horcruxes.size();
        int endIndex = horcruxes.size() + n;
        while (startIndex < endIndex) {
            horcruxes.add("horcrux " + ++startIndex);
        }
    }

    void printHorcruxes() {
        System.out.println("Created horcruxes:");
        horcruxes.forEach(horcrux -> System.out.println("\t" + horcrux));
    }

    void target(Child target) {
        targets.add(target);
    }

    void castSpell(Spell spell) {
        if (spell == Spell.AvadaKedavra) {
            targets.forEach(Character::die);
            Character.die(this);
        }
    }
}
