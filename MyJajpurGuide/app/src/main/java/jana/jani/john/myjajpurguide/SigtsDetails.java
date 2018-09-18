package jana.jani.john.myjajpurguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SigtsDetails extends AppCompatActivity {
String placename="",description="",navigation="",howreach="";
TextView placeName,breieflyDes,howReach;
Button directionsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigts_details);
        Bundle b = getIntent().getExtras();
        breieflyDes=(TextView)findViewById(R.id.breieflyDes);
        placeName=(TextView)findViewById(R.id.placeName);
        howReach=(TextView)findViewById(R.id.howReach);
        directionsButton=(Button)findViewById(R.id.directionsButton);
        placename = b.getString("Name").trim();
        description=b.getString("Description").trim();
        navigation=b.getString("GoogleNavigation");
        howreach=b.getString("Howtoreach");
        placeName.setText(placename);
        breieflyDes.setText(description);
        howReach.setText(howreach);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        directionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(navigation));
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
