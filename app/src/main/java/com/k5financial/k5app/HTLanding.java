package com.k5financial.k5app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RadioButton;

public class HTLanding extends AppCompatActivity {

//    RadioButton sf;
//    RadioButton sands;
//    RadioButton ff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htlanding);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final WebView wv = (WebView)findViewById(R.id.webviewone);
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wv.loadUrl("https://www.journaldev.com");
        wv.loadUrl("https://happy.adityabirlacapital.com/abhiqq/#quickQuote");
//
//        sf = (RadioButton)findViewById(R.id.selfradio);
//        sands = (RadioButton)findViewById(R.id.radiosands);
//        ff = (RadioButton)findViewById(R.id.radioff);
//
//        sf.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(), SelfHT.class);
//                startActivity(i);
//            }
//        });
//
//        sands.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        ff.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}
