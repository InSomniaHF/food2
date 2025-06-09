package com.example.food.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.R;
import com.example.food.adapters.DailyMealAdapter;
import com.example.food.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast, "Завтраки", "30% Скидка", "Описание", "Breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch, "Перекусы", "20% Скидка", "Описание", "Lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner, "Обеды", "33% Скидка", "Описание", "Dinner"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets, "Дисерты", "12% Скидка", "Описание", "Sweets"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe, "Кофе", "24% Скидка", "Описание", "Coffee"));

        dailyMealAdapter = new DailyMealAdapter(getContext(), dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();
        return root;
    }
}