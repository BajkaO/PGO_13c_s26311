package cw5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elixir elixir = new Elixir("Mocny elixir");
        elixir.setCatalyst(new Water("Woda destylowana", 120, 60, true));
        elixir.addIngredient(new Alcohol("Ethanol", 99, 45, 30));
        elixir.addIngredient(new Ore("Żelazo", 35, 199, true));
        elixir.addIngredient(new Crystal("Rubin", 2, 130, 200));
        elixir.addIngredient(new Flower("Liśc laurowy", 30, 40));
        Root imbir = new Root("Imbir", 43, 12);
        elixir.addIngredient(imbir);

        System.out.println("Elixir Jest prawie gotowy! Potrzebne są składniki:");
        List<Ingredient> ingredients = elixir.getIngredients();
        for(Ingredient ingredient : ingredients){
            System.out.print(ingredient.getName() + " ");
        }
        System.out.println();

        System.out.println("Oh chyba nie potrzebny jest imbir, więc go usuniemy z przepisu:");
        //usuwanie z listy skladnika imbir
        elixir.removeIngredient(imbir);
        List<Ingredient> finalIngredients = elixir.getIngredients();
        for(Ingredient ingredient : finalIngredients){
            System.out.print(ingredient.getName() + " ");
        }
        System.out.println();
        elixir.create();

        System.out.println("Utworzony elixir zawiera teraz " + elixir.getCatalyst().getName() +
                " jako katalizator uzywamy " + elixir.getPower() + " chochle!");

        elixir.addIngredient(imbir);

        System.out.println("Jednak chyba boli mnie gardlo i bede chora, to dodam ten imbir moze pomoze. teraz znowu eliksir sklada sie z :");
        List<Ingredient> ingredientOfCreatedElixir = elixir.getIngredients();
        for(Ingredient ingredient : ingredientOfCreatedElixir){
            System.out.print(ingredient.getName() + " ");
        }
    }
}
