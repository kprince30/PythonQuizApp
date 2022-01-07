package com.example.pythonquiz;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
   private String questions[]= {"Does python supports Object oriented Programming(OOP)?", "Is Rational a datatype in python?", "Is Python an interpreted language?", "List method 'append' adds an element to the end of the list.", "Has Python three high-level data structures: lists, dictionaries and hashes?"};
   private Boolean answeres[]={TRUE,FALSE,TRUE,TRUE,FALSE};
   Button yes;
   Button no;
   TextView ques;
   static private int index = 0;
   static private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        yes= findViewById(R.id.yes);
        no= findViewById(R.id.no);
        ques= findViewById(R.id.ques);

        yes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (answeres[index]==TRUE){
                    score = score + 1;
                }

                if (index+1 == questions.length){
                    Toast.makeText(MainActivity2.this, "Your Score is " + score+"/5", Toast.LENGTH_SHORT).show();
                }
                ques.setText(questions[++index]);
            }
        });
        no.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (answeres[index]==FALSE){
                    score = score + 1;
                }
                if (index+1 == questions.length){
                    Toast.makeText(MainActivity2.this, "Your Score is " + score+"/5", Toast.LENGTH_SHORT).show();
                }

                ques.setText(questions[++index]);
            }
        });
    }}