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

public class    MainActivity extends AppCompatActivity {
  EditText a, b;
 Button c;
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
    }
}
