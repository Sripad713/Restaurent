package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class chaat extends AppCompatActivity {
    GridView coursesGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaat);
        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("Dahi Puri",00, R.drawable.dahipuri));
        courseModelArrayList.add(new CourseModel("Dahi Vada",00, R.drawable.dahivada));
        courseModelArrayList.add(new CourseModel("AlooT ikki Chat",00, R.drawable.alootikkichaat));
        courseModelArrayList.add(new CourseModel("Bhel Puri",00,R.drawable.bhelpuri));


        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}