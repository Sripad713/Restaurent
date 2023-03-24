package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Dessersts extends AppCompatActivity {
    GridView coursesGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessersts);

        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("Cakes",80, R.drawable.cakes));
        courseModelArrayList.add(new CourseModel("Cupcakes",100, R.drawable.cupcakes));
        courseModelArrayList.add(new CourseModel("Brownies",120, R.drawable.brownies));
        courseModelArrayList.add(new CourseModel("Cookie",200,R.drawable.cookie));


        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}