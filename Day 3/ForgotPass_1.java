package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class forgotpassword extends AppCompatActivity {
    EditText a;
    Button b;
    SharedPreferences p;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        a=(EditText)findViewById(R.id.f1);
        b=(Button)findViewById(R.id.b1);
        p=getApplicationContext().getSharedPreferences("MYPREF",MODE_PRIVATE);
        s=p.getString("nn",null);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (a.getText().toString().equals(s))
               {
                   Toast.makeText(forgotpassword.this,"write new password",Toast.LENGTH_LONG).show();
                   Intent i=new Intent(forgotpassword.this,newpassword.class);
                   startActivity(i);
                   finish();
               }
               else
               {
                   Toast.makeText(forgotpassword.this,"No account match that information",Toast.LENGTH_LONG).show();
               }

        };
        });
    }
}
