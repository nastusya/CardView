package truiton.cardview;

import java.util.ArrayList;

/**
 * Created by MSI on 24.02.2017.
 */
public class Recipes {
    private String ingredients;
    private String name;
    private int idPhoto;
    private ArrayList<Recipes> recipies = new ArrayList<>();

    public Recipes(){
        recipies.add((new Recipes("mango, salad, tomato", "Salad",R.drawable.salad)));
        recipies.add(new Recipes("tomato, mocarella, basilik","Pizza",R.drawable.pizza ));
        recipies.add((new Recipes("egg, blueberry, cinamon", "Blueberry Cake",R.drawable.blueberrycake)));
        recipies.add((new Recipes("cupcake", "Cupcake",R.drawable.capcake)));
        recipies.add((new Recipes("cheese, cinamon", "Cheesecake",R.drawable.cheescake)));
        recipies.add((new Recipes("egg, butter , salt, paper ", "Toast with egg",R.drawable.egg)));
        recipies.add((new Recipes("pasta , chili, tomato , beef", "Pasta",R.drawable.pasta)));
        recipies.add((new Recipes("Musli", "Musli",R.drawable.musli)));

    }


    public Recipes(String ingredients, String name, int idPhoto) {
        this.ingredients = ingredients;
        this.name = name;
        this.idPhoto = idPhoto;
    }

    public ArrayList<Recipes> getRecipies(){
        return this.recipies;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }

    public int getIdPhoto() {
        return idPhoto;
    }


}