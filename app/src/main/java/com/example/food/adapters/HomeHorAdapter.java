package com.example.food.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.R;
import com.example.food.models.HomeHorModel;
import com.example.food.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {
    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(ArrayList<HomeHorModel> list, Activity activity, UpdateVerticalRec updateVerticalRec) {
        this.list = list;
        this.activity = activity;
        this.updateVerticalRec = updateVerticalRec;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check){
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Пицца", "10:00 - 23:00", "4.9", "$35"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Пицца", "10:00 - 23:00", "4.9", "$35"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Пицца", "10:00 - 23:00", "4.9", "$35"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Пицца", "10:00 - 23:00", "4.9", "$35"));

            updateVerticalRec.callback(position, homeVerModels);
            check = false;}
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Пицца", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Пицца", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Пицца", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Пицца", "10:00 - 23:00", "4.9", "$35"));
                        updateVerticalRec.callback(position, homeVerModels);
                    }else if (position == 1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.burger1, "Бургер", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4, "Бургер", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2, "Бургер", "10:00 - 23:00", "4.9", "$35"));
                        updateVerticalRec.callback(position, homeVerModels);
                    }else if (position == 3){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.icecream1, "Мороженое", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2, "Мороженое", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3, "Мороженое", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream4, "Мороженое", "10:00 - 23:00", "4.9", "$35"));
                        updateVerticalRec.callback(position, homeVerModels);

                    }
                    else if (position == 2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.fries1, "Кортошка", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2, "Кортошка", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3, "Кортошка", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4, "Кортошка", "10:00 - 23:00", "4.9", "$35"));
                        updateVerticalRec.callback(position, homeVerModels);

                    }
                    else if (position == 4){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1, "Сандвич", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2, "Сандвич", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3, "Сандвич", "10:00 - 23:00", "4.9", "$35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4, "Сандвич", "10:00 - 23:00", "4.9", "$35"));
                        updateVerticalRec.callback(position, homeVerModels);

                    }
                }
            });

            if (select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);


                }else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }

        }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
