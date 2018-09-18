package jana.jani.john.myjajpurguide;

import android.content.Context;

import java.util.List;

/**
 * Created by janardan.d on 10-11-2017.
 */

public class Sights {
    public static void initSightsList(List<FestivalName> list, Context context) {

        list.add(new FestivalName(
                context.getString(R.string.sight_Biraja_name),
                context.getString(R.string.sight_Biraja_description),
                context.getString(R.string.sight_Biraja_address),
                context.getString(R.string.sight_Biraja_phone),
                context.getString(R.string.sight_Biraja_schedule),
                null,
                R.mipmap.sights_biraja_temple,
                context.getString(R.string.sight_Biraja_brief),context.getString(R.string.navigationbirja), context.getString(R.string.sight_Biraja_reach)
        ));

        list.add(new FestivalName(
                context.getString(R.string.sight_Chandikhole_name),
                context.getString(R.string.sight_Chandikhole_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
               null,
                R.mipmap.sights_chandikhole_temple,context.getString(R.string.sight_duburi_brief),context.getString(R.string.navigatiochandi),context.getString(R.string.sight_Biraja_reach)
        ));

        list.add(new FestivalName(
                context.getString(R.string.sight_Duburi_name),
                context.getString(R.string.sight_Duburi_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
                null,
                R.mipmap.sights_duburi_temple,context.getString(R.string.sight_duburii_brief),context.getString(R.string.navigationduburi),context.getString(R.string.sight_Biraja_reach)
        ));

        list.add(new FestivalName(
                context.getString(R.string.sight_Ratnagiri_name),
                context.getString(R.string.sight_Ratnagiri_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
                null,
                R.mipmap.sights_ratnagiri_temple,context.getString(R.string.sight_ratna_brief),context.getString(R.string.navigationratna),context.getString(R.string.sight_Biraja_reach)
        ));

        list.add(new FestivalName(
                context.getString(R.string.sight_Chhatia_name),
                context.getString(R.string.sight_Chhatia_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
                null,
                R.mipmap.sights_chhatia_temple,context.getString(R.string.sight_chatia_brief),context.getString(R.string.navigationchatia),context.getString(R.string.sight_Biraja_reach)
        ));

        list.add(new FestivalName(
                context.getString(R.string.sight_Mahabinayak_name),
                context.getString(R.string.sight_Mahabinayak_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
                null,
                R.mipmap.sights_mahabinayak_temple,context.getString(R.string.sight_mahabinayak_brief),context.getString(R.string.navigationmahabinayak),context.getString(R.string.sight_Biraja_reach)
        ));

        list.add(new FestivalName(
                context.getString(R.string.sight_Atharanala_name),
                context.getString(R.string.sight_Atharanala_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
                null,
                R.mipmap.sights_atharanala_temple,context.getString(R.string.sight_atharanala_brief),context.getString(R.string.navigationatharnala),context.getString(R.string.sight_Biraja_reach)
        ));

        list.add(new FestivalName(
                context.getString(R.string.sight_Dasaswamedha_name),
                context.getString(R.string.sight_Dasaswamedha_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
                null,
                R.mipmap.sights_dasaswamedha_temple,context.getString(R.string.sight_ghata_brief),context.getString(R.string.navigationghat),context.getString(R.string.sight_Biraja_reach)
        ));

        list.add(new FestivalName(
                context.getString(R.string.sight_gokarneswar_name),
                context.getString(R.string.sight_gokarneswar_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
                null,
                R.mipmap.sights_gokarneswar_temple,context.getString(R.string.sight_gokarneswara_brief),context.getString(R.string.navigationgokarneswar),context.getString(R.string.sight_Biraja_reach)
        ));


        list.add(new FestivalName(
                context.getString(R.string.sight_langudi_name),
                context.getString(R.string.sight_langudi_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
                null,
                R.mipmap.sights_langudi_temple,context.getString(R.string.sight_langudi_brief),context.getString(R.string.navigationlangudi),context.getString(R.string.sight_Biraja_reach)
        ));
        list.add(new FestivalName(
                context.getString(R.string.sight_jaganatha_name),
                context.getString(R.string.sight_jaganatha_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
                null,
                R.mipmap.sights_jagantha_temple,context.getString(R.string.sight_jagantha_brief),context.getString(R.string.jaganathanavigation),context.getString(R.string.sight_Biraja_reach)
        ));

        list.add(new FestivalName(
                context.getString(R.string.sight_saptamatruka_name),
                context.getString(R.string.sight_saptamatruka_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
                null,
                R.mipmap.sights_saptamatruka_temple,context.getString(R.string.sight_saptamatruka_brief),context.getString(R.string.navigationghat),context.getString(R.string.sight_Biraja_reach)
        ));

        list.add(new FestivalName(
                context.getString(R.string.sight_trilochaneswar_name),
                context.getString(R.string.sight_trilochaneswar_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
                null,
                R.mipmap.sights_trilochaneswar_temple,context.getString(R.string.sight_trilochaneswar_brief),context.getString(R.string.navigationtrilochaneswar),context.getString(R.string.sight_Biraja_reach)
        ));

        list.add(new FestivalName(
                context.getString(R.string.sight_udayagiri_name),
                context.getString(R.string.sight_udayagiri_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
                null,
                R.mipmap.sights_udayagiri_temple,context.getString(R.string.sight_udayagiri_brief),context.getString(R.string.navigationudayagiri),context.getString(R.string.sight_Biraja_reach)
        ));


        list.add(new FestivalName(
                context.getString(R.string.sight_galagali_name),
                context.getString(R.string.sight_galagali_description),
                null,
                context.getString(R.string.sight_Chandikhole_phone),
                null,
                null,
                R.mipmap.sights_galagali_temple,context.getString(R.string.sight_sanka_brief),context.getString(R.string.navigationsanaka),context.getString(R.string.sight_Biraja_reach)
        ));

    }
}
