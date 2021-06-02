package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class information extends AppCompatActivity {
    TextView tvname,tvmail,tvphone,tvhobbies,tvgender;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informaton);
        tvname = (TextView) findViewById(R.id.tvname);
        tvmail=(TextView)findViewById(R.id.tvmail) ;
        tvphone=(TextView)findViewById(R.id.tvphone);
        tvhobbies=(TextView)findViewById(R.id.tvhobbies);
        tvgender=(TextView)findViewById(R.id.tvgender);


        Intent intent=getIntent();
        String name =intent.getStringExtra("keyname");
        tvname.setText("Name="+name);
        String email =intent.getStringExtra("keyemail");
        tvmail.setText("Email="+email);
        String phone =intent.getStringExtra("keyphone");
        tvphone.setText("Phoneno.="+phone);
        String hobbies =intent.getStringExtra("keyhobbies");
        tvhobbies.setText("Hobbies:"+hobbies);
        String gender =intent.getStringExtra("keygender");
        tvgender.setText("Gender="+gender);



    }
}
