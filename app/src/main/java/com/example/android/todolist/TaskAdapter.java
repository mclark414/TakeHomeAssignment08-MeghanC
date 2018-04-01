package com.example.android.todolist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class TaskAdapter extends RecyclerView.Adapter<TaskViewHolder>{
    private List<Task> tasks;
    private Context context;

    public TaskAdapter(List<Task> tasks1, Context context){
        this.tasks = tasks1;
        this.context = context;
    }
    @Override
    public TaskViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_items, parent, false);
        return new TaskViewHolder(view, context);
    }
    @Override
    public void onBindViewHolder(TaskViewHolder holder, int position){
        Task task = tasks.get(position);
        holder.priority.setText(task.priority);
        holder.toDo.setText(task.toDo);
        holder.taskImage.setImageResource(task.photoId);
        holder.emojiImage.setImageResource(task.emojiId);
    }
    @Override
    public int getItemCount(){
        return tasks.size();
    }
}
