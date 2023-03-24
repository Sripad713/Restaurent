package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Tea extends AppCompatActivity {
    GridView coursesGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tea);
        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("Harbal Tea",00, R.drawable.harbaltea));
        courseModelArrayList.add(new CourseModel("Kashmiri Kahwa",00, R.drawable.kashmirikahwa));
        courseModelArrayList.add(new CourseModel("Nilgiri Tea ", 00,R.drawable.nilgiritea));
        courseModelArrayList.add(new CourseModel("Masala Chai",00,R.drawable.masalachai));


        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}
