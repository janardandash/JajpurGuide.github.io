package jana.jani.john.myjajpurguide;

import android.content.Context;

import java.util.List;

/**
 * Created by janardan.d on 10-11-2017.
 */

public class Festival {
    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.food_zillamahotsv_name),
                context.getString(R.string.food_zillamahotsv_description),
                null,
                null,
                context.getString(R.string.food_zillamahotsv_schedule),
                null,
                R.mipmap.zillamahotsv
        ));
        list.add(new Location(
                context.getString(R.string.food_festival_name),
                context.getString(R.string.food_festival_description),
                null,
                null,
                context.getString(R.string.food_festival_schedule),
                null,
                R.mipmap.pana_sakarnti
        ));


        list.add(new Location(
                context.getString(R.string.food_chandan_name),
                context.getString(R.string.food_chandan_description),
                null,
                null,
                context.getString(R.string.food_chandan_schedule),
                null,
                R.mipmap.chandan
        ));

        list.add(new Location(
                context.getString(R.string.food_makarmela_name),
                context.getString(R.string.food_makarmela_description),
                null,
                null,
                context.getString(R.string.food_makarmela_schedule),
                null,
                R.mipmap.baruneswarmela
        ));

        list.add(new Location(
                context.getString(R.string.food_akshaya_name),
                context.getString(R.string.food_akshaya_description),
                null,
                null,
                context.getString(R.string.food_akshaya_schedule),
                null,
                R.mipmap.akshaya
        ));

        list.add(new Location(
                context.getString(R.string.food_baitarani_name),
                context.getString(R.string.food_baitarani_description),
                null,
                null,
                context.getString(R.string.food_baitarani_schedule),
                null,
                R.mipmap.baitarani
        ));

        list.add(new Location(
                context.getString(R.string.food_biraja_name),
                context.getString(R.string.food_biraja_description),
                null,
                null,
                context.getString(R.string.food_biraja_schedule),
                null,
                R.mipmap.ratha_yatra
        ));

        list.add(new Location(
                context.getString(R.string.food_kumarapurnima_name),
                context.getString(R.string.food_kumarapurnima_description),
                null,
                null,
                context.getString(R.string.food_kumarapurnima_schedule),
                null,
                R.mipmap.kumarpurnima
        ));

        list.add(new Location(
                context.getString(R.string.food_vakul_name),
                context.getString(R.string.food_vakul_description),
                null,
                null,
                context.getString(R.string.food_vakul_schedule),
                null,
                R.mipmap.vakul
        ));

        list.add(new Location(
                context.getString(R.string.food_dahnu_name),
                context.getString(R.string.food_dahnu_description),
                null,
                null,
                context.getString(R.string.food_dahnu_schedule),
                null,
                R.mipmap.dhanu
        ));

        list.add(new Location(
                context.getString(R.string.food_prathamaṣṭami_name),
                context.getString(R.string.food_prathamaṣṭami_description),
                null,
                null,
                context.getString(R.string.food_prathamaṣṭami_schedule),
                null,
                R.mipmap.enduri
        ));

        list.add(new Location(
                context.getString(R.string.food_dipavali_name),
                context.getString(R.string.food_dipavali_description),
                null,
                null,
                context.getString(R.string.food_dipavali_schedule),
                null,
                R.mipmap.diwali
        ));
        list.add(new Location(
                context.getString(R.string.food_raja_name),
                context.getString(R.string.food_raja_description),
                null,
                null,
                context.getString(R.string.food_raja_schedule),
                null,
                R.mipmap.raja
        ));

        list.add(new Location(
                context.getString(R.string.food_baraha_dola_yatra_name),
                context.getString(R.string.food_baraha_dola_yatra_description),
                null,
                null,
                context.getString(R.string.food_baraha_dola_yatra_schedule),
                null,
                R.mipmap.baraha_dola_yatra
        ));

        list.add(new Location(
                context.getString(R.string.food_kuansa_name),
                context.getString(R.string.food_kuansa_description),
                null,
                null,
                context.getString(R.string.food_kuansa_schedule),
                null,
                R.mipmap.kuansa
        ));

    }
}


