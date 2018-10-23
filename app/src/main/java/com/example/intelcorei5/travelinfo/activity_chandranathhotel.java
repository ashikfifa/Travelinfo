package com.example.intelcorei5.travelinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activity_chandranathhotel extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chandranathhotel);

        webView = (WebView) findViewById(R.id.webviewhotel);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/search?q=chandranath%20hill%20nearest%20hotel&oq=chandranath+hill+nearest+hotel&aqs=chrome..69i57.9927j0j7&sourceid=chrome&ie=UTF-8&hotel_dates=2018-10-04,2018-10-05&npsic=0&rflfq=1&rlha=1&rlla=0&rlhsc=Ch8I7Lei_YbburXHAQjNw5Cv0LWZiUAIxM60vYKg8tlwMAI&rllag=22354700,91822598,723&tbm=lcl&rldimm=2735485805184874435&ved=2ahUKEwia6rTDxOndAhUEsY8KHfvlB10QvS4wAHoECAEQMw&rldoc=1&tbs=lf_hd:-1,lf_ho:2,lrf:!1m4!1u10!2m2!11m1!1e10!1m4!1u10!2m2!11m1!1e3!2m7!1e17!4m2!17m1!1e3!4m2!17m1!1e8!2m21!1e7!4m4!7m3!1m1!1u4000!3sBDT!4m4!7m3!1m1!1u5000!3sBDT!4m4!7m3!1m1!1u6000!3sBDT!4m4!7m3!1m1!1u9000!3sBDT!2m1!1e2!2m7!1e10!4m2!11m1!1e10!4m2!11m1!1e3!3sIAE,lf:1,lf_ui:6#rlfi=hd:2018-10-04,2018-10-05;si:2735485805184874435;mv:!3m12!1m3!1d279958.98133599875!2d91.76167179999999!3d22.5914083!2m3!1f0!2f0!3f0!3m2!1i64!2i228!4f13.1;tbs:lf_hd:-1,lf_ho:2,lrf:!1m4!1u10!2m2!11m1!1e10!1m4!1u10!2m2!11m1!1e3!2m21!1e7!4m4!7m3!1m1!1u4000!3sBDT!4m4!7m3!1m1!1u5000!3sBDT!4m4!7m3!1m1!1u6000!3sBDT!4m4!7m3!1m1!1u9000!3sBDT!2m1!1e2!2m7!1e10!4m2!11m1!1e10!4m2!11m1!1e3!2m7!1e17!4m2!17m1!1e3!4m2!17m1!1e8!3sIAE,lf:1,lf_ui:6");
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
