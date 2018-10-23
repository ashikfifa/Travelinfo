package com.example.intelcorei5.travelinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activity_keokradongrestaurants extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keokradongrestaurants);

        webView = (WebView) findViewById(R.id.webviewrestaurants);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.tripadvisor.com/ShowUserReviews-g2368232-d9861071-r430500425-Keokradong-Bandarban_Chittagong_Division.html");
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
