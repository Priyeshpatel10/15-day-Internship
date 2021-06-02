package com.example.registration;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 EditText etname;
 EditText etgender;
 EditText etphone;
 EditText etemail;
 EditText etpassword;
 EditText ethobbies;
 Button btnsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname = (EditText) findViewById(R.id.etname);
        etemail =(EditText)findViewById(R.id.etemail);
        etphone =(EditText)findViewById(R.id.etphone);
        etpassword =(EditText)findViewById(R.id.etPassword);
        ethobbies =(EditText)findViewById(R.id.ethobbies);
        btnsubmit=(Button)findViewById(R.id.btnsubmit);
        etgender=(EditText)findViewById(R.id.etgender);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=etname.getText().toString();
                String email=etemail.getText().toString();
                String phone=etphone.getText().toString();
                String password=etpassword.getText().toString();
                String hobbies=ethobbies.getText().toString();
                String gender=etgender.getText().toString();

                Intent intent = new Intent(MainActivity.this,information.class);

                intent.putExtra("keyname",username);
                intent.putExtra("keyemail",email);
                intent.putExtra("keypassword",password);
                intent.putExtra("keyphone",phone);
                intent.putExtra("keyhobbies",hobbies);
                intent.putExtra("keygender",gender);

                startActivity(intent);
            }
        });


    }
}
