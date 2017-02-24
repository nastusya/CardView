package truiton.cardview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MSI on 24.02.2017.
 */

public class Recipes {
    private String ingredients;
    private String name;
    private int idPhoto;


    public Recipes(String ingredients, String name, int idPhoto) {
        this.ingredients = ingredients;
        this.name = name;
        this.idPhoto = idPhoto;
    }


    public String getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }

}

