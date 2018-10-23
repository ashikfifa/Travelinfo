package com.example.intelcorei5.travelinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activity_sangurestaurants extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sangurestaurants);

        webView = (WebView) findViewById(R.id.webviewrestaurants);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/search?ei=vKuzW-fUD8rTvwSBw53ABA&q=sangu%20river%20nearest%20restaurants%20in%20bandarban&oq=sangu+river+nearest+restaurants+in+bandarban&gs_l=psy-ab.3...32940.36096.0.36310.11.11.0.0.0.0.336.1316.1j8j0j1.10.0....0...1c.1.64.psy-ab..1.1.113...33i10k1.0.yM6odC90zgc&npsic=0&rflfq=1&rlha=0&rllag=22117511,92299969,13020&tbm=lcl&rldimm=15764648325180176793&ved=2ahUKEwiP8OC8pujdAhVKOY8KHeNmACcQvS4wAHoECAIQJw&rldoc=1&tbs=lrf:!2m1!1e2!2m1!1e3!2m1!1e16!3sIAE,lf:1,lf_ui:1#rlfi=hd:;si:15764648325180176793;mv:!3m12!1m3!1d273185.6867112943!2d92.36437020000001!3d21.97173555!2m3!1f0!2f0!3f0!3m2!1i277!2i443!4f13.1;tbs:lrf:!2m1!1e2!2m1!1e3!2m1!1e16!3sIAE,lf:1,lf_ui:1");
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
