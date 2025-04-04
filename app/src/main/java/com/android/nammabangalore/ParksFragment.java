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
public class ParksFragment extends Fragment {

    public ParksFragment() {
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
        info.add(new Information(getString(R.string.cubbon_park_title),  getString(R.string.cubbon_park_address),  getString(R.string.cubbon_park_opening_hours), R.drawable.cubbon_park,  getString(R.string.cubbon_park_more_details)));
        info.add(new Information(getString(R.string.wonderla_title), getString(R.string.wonderla_address), getString(R.string.wonderla_opening_hours), R.drawable.wonder_la, getString(R.string.wonderla_more_details)));
        info.add(new Information(getString(R.string.bannerghatta_title), getString(R.string.bannerghatta_address), getString(R.string.bannerghatta_opening_hours), R.drawable.bannerghatta_national_park, getString(R.string.bannerghatta_more_details)));
        info.add(new Information(getString(R.string.bugle_rock_title),getString(R.string.bugle_rock_address) , getString(R.string.bugle_rock_opening_hours), R.drawable.bugle_rock_park, getString(R.string.bugle_rock_more_details)));

        // create object for information adapter
        InformationAdapter adapter = new InformationAdapter(requireActivity(), info, R.color.white);
        // initialize listview
        ListView view = rootview.findViewById(R.id.list);
        // set the adapter to the view
        view.setAdapter(adapter);

        return rootview;
    }
}