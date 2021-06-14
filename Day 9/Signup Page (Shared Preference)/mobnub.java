package com.example.priyesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mobnub extends AppCompatActivity {
    EditText a;
    Button  b;
    String j,phn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobnub);
        a=(EditText)findViewById(R.id.e1);
        b=(Button)findViewById(R.id.b1);
        final SharedPreferences.Editor e1=getSharedPreferences("MYPREF",MODE_PRIVATE).edit();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phn =a.getText().toString().trim();
                if(TextUtils.isEmpty(phn))
                {
                    a.setError("Number is Mandatory!!");

                }
                else
                {
                    Intent o = new Intent(mobnub.this,password.class);
                    startActivity(o);
                }
                j=a.getText().toString();
                Intent p=new Intent(mobnub.this,gender.class);
                e1 .putString("nn",j);
                e1.commit();
                startActivity(p);


            }
        });
    }

}

