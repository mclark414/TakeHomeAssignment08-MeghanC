package com.example.android.todolist;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class TaskViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView priority;
    public TextView toDo;
    public ImageView taskImage;
    public ImageView emojiImage;

    public TaskViewHolder(View view, final Context context){
        super(view);
        cardView = (CardView) view.findViewById(R.id.card_view);
        priority = (TextView) view.findViewById(R.id.priority);
        toDo = (TextView) view.findViewById(R.id.item);
        taskImage = (ImageView) view.findViewById(R.id.image);
        emojiImage = (ImageView) view.findViewById(R.id.emoji);

        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                    emojiImage.setImageResource(R.drawable.done_emoji);
                    taskImage.setImageResource(R.drawable.check);
                    priority.setTextColor(Color.GRAY);
                    toDo.setTextColor(Color.GRAY);
                }
        });
    }
}
