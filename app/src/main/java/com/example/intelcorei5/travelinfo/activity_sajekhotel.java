package com.example.intelcorei5.travelinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activity_sajekhotel extends AppCompatActivity {

    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sajekhotel);

        webView = (WebView) findViewById(R.id.webviewhotel);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.tripadvisor.com/SmartDeals-g2368232-Bandarban_Chittagong_Division-Hotel-Deals.html");
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
