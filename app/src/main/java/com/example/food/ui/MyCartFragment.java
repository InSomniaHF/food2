package com.example.food.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.food.R;
import com.example.food.adapters.CartAdapter;
import com.example.food.models.CartModel;

import java.util.ArrayList;
import java.util.List;


public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart_blank, container, false);
        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.s1,"Заказ 1", "30", "4.3"));
        list.add(new CartModel(R.drawable.s2,"Заказ 1", "30", "4.3"));
        list.add(new CartModel(R.drawable.fav1,"Заказ 1", "30", "4.3"));
        list.add(new CartModel(R.drawable.s1,"Заказ 1", "30", "4.3"));
        list.add(new CartModel(R.drawable.s2,"Заказ 1", "30", "4.3"));
        list.add(new CartModel(R.drawable.fav1,"Заказ 1", "30", "4.3"));
        cartAdapter.notifyDataSetChanged();
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);

        return view;
    }

    public void mainActivity(View view) {
    }
}