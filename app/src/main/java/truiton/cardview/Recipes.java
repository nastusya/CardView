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
        recipies.add((new Recipes("Salad", "Salad",R.drawable.salat)));
        recipies.add(new Recipes("Chicken","Chicken",R.drawable.chicken ));
        recipies.add((new Recipes("Bonbons", "Bonbons",R.drawable.bonbons)));
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