package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Curries extends AppCompatActivity {
    GridView coursesGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curries);


        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("Korma",00, R.drawable.korma));
        courseModelArrayList.add(new CourseModel("Saag",00, R.drawable.saag));
        courseModelArrayList.add(new CourseModel("Tikka Masala",00, R.drawable.tikkamasala));
        courseModelArrayList.add(new CourseModel("Dhansak",00,R.drawable.dhansak));


        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}