package com.android.nammabangalore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class InformationAdapter extends ArrayAdapter<Information> {

    // color for text of information_list.xml
    private int textInfoColor;

    // constructor
    public InformationAdapter(@NonNull Context context, ArrayList<Information> information, int colorResourceId) {
        super(context,0,  information);
        textInfoColor = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.information_list, parent, false);
        }

        // Get the Information object located at this position in the list
        final Information currentInfo = getItem(position);

        // Find the TextView in information_list.xml layout with the ID title
        TextView titleView = listItemView.findViewById(R.id.title);
        // Get the title from the current Word object and set this text on the TextView
        titleView.setText(currentInfo.getTitle());

        // Find the TextView in the information_list.xml layout with the ID address
        TextView addressView = listItemView.findViewById(R.id.address);
        // Get the address from the current Word object and set this text on the TextView
        addressView.setText(currentInfo.getAddress());

        // Find the TextView in the information_list.xml layout with the ID opening_hours
        TextView openingHoursView = listItemView.findViewById(R.id.opening_hours);
        // Get the opening hours from the current Word object and set this text on the TextView
        openingHoursView.setText(currentInfo.getOpeningHours());

        // Find the "More" textview
        final TextView moreButton = listItemView.findViewById(R.id.next_button);

        // Find the TextView for more details
        final TextView moreDetailsTextView = listItemView.findViewById(R.id.more_details);

        // check if more details textview is already visible
        if (currentInfo.isMoreDetailsVisible()) {
            moreDetailsTextView.setVisibility(View.VISIBLE);
            moreDetailsTextView.setText(currentInfo.getMore());
        } else {
            moreDetailsTextView.setVisibility(View.GONE);
        }

        moreButton.setOnClickListener(v -> {
            boolean isVisible = !currentInfo.isMoreDetailsVisible();
            currentInfo.setMoreDetailsVisible(isVisible);
            moreDetailsTextView.setVisibility(isVisible ? View.VISIBLE : View.GONE);
            if (isVisible) {
                // set the more details information for the current view
                moreDetailsTextView.setText(currentInfo.getMore());
            }
        });

        // Set the image for imageview
        ImageView image = listItemView.findViewById(R.id.places);
        if (currentInfo.hasImage()){
            image.setImageResource(currentInfo.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.info_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), textInfoColor);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Adjust layout parameters dynamically so that it will have same height
        ViewGroup.LayoutParams layoutParams = listItemView.getLayoutParams();
        layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
        listItemView.setLayoutParams(layoutParams);

        // Return the whole list item layout
        return listItemView;
    }
}
