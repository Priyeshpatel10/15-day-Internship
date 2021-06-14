package com.example.priyesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class password extends AppCompatActivity {
    EditText a;
    Button b;
    String i,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        a=(EditText)findViewById(R.id.s2);
        b=(Button) findViewById(R.id.b1);
        final SharedPreferences.Editor e1=getSharedPreferences("MYPREF",MODE_PRIVATE).edit();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p= a.getText().toString().trim();

                if(TextUtils.isEmpty(p))
                {
                    a.setError("Password is Mandatory!!");

                }
                else
                {
                    i=a.getText().toString();
                    Intent i1=new Intent(password.this, MainActivity.class);
                    e1.putString("ss",i);
                    e1.commit();
                    startActivity(i1);
                    finish();
                    Toast.makeText(password.this,"Account created successfully",Toast.LENGTH_LONG).show();
                }}
        });
    }
}
