package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=findViewById(R.id.web_view);

        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String file="file:android_asset/Androidgif.gif";
        webView.loadUrl(file);
    }
}