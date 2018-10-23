package com.example.intelcorei5.travelinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activity_chandranathguide extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chandranathguide);

        webView = (WebView) findViewById(R.id.webviewguide);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.tripadvisor.com/ShowUserReviews-g1152662-d4138922-r317949617-Sri_Chandranath_Temple-Margao_South_Goa_District_Goa.html");
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
