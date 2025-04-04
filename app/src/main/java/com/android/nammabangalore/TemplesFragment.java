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
public class TemplesFragment extends Fragment {

    public TemplesFragment() {
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
        info.add(new Information(getString(R.string.iskcon_temple_title),getString(R.string.iskcon_temple_address),getString(R.string.iskcon_temple_opening_hours),R.drawable.iskcon,getString(R.string.iskcon_temple_more_details)));
        info.add(new Information(getString(R.string.venkataramana_temple_title),getString(R.string.venkataramana_temple_address),getString(R.string.venkataramana_temple_opening_hours),R.drawable.venkataramana_swamy,getString(R.string.venkataramana_temple_more_details)));
        info.add(new Information(getString(R.string.marks_cathedral_title),getString(R.string.marks_cathedral_address),getString(R.string.marks_cathedral_opening_hours),R.drawable.stmarkscathedral,getString(R.string.marks_cathedral_more_Details)));
        info.add(new Information(getString(R.string.shanmukha_temple_title),getString(R.string.shanmukha_temple_address),getString(R.string.shanmukha_temple_opening_hours),R.drawable.shanmukha_temple,getString(R.string.shanmukha_temple_more_details)));
        info.add(new Information(getString(R.string.omkar_hills_title),getString(R.string.omkar_hills_address),getString(R.string.omkar_hills_opening_hours),R.drawable.omkara_hills,getString(R.string.omkar_hills_more_details)));
        info.add(new Information(getString(R.string.nageshwara_temple_title),getString(R.string.nageshwara_temple_address),getString(R.string.nageshwara_temple_opening_hours),R.drawable.nageshwar_temple,getString(R.string.nageshwara_temple_more_details)));

        // create object for information adapter
        InformationAdapter adapter = new InformationAdapter(requireActivity(), info, R.color.white);
        // initialize listview
        ListView view = rootview.findViewById(R.id.list);
        // set the adapter to the view
        view.setAdapter(adapter);

        return rootview;
    }
}