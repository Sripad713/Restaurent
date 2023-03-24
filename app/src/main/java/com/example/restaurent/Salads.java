package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Salads extends AppCompatActivity {
    GridView coursesGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salads);

        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("Greek Salad",00, R.drawable.greeksalad));
        courseModelArrayList.add(new CourseModel("Pasta Salad",00, R.drawable.pastasalad));
        courseModelArrayList.add(new CourseModel("Saesar Salad Supreme ",00, R.drawable.saesarsaladsupreme));
        courseModelArrayList.add(new CourseModel("Strawberry Spinach Salad",00,R.drawable.strawberryspinachsalad));


        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}