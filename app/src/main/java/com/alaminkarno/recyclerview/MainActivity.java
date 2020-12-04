package com.alaminkarno.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Student> studentList;
    RecyclerView recyclerView;
    StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        studentAdapter = new StudentAdapter(studentList);
        recyclerView.setAdapter(studentAdapter);

        studentList.add(new Student("Alamin","01","Ten",R.drawable.image));
        studentList.add(new Student("B","01","Ten",R.drawable.image));
        studentList.add(new Student("C","01","Ten",R.drawable.image));
        studentList.add(new Student("D","01","Ten",R.drawable.image));
        studentList.add(new Student("E","01","Ten",R.drawable.image));
        studentList.add(new Student("Alamin","01","Ten",R.drawable.image));
        studentList.add(new Student("Alamin","01","Ten",R.drawable.image));
        studentList.add(new Student("Alamin","01","Ten",R.drawable.image));
        studentList.add(new Student("Alamin","01","Ten",R.drawable.image));
        studentList.add(new Student("Alamin","01","Ten",R.drawable.image));
        studentList.add(new Student("Alamin","01","Ten",R.drawable.image));


        studentAdapter.notifyDataSetChanged();


    }
}