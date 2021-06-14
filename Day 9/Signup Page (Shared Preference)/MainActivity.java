package com .example.priyesh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText a, b;
    Button c;
    String k, l,o, m, n;
    TextView d,t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (EditText) findViewById(R.id.l1);
        b = (EditText) findViewById(R.id.l2);
        c = (Button) findViewById(R.id.lb1);
        d = (TextView) findViewById(R.id.lb2);
        t = (TextView) findViewById(R.id.t1);
        SharedPreferences x = getApplicationContext().getSharedPreferences("MYPREF", MODE_PRIVATE);
        k = x.getString("nn", null);
        l = x.getString("ss", null);
        o=x.getString("mm",null);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m = a.getText().toString().trim();
                n = b.getText().toString().trim();

                if (TextUtils.isEmpty(m))
                {
                    a.setError("Name is Mandatory!!");
                    c.setEnabled(false);

                }
                else if (TextUtils.isEmpty(n))
                {
                    b.setError("Password is Mandatory");
                    c.setEnabled(false);
                }
                else
                {
                    c.setEnabled(true);
                }
                if (a.getText().toString().equals(k) && b.getText().toString().equals(l))
                {
                    Intent o = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(o);
                    finish();

                }
                else
                {
                    Toast.makeText(MainActivity.this, "unsuccessfull", Toast.LENGTH_LONG).show();

                }
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(MainActivity.this, join.class);
                startActivity(y);
                finish();
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(MainActivity.this, forgotpassword.class);
                startActivity(y);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed(){
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);

    }

}
