package jana.jani.john.myjajpurguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by janardan.d on 10-11-2017.
 */

public class ShopsFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Location> list = new ArrayList<>();
        GovermentOfc.initShopsList(list, getContext());

        LocationAdapter adapter = new LocationAdapter(getActivity(), -1, list);
        View view = inflater.inflate(R.layout.locations_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return view;
    }
}

