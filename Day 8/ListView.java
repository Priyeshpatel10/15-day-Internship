package com.example.listview_intership;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    ListView lv1;
    int image[] = {R.drawable.apple,R.drawable.google,R.drawable.microsoft,R.drawable.linux,R.drawable.ubuntu,R.drawable.macos,R.drawable.window,R.drawable.chromeos,R.drawable.freebsd,R.drawable.reactos};
    String name[] = {"Apple","Google","Microsoft","Linux","Ubuntu","Mac OS","Ms-Window","Chrome Os","Free-Bsd","ReactOs"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1 = findViewById(R.id.lv1);
        Myadapter myadapter = new Myadapter(image,name,MainActivity.this);
        lv1.setAdapter(myadapter);
    }
}
