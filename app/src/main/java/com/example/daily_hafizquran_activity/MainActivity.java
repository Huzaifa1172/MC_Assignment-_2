package com.example.daily_hafizquran_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<StudentModel> students=new ArrayList<>();
    RecyclerView recyclerView=findViewById(R.id.recyclerStudent);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        students.add(new StudentModel("Huzaifa","24"));
        students.add(new StudentModel("Huzaifa yaseen","24"));
        students.add(new StudentModel("Usman","24"));
        students.add(new StudentModel("Ali","24"));
        students.add(new StudentModel("Luqman","24"));
        students.add(new StudentModel("usama","24"));
        students.add(new StudentModel("Huzaifa","24"));
        students.add(new StudentModel("Huzaifa","24"));
        students.add(new StudentModel("Huzaifa","24"));
        students.add(new StudentModel("Shehroz","24"));
        students.add(new StudentModel("Munir","24"));

        RecyclerStudent adapter=new RecyclerStudent(this,students);
        recyclerView.setAdapter(adapter);


    }
}