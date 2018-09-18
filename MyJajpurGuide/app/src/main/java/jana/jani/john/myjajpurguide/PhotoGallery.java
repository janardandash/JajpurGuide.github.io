package jana.jani.john.myjajpurguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bumptech.glide.Glide;
import jana.jani.john.myjajpurguide.Interface.ItemClickListner;
import jana.jani.john.myjajpurguide.Model.Biraja;
import jana.jani.john.myjajpurguide.ViewHolder.MenuViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class PhotoGallery extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference biraja;
    StorageReference storageRef;
    FirebaseStorage storage;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    FirebaseRecyclerAdapter<Biraja,MenuViewHolder> adapter;
    FirebaseRecyclerAdapter<Biraja,MenuViewHolder> serchadapter;
    String[] searchlList={"Biraja","Chandikhole","Duburi","Ratnagiri","Chhatia","Mahavinayak Temple","Atharanala"};
    String referenceVariable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_gallery);
        database=FirebaseDatabase.getInstance();
        storage = FirebaseStorage.getInstance();
        Bundle b = getIntent().getExtras();
        referenceVariable= b.getString("Name").trim();
        biraja=database.getReference(referenceVariable);
       // birajaimage=
        recyclerView=(RecyclerView)findViewById(R.id.recyler_menu);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        loadmenu();
    }

    private void loadmenu() {
        adapter=new FirebaseRecyclerAdapter<Biraja, MenuViewHolder>(Biraja.class,R.layout.photo_item,MenuViewHolder.class,biraja) {
            @Override
            protected void populateViewHolder(MenuViewHolder viewHolder, Biraja model, int position) {
                viewHolder.txtMenuName.setText(model.getName());
               // Picasso.with(getBaseContext()).load(model.getImage()).into(viewHolder.imgMenu);
                Glide.with(getApplicationContext())
                        .using(new FirebaseImageLoader())
                        .load(storage.getReferenceFromUrl(model.getImage()))
                        .into(viewHolder.imgMenu);
                final Biraja clickitem=model;
                viewHolder.setItemClickListner(new ItemClickListner() {
                    @Override
                    public void onClick(View view, int position, boolean isLongClick) {


                    }
                });
            }
        };
        recyclerView.setAdapter(adapter);
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
