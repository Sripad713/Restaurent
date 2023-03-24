package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Juice extends AppCompatActivity {
    GridView coursesGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juice);
        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();


        courseModelArrayList.add(new CourseModel("Orange Juice",00, R.drawable.orangejuice));
        courseModelArrayList.add(new CourseModel("Pineapple Juice",00, R.drawable.pineapplejuice));
        courseModelArrayList.add(new CourseModel("Dragon Juice",00, R.drawable.dragonjuice));
        courseModelArrayList.add(new CourseModel("Pomegranate Juice",00,R.drawable.pomegranatejuice));




        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}

