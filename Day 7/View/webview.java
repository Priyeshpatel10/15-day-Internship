package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class webview extends AppCompatActivity implements View.OnClickListener {
    TextView t1;
    EditText edit1;
    Button b1;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        t1 =(TextView) findViewById(R.id.t1);
        edit1 =(EditText) findViewById(R.id.edit1);
        b1 =(Button) findViewById(R.id.b1);
        web =(WebView) findViewById(R.id.web);
        b1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.b1:
                String url = edit1.getText().toString();
                web.getSettings().setJavaScriptEnabled(true);
                web.loadUrl(url);

                break;
        }
    }
    private class MywebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            return super.shouldOverrideUrlLoading(view, url);
            view.loadUrl(url);
            return true;
        }
    }
    {

    }
}
