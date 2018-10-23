package com.example.intelcorei5.travelinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activity_keokradongshop extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keokradongshop);

        webView = (WebView) findViewById(R.id.webviewshop);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.tripadvisor.com/Attraction_Review-g2368232-d9861071-Reviews-Keokradong-Bandarban_Chittagong_Division.html");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
