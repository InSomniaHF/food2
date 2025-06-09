package com.example.food.activites;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.R;
import com.example.food.adapters.DetailedDailyAdapter;
import com.example.food.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if (type != null && type.equalsIgnoreCase("breakfast")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1, "Завтрак", "Описание", "4.4", "40", "10:00-21:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2, "Завтрак", "Описание", "4.4", "40", "10:00-21:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3, "Завтрак", "Описание", "4.4", "40", "10:00-21:00"));
            dailyAdapter.notifyDataSetChanged();

        }
        if (type != null && type.equalsIgnoreCase("sweets")){
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1, "Завтрак", "Описание", "4.4", "40", "10:00-21:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2, "Завтрак", "Описание", "4.4", "40", "10:00-21:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3, "Завтрак", "Описание", "4.4", "40", "10:00-21:00"));
            dailyAdapter.notifyDataSetChanged();

        }
    }
}