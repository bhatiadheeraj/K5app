package com.k5financial.k5app;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    private CardView homeloan;
    private CardView termplan;
    private CardView hi;
    private CardView sip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        homeloan = findViewById(R.id.homeloan);
        termplan = findViewById(R.id.termplan);
        hi= findViewById(R.id.health);
        sip = findViewById(R.id.SIP);

        homeloan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"homeloan activity",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Homeloan.class);
                startActivity(i);
            }
        });

        termplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"termplan activity",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),TERMPLAN.class);
                startActivity(i);
            }
        });

        hi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"hi activity",Toast.LENGTH_SHORT).show();
            }
        });

        sip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"sip activity",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),SIP.class);
                startActivity(i);
            }
        });
    }
}
