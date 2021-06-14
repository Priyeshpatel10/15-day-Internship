package com.example.priyesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class gender extends AppCompatActivity {
    RadioButton a,b;
    RadioGroup gender;
    Button d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        a=(RadioButton) findViewById(R.id.c1);
        b=(RadioButton) findViewById(R.id.c2);
        d=(Button)findViewById(R.id.b1);
        gender = (RadioGroup) findViewById(R.id.Gender);
        d.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent o=new Intent(gender.this,password.class);
                startActivity(o);


            }
        });
        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String selectedGender ;

            }
        });
    }

}





