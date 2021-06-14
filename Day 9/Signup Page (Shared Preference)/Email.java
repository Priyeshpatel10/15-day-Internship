package com.example.priyesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class email extends AppCompatActivity {
    EditText mail;
    Button b;
    String a, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        mail = (EditText) findViewById(R.id.l2);
        b = (Button) findViewById(R.id.b1);
        final SharedPreferences.Editor l2=getSharedPreferences("MYPREF",MODE_PRIVATE).edit();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = mail.getText().toString().trim();
                if (TextUtils.isEmpty(email)) {
                    mail.setError("E-mail is Mandatory!!");

                } else {
                    Intent o = new Intent(email.this, password.class);
                    startActivity(o);
                }
                a = mail.getText().toString();
                Intent p = new Intent(email.this, password.class);
                l2.putString("mm", a);
                l2.commit();
                startActivity(p);

                    Intent o=new Intent(email.this,mobnub .class);
                    startActivity(o);

                }
        });
    }
}
