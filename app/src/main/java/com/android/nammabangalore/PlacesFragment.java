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
 * create an instance of this fragment.
 */
public class PlacesFragment extends Fragment {

    public PlacesFragment() {
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
        info.add(new Information(getString(R.string.vidhana_soudha_title), getString(R.string.vidhana_soudha_address), getString(R.string.vidhana_soudha_opening_hours), R.drawable.vidhana_soudha, getString(R.string.vidhana_soudha_more_details)));
        info.add(new Information(getString(R.string.lalbagh_botanical_garden_title), getString(R.string.lalbagh_botanical_garden_address), getString(R.string.lalbagh_botanical_garden_opening_hours), R.drawable.lalbagh, getString(R.string.lalbagh_botanical_garden_more_details)));
        info.add(new Information(getString(R.string.bengaluru_palace_title), getString(R.string.bengaluru_palace_address), getString(R.string.bengaluru_palace_opening_hours), R.drawable.bangalore_palace, getString(R.string.bengaluru_palace_more_details)));

        // create object for information adapter
        InformationAdapter adapter = new InformationAdapter(requireActivity(), info, R.color.white);
        // initialize listview
        ListView view = rootview.findViewById(R.id.list);
        // set the adapter to the view
        view.setAdapter(adapter);

        return rootview;
    }
}