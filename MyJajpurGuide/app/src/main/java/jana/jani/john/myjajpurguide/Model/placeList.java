package jana.jani.john.myjajpurguide.Model;

/**
 * Created by janardan.d on 30-11-2017.
 */

public class placeList {
    private String name;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public placeList(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    @Override
    public String toString() {
        String output = getName() + "\n" +
                getImageResourceId()
                ;

        return output;
    }
}
