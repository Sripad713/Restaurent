package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Icecream extends AppCompatActivity {
    GridView coursesGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icecream);

        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("Soft Serve",00, R.drawable.softserve));
        courseModelArrayList.add(new CourseModel("Kulfi",00, R.drawable.kulfi));
        courseModelArrayList.add(new CourseModel("Frozen Yogurt",00, R.drawable.frozenyogurt));
        courseModelArrayList.add(new CourseModel("Sherbet",00,R.drawable.sherbet));


        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}
