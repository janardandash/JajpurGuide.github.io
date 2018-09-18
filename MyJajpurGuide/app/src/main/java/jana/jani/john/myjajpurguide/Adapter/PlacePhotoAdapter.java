package jana.jani.john.myjajpurguide.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import jana.jani.john.myjajpurguide.Model.placeList;
import jana.jani.john.myjajpurguide.PhotoGallery;

import java.util.List;


/**
 * Created by janardan.d on 30-11-2017.
 */

public class PlacePhotoAdapter extends ArrayAdapter<placeList> {

    Context mContext;

    public PlacePhotoAdapter(Context context, int resources, List<placeList> locationsList) {
        super(context, 0, locationsList);
        mContext=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final placeList currentLocation = getItem(position);
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    jana.jani.john.myjajpurguide.R.layout.photlist_layout, parent,false);
        }

        TextView nameLocationTextView = (TextView) listItemView.findViewById(jana.jani.john.myjajpurguide.R.id.sample_name);
        nameLocationTextView.setText(currentLocation.getName());
        ImageView photoLocationImageView = (ImageView) listItemView.findViewById(jana.jani.john.myjajpurguide.R.id.sample_icon);
       photoLocationImageView.setImageResource(currentLocation.getImageResourceId());



        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConnectivityManager cm = (ConnectivityManager) getContext()
                        .getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = cm.getActiveNetworkInfo();
                if (networkInfo != null && networkInfo.isConnected()) {
                    Intent intentServiceProfile = new Intent(getContext(), PhotoGallery.class);
                    intentServiceProfile.putExtra("Name", currentLocation.getName());
                    mContext.startActivity(intentServiceProfile);
                }
                else{
                    Snackbar snackbar = Snackbar
                            .make(view, "Please Connect to intenet", Snackbar.LENGTH_LONG);
                    View sbView = snackbar.getView();
                    TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                    textView.setTextColor(Color.RED);

                    snackbar.show();

                }

            }
        });

        return listItemView;
    }


}


