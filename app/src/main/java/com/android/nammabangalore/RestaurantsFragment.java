package com.android.nammabangalore;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.places_list, container, false);

        // create an arrayList for information object
        final ArrayList<Information> info = new ArrayList<>();

        // add information
        info.add(new Information(getString(R.string.black_pearl_title),getString(R.string.black_pearl_address),getString(R.string.black_pearl_opening_hours),R.drawable.black_pearl_2,getString(R.string.black_pearl_more_details)));
        info.add(new Information(getString(R.string.high_ultra_lounge_title),getString(R.string.high_ultra_lounge_address),getString(R.string.high_ultra_lounge_opening_hours),R.drawable.ultra_3,getString(R.string.high_ultra_lounge_more_details)));
        info.add(new Information(getString(R.string.byg_brewski_brewing_title),getString(R.string.byg_brewski_brewing_address),getString(R.string.byg_brewski_brewing_opening_hours),R.drawable.rest_4,getString(R.string.byg_brewski_brewing_more_details)));
        info.add(new Information(getString(R.string.gufha_restaurant_title),getString(R.string.gufha_restaurant_address),getString(R.string.gufha_restaurant_opening_hours),R.drawable.gufha_restaurant,getString(R.string.gufha_restaurant_more_details)));

        // create object for information adapter
        InformationAdapter adapter = new InformationAdapter(requireActivity(), info, R.color.white);
        // initialize listview
        ListView view = rootview.findViewById(R.id.list);
        // set the adapter to the view
        view.setAdapter(adapter);

        return rootview;
    }
}