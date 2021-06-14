package com.example.priyesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class name extends AppCompatActivity {
    Button b;
    String nameString, surnameString;
    EditText name, surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        name =(EditText) findViewById(R.id.l1);
        surname =(EditText) findViewById(R.id.l2);
        b = (Button) findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameString = name.getText().toString().trim();
                surnameString= surname.getText().toString().trim();
                if(TextUtils.isEmpty(nameString))
                {
                    name.setError("Name is Mandatory!!");

                }
                else if(TextUtils.isEmpty(surnameString))
                {
                    surname.setError("Surname is Mandatory");
                }
                else
                {
                    Intent o = new Intent(name.this, email.class);
                    startActivity(o);
                }
            }
        });
    }

}
