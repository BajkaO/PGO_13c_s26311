package cw5;

import java.util.ArrayList;
import java.util.List;

public class Elixir {
    private String name;
    private boolean isCreated;
    private int power;
    private List<Ingredient> ingredients = new ArrayList<>();
    private Liquid catalyst;

    public Elixir(String name) {
        this.name = name;
    }

    public void addIngredient(Ingredient ingredient) {
        if (!isCreated) {
            ingredients.add(ingredient);
        }
    }

    public void removeIngredient(Ingredient ingredient) {
        if (!isCreated) {
            ingredients.remove(ingredient);
        }
    }

    public void setCatalyst(Liquid catalyst) {
        if (!isCreated) {
            this.catalyst = catalyst;
        }
    }

    public void create() {
        if (!isCreated) {
            for (Ingredient ingredient : ingredients) {
                if (ingredient instanceof Mineral) {
                    Mineral mineral = (Mineral) ingredient;
                    power += mineral.getPower();
                }
            }
            power = power / catalyst.getReagent();
            isCreated = true;
        }
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public Liquid getCatalyst() {
        return catalyst;
    }

    public int getPower() {
        return power;
    }
}
