package jana.jani.john.myjajpurguide.InputPlacesList;

import android.content.Context;

import jana.jani.john.myjajpurguide.Model.placeList;

import java.util.List;

/**
 * Created by janardan.d on 30-11-2017.
 */

public class PlaceList {
    public static void initSightsList(List<placeList> list, Context context) {

        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_Biraja_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));
        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_Chandikhole_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));
        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_Duburi_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));
        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_Ratnagiri_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));
        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_Chhatia_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));

        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_jaganatha_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));

        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_Mahabinayak_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));
        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_Atharanala_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));
        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_Dasaswamedha_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));
        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_gokarneswar_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));
        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_langudi_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));
        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_saptamatruka_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));
        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_trilochaneswar_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));
        list.add(new placeList(
                context.getString(jana.jani.john.myjajpurguide.R.string.sight_udayagiri_name),
                jana.jani.john.myjajpurguide.R.drawable.circle_24dp
        ));



    }
}
