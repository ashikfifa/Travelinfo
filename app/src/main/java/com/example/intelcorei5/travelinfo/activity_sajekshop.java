package com.example.intelcorei5.travelinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activity_sajekshop extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sajekshop);

        webView = (WebView) findViewById(R.id.webviewshop);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.tripadvisor.co.za/ShowUserReviews-g3664159-d7682501-r437674622-Sajek-Khagrachari_Chittagong_Division.html");
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
