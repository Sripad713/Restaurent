package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Buttons extends AppCompatActivity {



    Button chinese,dessersts,biryani,curries,tea,icecream,salads,juice,chat,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        MainActivity2.mediaPlayer.start();



        chinese=findViewById(R.id.chinese);
        dessersts=findViewById(R.id.desserts);
        biryani=findViewById(R.id.biryani);
        curries=findViewById(R.id.curries);
        tea=findViewById(R.id.tc);
        icecream=findViewById(R.id.icecream);
        salads=findViewById(R.id.Salade);
        juice=findViewById(R.id.juice);
        chat=findViewById(R.id.chats);
        next=findViewById(R.id.next);




        chinese.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i=new Intent(Buttons.this,MainActivity.class);
                startActivity(i);
            }
        });
        dessersts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Buttons.this,Dessersts.class);
                startActivity(i);
            }
        });
        biryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Buttons.this,BBriyani.class);
                startActivity(i);
            }
        });
        curries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Buttons.this,Curries.class);
                startActivity(i);
            }
        });
        tea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Buttons.this,Tea.class);
                startActivity(i);
            }
        });
        icecream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Buttons.this,Icecream.class);
                startActivity(i);
            }
        });
        salads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Buttons.this,Salads.class);
                startActivity(i);
            }
        });
        juice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Buttons.this,Juice.class);
                startActivity(i);
            }
        });
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Buttons.this,chaat.class);
                startActivity(i);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent(Buttons.this,Next.class);
                startActivity(i);

            }
        });


    }
}