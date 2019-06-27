package com.example.northcyprusguide;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GirneAdapter extends RecyclerView.Adapter<GirneAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<GirneModel> imageModelArrayList;
    Context mContext;
    Dialog myDialog;



    public GirneAdapter(ArrayList<GirneModel> imageModelArrayList, Context mContext) {
        inflater = LayoutInflater.from(mContext);
        this.imageModelArrayList = imageModelArrayList;
        this.mContext = mContext;

    }

    @NonNull
    @Override
    public GirneAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.girne_hotels, parent, false);
        final ViewHolder holder = new ViewHolder(view);

        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.aaresidence);

        holder.item_girne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name_tv = (TextView) myDialog.findViewById(R.id.aatitle);
                ImageView dialog_image_iv = (ImageView) myDialog.findViewById(R.id.pop_up_image);
                dialog_name_tv.setText(imageModelArrayList.get(holder.getAdapterPosition()).getName());
                dialog_image_iv.setImageResource(imageModelArrayList.get(holder.getAdapterPosition()).getImage());

                Toast.makeText(mContext, "Text CLick"+String.valueOf(holder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
                myDialog.show();
            }
        });

        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull GirneAdapter.ViewHolder holder, int position) {
        holder.girneImage.setImageResource(imageModelArrayList.get(position).getImage());
        holder.girneName.setText(imageModelArrayList.get(position).getName());





            }



    @Override
    public int getItemCount() {

        return imageModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView girneImage;
        TextView girneName;
        private LinearLayout item_girne;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_girne = (LinearLayout) itemView.findViewById(R.id.item_girne);
            girneImage = (ImageView) itemView.findViewById(R.id.girne_hotel);
            girneName = (TextView) itemView.findViewById(R.id.girne_name);

        }



    }
}
