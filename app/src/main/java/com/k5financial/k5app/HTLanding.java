package com.k5financial.k5app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

public class HTLanding extends AppCompatActivity {

    RadioButton sf;
    RadioButton sands;
    RadioButton ff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htlanding);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sf = (RadioButton)findViewById(R.id.selfradio);
        sands = (RadioButton)findViewById(R.id.radiosands);
        ff = (RadioButton)findViewById(R.id.radioff);

        sf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

        sands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

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