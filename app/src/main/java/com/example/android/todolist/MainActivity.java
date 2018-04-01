package com.example.android.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Task> tasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setList();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new TaskAdapter( tasks, this));
    }
    public void setList(){
        tasks = new ArrayList<>();
        tasks.add(new Task(R.string.medium, R.string.food, R.drawable.bullet, R.drawable.medium_p));
        tasks.add(new Task(R.string.high, R.string.dog, R.drawable.bullet, R.drawable.high_p));
        tasks.add(new Task(R.string.medium, R.string.report, R.drawable.bullet, R.drawable.medium_p));
        tasks.add(new Task(R.string.high, R.string.call, R.drawable.bullet, R.drawable.high_p));
        tasks.add(new Task(R.string.low, R.string.sub, R.drawable.bullet, R.drawable.low_p));
        tasks.add(new Task(R.string.high, R.string.pay, R.drawable.bullet, R.drawable.high_p));
        tasks.add(new Task(R.string.low, R.string.ask, R.drawable.bullet, R.drawable.low_p));
    }

}
