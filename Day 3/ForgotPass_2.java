package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class newpassword extends AppCompatActivity {
    EditText a,b;
    Button c;
    String x,y,p,n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpassword);
        a=(EditText)findViewById(R.id.p1);
        b=(EditText)findViewById(R.id.p2);
        c=(Button) findViewById(R.id.b1);
        final SharedPreferences.Editor e1=getSharedPreferences("MYPREF",MODE_PRIVATE).edit();
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p=a.getText().toString().trim();
                n=b.getText().toString().trim();
                if(TextUtils.isEmpty(p))
                {
                    a.setError("Name is Mandatory!!");

                }
                else if(TextUtils.isEmpty(n))
                {
                    b.setError("Password is Mandatory");
                }
                else
                    {
                    Intent o = new Intent(newpassword.this, MainActivity.class);
                    startActivity(o);
                }

                x=a.getText().toString();
                y=b.getText().toString();
                if (x.equals(y))
                {
                    Intent i=new Intent(newpassword.this,MainActivity.class);
                    e1.putString("ss",x);
                    e1.commit();
                    startActivity(i);
                    finish();
                    Toast.makeText(newpassword.this,"Successfully change",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(newpassword.this,"Password did't match.Try again",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
