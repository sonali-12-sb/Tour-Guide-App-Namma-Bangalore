package com.android.nammabangalore;

public class Information {

    // string for title
    private String title;

    //string for address
    private String address;

    // string for opening hours
    private String openingHours;

    // for image resource id
    private int imageResourceId = PLACE_IMAGE;
    private static final int PLACE_IMAGE = -1;   //-1 because, out of the range for all the possible valid resource ids, values

    // string for more textview
    private String more;

    // boolean value to check whether the more details textview is visible or not
    private boolean isMoreDetailsVisible;

    // constructor
    public Information(String title, String address, String openingHours, int imageResourceId, String more){
        this.address = address;
        this.title = title;
        this.openingHours = openingHours;
        this.imageResourceId = imageResourceId;
        this.more = more;
    }

    // setters and getters methods to set and get the values
    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getOpeningHours() {
        return openingHours;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getMore() {
        return more;
    }

    public boolean isMoreDetailsVisible() {
        return isMoreDetailsVisible;
    }

    public void setMoreDetailsVisible(boolean moreDetailsVisible) {
        isMoreDetailsVisible = moreDetailsVisible;
    }
    public boolean hasImage(){
        return imageResourceId != PLACE_IMAGE;
    }
}
