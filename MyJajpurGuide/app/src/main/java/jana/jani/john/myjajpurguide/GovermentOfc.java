package jana.jani.john.myjajpurguide;

import android.content.Context;

import java.util.List;

/**
 * Created by janardan.d on 10-11-2017.
 */

public class GovermentOfc {

    public static void initShopsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.shop_potato_name),
                context.getString(R.string.shop_potato_description),
                context.getString(R.string.shop_potato_address),
                context.getString(R.string.shop_potato_phone),
                context.getString(R.string.shop_potato_schedule),
                null,
                R.mipmap.odisha_logo
        ));


        list.add(new Location(
                context.getString(R.string.shop_hospital_name),
                context.getString(R.string.shop_hospital_description),
               null,
                null,
                context.getString(R.string.shop_hospital_schedule),
                null,
                R.mipmap.hospital
        ));


        list.add(new Location(
                context.getString(R.string.shop_postoffice_name),
                context.getString(R.string.shop_postoffice_description),
                context.getString(R.string.shop_postoffice_address),
                context.getString(R.string.sight_post_phone),
                context.getString(R.string.shop_postoffice_schedule),
                null,
                R.mipmap.post
        ));

        list.add(new Location(
                context.getString(R.string.shop_police_name),
                null,
                context.getString(R.string.shop_police_address),
                context.getString(R.string.sight_police_phone),
                null,
                null,
                R.mipmap.police
        ));

        list.add(new Location(
                context.getString(R.string.shop_railwaystation_name),
                context.getString(R.string.shop_railwaystation_address),
                context.getString(R.string.address),
                context.getString(R.string.sight_railwaystation_phone),
                null,
                null,
                R.mipmap.j
        ));

        list.add(new Location(
                context.getString(R.string.shop_court_name),
                context.getString(R.string.des),
                context.getString(R.string.shop_court_address),
                context.getString(R.string.sight_court_phone),
                null,
                null,
                R.mipmap.court
        ));
    }

}
