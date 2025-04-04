package com.android.nammabangalore;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ExploringAdapter extends FragmentPagerAdapter {

    private Context mContext;

    // Constructor
    public ExploringAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        // method to get page title of a specific page
        if (position == 0){
            return  mContext.getString(R.string.places);
        } else if (position == 1) {
            return  mContext.getString(R.string.parks);
        } else if (position == 2) {
            return  mContext.getString(R.string.temples);
        }else {
            return  mContext.getString(R.string.restaurants);
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        // method to get position, according to the position fragment will be displayed
        if (position == 0){
            return  new PlacesFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2) {
            return new TemplesFragment();
        }else {
            return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        // method to get total count of tabs
        return 4;
    }
}
