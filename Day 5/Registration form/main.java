package com.example.main_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2, edit3, edit4, edit5;
    RadioGroup radgrp;
    RadioButton radioButton;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        edit3 = (EditText) findViewById(R.id.edit3);
        edit4 = (EditText) findViewById(R.id.edit4);
        edit5 = (EditText) findViewById(R.id.edit5);
        button1 = (Button) findViewById(R.id.button1);
        radgrp = (RadioGroup) findViewById(R.id.radgrp);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radgrp.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                String gender = radioButton.getText().toString();
                String name = edit1.getText().toString();
                String email = edit2.getText().toString();
                String mob = edit3.getText().toString();
                String password = edit4.getText().toString();
                String hobbies = edit5.getText().toString();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("NAME", name);
                intent.putExtra("EMAIL", email);
                intent.putExtra("MOB", mob);
                intent.putExtra("GENDER", gender);
                intent.putExtra("PASSWORD", password);
                intent.putExtra("HOBBIES", hobbies);
                startActivity(intent);

            }
        });

    }
}
