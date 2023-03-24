package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class BBriyani extends AppCompatActivity {
    GridView coursesGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_briyani);
        setContentView(R.layout.activity_main);

        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("Kaju Biryani",200, R.drawable.caju));
        courseModelArrayList.add(new CourseModel("Handi Biryani",300, R.drawable.handi));
        courseModelArrayList.add(new CourseModel("Jack Fruit Biryani",250, R.drawable.jacjfruirt));
        courseModelArrayList.add(new CourseModel("Panner Biryani ",150,R.drawable.pannerbi));
        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}

