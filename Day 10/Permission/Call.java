package com.example.permission;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class phone extends AppCompatActivity {
    EditText e1;
    Button b1;
    static int PERMISSION_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        e1 = findViewById(R.id.e1);
        b1 = findViewById(R.id.b1);
        if (ContextCompat.checkSelfPermission(phone.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
        {

            ActivityCompat.requestPermissions(phone.this,new String[]
                    {Manifest.permission.CALL_PHONE},PERMISSION_CODE);

        }
        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
                String number = e1.getText().toString();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+number));
                startActivity(intent);
            }
        });

    }
}
