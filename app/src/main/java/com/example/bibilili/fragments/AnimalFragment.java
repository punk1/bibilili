package com.example.bibilili.fragments;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bibilili.R;
import com.example.bibilili.adapter.AnimalAdpater;
import com.example.bibilili.base.BaseFragment;
import com.example.bibilili.bean.Animal;

public class AnimalFragment extends BaseFragment {

    private RecyclerView recyclerViewl;
    private AnimalAdpater adpater;
    @Override
    public int setIdResource() {
        return R.layout.animal_fragment;
    }

    @Override
    public void loadData() {
        for (int i = 0; i <10  ; i++) {
            Animal animal = new Animal(R.drawable.ic_rabbit,"yizhoniao");
            animals.add(animal);
        }
    }

    @Override
    public void initView() {
        recyclerViewl = getview().findViewById(R.id.animal_recycler_view);
        adpater = new AnimalAdpater(animals,getContext());
        recyclerViewl.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewl.setAdapter(adpater);
    }


}
