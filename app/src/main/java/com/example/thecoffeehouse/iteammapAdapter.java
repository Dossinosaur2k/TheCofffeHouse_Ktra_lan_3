package com.example.thecoffeehouse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class iteammapAdapter extends RecyclerView.Adapter<iteammapAdapter.itemViewholder> {
    Context context;
    List<itemmap> itemList;

    public iteammapAdapter(Context context, List<itemmap> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public iteammapAdapter.itemViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.row_mapiteam,parent,false);
        return new iteammapAdapter.itemViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull iteammapAdapter.itemViewholder holder, int position) {
        holder.image.setImageResource(itemList.get(position).getImage());
        holder.title.setText(itemList.get(position).getNamestore());
        holder.text.setText(itemList.get(position).getMota());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,store_screen.class);
                intent.putExtra("x",itemList.get(position).getX());
                intent.putExtra("y",itemList.get(position).getY());
                intent.putExtra("namequan",itemList.get(position).getNamestore());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static final class itemViewholder extends RecyclerView.ViewHolder  {

        ImageView image;
        TextView title,text;

        public itemViewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image1);
            title=itemView.findViewById(R.id.title1);
            text=itemView.findViewById(R.id.text1);
        }
    }
}

