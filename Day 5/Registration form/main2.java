package com.example.main_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView1, textView2, textView3, textView4, textView5, textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String mob = intent.getStringExtra("MOB");
        String gender = intent.getStringExtra("GENDER");
        String password = intent.getStringExtra("PASSWORD");
        String hobbies = intent.getStringExtra("HOBBIES");
        textView1.setText(":- "+name);
        textView2.setText(":- "+email);
        textView3.setText(":- "+mob);
        textView4.setText(":- "+gender);
        textView5.setText(":- "+password);
        textView6.setText(":- "+hobbies);
    }
}
