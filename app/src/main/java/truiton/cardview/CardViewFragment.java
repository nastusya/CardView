package truiton.cardview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class CardViewFragment extends android.support.v4.app.Fragment {
    private ArrayList<Recipes> recipes;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private FloatingActionButton changeToGrid;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.card_view, container, false);
        getActivity().setTitle("Menu");
        recipes = ((MainActivity) getActivity()).getRecipesList();
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        final RecipesAdapter adapter = new RecipesAdapter(recipes);
        recyclerView.setAdapter(adapter);

        changeToGrid = (FloatingActionButton) view.findViewById(R.id.changeToGrid);
        changeToGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentActivity activity = getActivity();
                MainActivity mainActivity = (MainActivity) activity;
                mainActivity.showDetails(new GridViewFragment());
            }
        });
        return view;

    }

}