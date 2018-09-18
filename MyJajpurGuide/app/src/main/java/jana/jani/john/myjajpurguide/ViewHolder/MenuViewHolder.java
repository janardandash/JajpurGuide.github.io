package jana.jani.john.myjajpurguide.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import jana.jani.john.myjajpurguide.Interface.ItemClickListner;
import jana.jani.john.myjajpurguide.R;

/**
 * Created by janardan.d on 15-11-2017.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView txtMenuName;
        public ImageView imgMenu;
        private ItemClickListner itemClickListner;

        public MenuViewHolder(View itemView) {
            super(itemView);
            txtMenuName=(TextView)itemView.findViewById(R.id.menu_name);
            imgMenu=(ImageView)itemView.findViewById(R.id.menu_image);
            itemView.setOnClickListener(this);

        }

        public void setItemClickListner(ItemClickListner itemClickListner) {
            this.itemClickListner = itemClickListner;
        }

        @Override
        public void onClick(View v) {
            itemClickListner.onClick(v,getAdapterPosition(),false);
        }
    }


