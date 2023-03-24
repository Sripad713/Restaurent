package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView coursesGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("Manchurian",00, R.drawable.logo));
        courseModelArrayList.add(new CourseModel("Noodles",00, R.drawable.logo1));
        courseModelArrayList.add(new CourseModel("Fried Rice",00, R.drawable.frid));
        courseModelArrayList.add(new CourseModel("Combo",00,R.drawable.logo4));
        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}

