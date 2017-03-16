package truiton.cardview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by MSI on 24.02.2017.
 */

public class RecipesAdapter extends RecyclerView.Adapter<RecipesAdapter.RecipesViewHolder> {

    Recipes ITEM = new Recipes();


    class RecipesViewHolder extends RecyclerView.ViewHolder {
        public CardView cardView;
        public TextView ingredients;
        public TextView name;
        public ImageView recipesPhoto;
        public View itemView;


        public RecipesViewHolder(View view) {
            super(view);
            itemView = view;
            name = (TextView) itemView.findViewById(R.id.recipes_name);
            ingredients = (TextView) itemView.findViewById(R.id.recipes_ingredients);
            recipesPhoto = (ImageView) itemView.findViewById(R.id.recipes_photo);
            cardView = (CardView) itemView.findViewById(R.id.card_view);


        }

    }


    @Override
    public RecipesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipes_list, parent, false);
        RecipesViewHolder viewHolder = new RecipesViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final RecipesViewHolder holder, int position) {


        holder.name.setText(ITEM.getRecipies().get(position).getName());
        holder.ingredients.setText(ITEM.getRecipies().get(position).getIngredients());
        holder.recipesPhoto.setImageResource(ITEM.getRecipies().get(position).getIdPhoto());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), ITEM.getRecipies().get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {return ITEM.getRecipies().size();
    }

}