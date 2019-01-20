package com.example.bibilili.adapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bibilili.R;
import com.example.bibilili.bean.Animal;

public class AnimalHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView textView;
    public AnimalHolder( View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image_view);
        textView=itemView.findViewById(R.id.text_view);
    }
    public void bindview(Animal animal){
        imageView.setImageResource(animal.getImage());
        textView.setText(animal.getTitle());

    }
}
