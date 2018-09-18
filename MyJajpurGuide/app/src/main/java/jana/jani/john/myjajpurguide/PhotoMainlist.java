package jana.jani.john.myjajpurguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import jana.jani.john.myjajpurguide.Adapter.PlacePhotoAdapter;
import jana.jani.john.myjajpurguide.InputPlacesList.PlaceList;
import jana.jani.john.myjajpurguide.Model.placeList;

import java.util.ArrayList;
import java.util.List;

public class PhotoMainlist extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_mainlist);
        listView = (ListView)findViewById(R.id.listView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        loadmenu();
    }

    private void loadmenu() {
        List<placeList> list = new ArrayList<>();
        PlaceList.initSightsList(list, getApplicationContext());

        PlacePhotoAdapter adapter = new PlacePhotoAdapter(this, R.layout.photlist_layout, list);
      //  View view = inflater.inflate(R.layout.locations_list, container, false);
        listView.setAdapter(adapter);
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        return true;
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }

}
