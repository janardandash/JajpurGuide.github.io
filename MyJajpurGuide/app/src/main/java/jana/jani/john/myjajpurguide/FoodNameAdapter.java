package jana.jani.john.myjajpurguide;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by janardan.d on 10-11-2017.
 */

public class FoodNameAdapter extends ArrayAdapter<FestivalName> {
    Context mContext;

    public FoodNameAdapter(Context context, int resources, List<FestivalName> locationsList) {
        super(context, 0, locationsList);
        mContext=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final FestivalName currentLocation = getItem(position);
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.sights_layout, parent, false);
        }

        TextView nameLocationTextView = (TextView) listItemView.findViewById(R.id.nameTextView);
        nameLocationTextView.setText(currentLocation.getName());

        TextView descriptionLocationTextView = (TextView)
                listItemView.findViewById(R.id.descriptionTextView);
        descriptionLocationTextView.setText(currentLocation.getDescription());

        TextView brieflydescriptionLocationTextView = (TextView)
                listItemView.findViewById(R.id.brieflydescriptionTextView);
        brieflydescriptionLocationTextView.setText(currentLocation.getbreiflyDescription());

        TextView googleNavigationTextView = (TextView)
                listItemView.findViewById(R.id.googleNavigationTextView);
        googleNavigationTextView.setText(currentLocation.getgoogleNavigation());

        TextView hoeReachTextView = (TextView)
                listItemView.findViewById(R.id.hoeReachTextView);
        hoeReachTextView.setText(currentLocation.gethowReach());

        TextView addressLocationTextView = (TextView) listItemView.findViewById(R.id.addressTextView);
        addressLocationTextView.setText(currentLocation.getAddress());

        TextView scheduleLocationTextView = (TextView) listItemView.findViewById(R.id.scheduleTextView);
        scheduleLocationTextView.setText(currentLocation.getSchedule());

        TextView priceLocationTextView = (TextView) listItemView.findViewById(R.id.priceTextView);
        priceLocationTextView.setText(currentLocation.getPrice());

        TextView phoneLocationTextView = (TextView) listItemView.findViewById(R.id.phoneTextView);
        phoneLocationTextView.setText(currentLocation.getPhone());

        ImageView photoLocationImageView = (ImageView) listItemView.findViewById(R.id.photoImageView);

        if (currentLocation.hasImage()){
            photoLocationImageView.setImageResource(currentLocation.getImageResourceId());
            photoLocationImageView.setVisibility(View.VISIBLE);
        } else {
            photoLocationImageView.setVisibility(View.GONE);
        }

        if (currentLocation.hasPrice()){
            priceLocationTextView.setVisibility(View.VISIBLE);
        } else {
            priceLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasSchedule()){
            scheduleLocationTextView.setVisibility(View.VISIBLE);
        } else {
            scheduleLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasAddress()){
            addressLocationTextView.setVisibility(View.VISIBLE);
        } else {
            addressLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasPhone()){
            phoneLocationTextView.setVisibility(View.VISIBLE);
        } else {
            phoneLocationTextView.setVisibility(View.GONE);
        }

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentServiceProfile = new Intent(getContext(),SigtsDetails.class);
                intentServiceProfile.putExtra("Name", currentLocation.getName());
                intentServiceProfile.putExtra("Description",currentLocation.getbreiflyDescription());
                intentServiceProfile.putExtra("GoogleNavigation",currentLocation.getgoogleNavigation());
                intentServiceProfile.putExtra("Howtoreach",currentLocation.gethowReach());
                mContext.startActivity(intentServiceProfile);
            }
        });

        return listItemView;
    }


}



