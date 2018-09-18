package jana.jani.john.myjajpurguide;

import android.util.Log;

/**
 * Created by janardan.d on 10-11-2017.
 */

public class FestivalName {
    private String name;
    private String description;
    private String address;
    private String phone;
    private String schedule;
    private String price;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String breiflyDescription;
    private String googleNavigation;
    private String howReach;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public FestivalName(String name, String description, String address, String phone, String schedule,
                        String price, int imageResourceId,String breiflyDescription,String googleNavigation,String howReach) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.schedule = schedule;
        this.price = price;
        this.imageResourceId = imageResourceId;
        this.breiflyDescription=breiflyDescription;
        this.googleNavigation=googleNavigation;
        this.howReach=howReach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getbreiflyDescription() {
        return breiflyDescription;
    }

    public void setbreiflyDescription(String breiflyDescription) {
        this.breiflyDescription = breiflyDescription;
    }
    public String getgoogleNavigation() {
        return googleNavigation;
    }

    public void setgoogleNavigation(String googleNavigation) {
        this.googleNavigation = googleNavigation;
    }

    public String gethowReach() {
        return howReach;
    }

    public void sethowReach(String howReach) {
        this.howReach = howReach;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage(){
        Log.v("hasImage", "word has image: "+ (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPrice(){
        return getPrice() != null;
    }

    public boolean hasPhone(){
        return getPhone() != null;
    }

    public boolean hasAddress(){
        return getAddress() != null;
    }

    public boolean hasSchedule(){
        return getSchedule() != null;
    }

    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhone() + "\n" +
                getPrice() + "\n" +
                getSchedule() + "\n" +
                getImageResourceId()
                ;

        return output;
    }
}