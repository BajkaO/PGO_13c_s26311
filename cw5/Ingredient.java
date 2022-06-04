package cw5;

import java.util.Objects;

public abstract class Ingredient {
    private String name;
    private int baseReagent;

    public Ingredient(String name, int baseReagent) {
        this.name = name;
        this.baseReagent = baseReagent;
    }

    public int getReagent() {
        return baseReagent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return baseReagent == that.baseReagent && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, baseReagent);
    }

    public String getName() {
        return name;
    }
}
