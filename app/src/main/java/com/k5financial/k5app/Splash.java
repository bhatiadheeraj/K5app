package com.k5financial.k5app;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    private TextView cn;
    private Animation fade1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);;
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

//            View decorView = getWindow().getDecorView();
//    // Hide the status bar.
//            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
//            decorView.setSystemUiVisibility(uiOptions);
//    // Remember that you should never show the action bar if the
//    // status bar is hidden, so hide that too if necessary.
//            ActionBar actionBar = this.getActionBar();
//            actionBar.hide();

         cn = (TextView)findViewById(R.id.companyname);
        fade1 = AnimationUtils.loadAnimation(this, R.anim.fadein);
        cn.startAnimation(fade1);
        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                Intent i = new Intent(getApplicationContext(),Menu.class);
                startActivity(i);
            }
        }.start();

    }
}
