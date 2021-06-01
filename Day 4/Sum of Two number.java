package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.num1);
        e2=findViewById(R.id.num2);
        b1=findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2;
                s1= e1.getText().toString();
                s2=e2.getText().toString();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int sum = a + b;
                Toast.makeText(MainActivity.this, "Sum is: "+sum, Toast.LENGTH_SHORT).show();



            }
        });
    }
}
