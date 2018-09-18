package jana.jani.john.myjajpurguide;

import android.content.Context;

import java.util.List;

/**
 * Created by janardan.d on 10-11-2017.
 */

public class Info  {

    public static void initInfoList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.info_konbini_name),
                context.getString(R.string.info_internet_description),
                null,
                null,
                null,
                null,
                R.mipmap.jajpur
        ));

        list.add(new Location(
                context.getString(R.string.info_transport_name),
                context.getString(R.string.info_transport_description),
                null,
                null,
                null,
                null,
                -1
        ));
    }
}

