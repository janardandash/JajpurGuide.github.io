package jana.jani.john.myjajpurguide.Model;

/**
 * Created by janardan.d on 15-11-2017.
 */

public class Biraja {
    private String Name;
    private String Image;

    public Biraja(){

    }

    public Biraja(String name, String image) {
        Name = name;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}


