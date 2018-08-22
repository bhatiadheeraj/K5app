package com.k5financial.k5app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class SIP extends AppCompatActivity {

    EditText etmi;
    EditText etir;
    EditText ettenure;
    SeekBar interestratesk;
    SeekBar tenureseekbarsk;
    Button calc;
    EditText investment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sip);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        etmi =(EditText)findViewById(R.id.etmi);
        etir = (EditText)findViewById(R.id.etir);
        ettenure = (EditText)findViewById(R.id.ettenure);
        interestratesk = (SeekBar)findViewById(R.id.interestrateSeekBar);
        tenureseekbarsk = (SeekBar)findViewById(R.id.tenureseekbar);
        calc = (Button)findViewById(R.id.calcsip);

        etir.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try{
                    //Update Seekbar value after entering a number
                    interestratesk.setProgress(Integer.parseInt(s.toString()));
                } catch(Exception ex) {}
            }
        });

        interestratesk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                etir.setText(Integer.toString(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        ettenure.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try{
                    //Update Seekbar value after entering a number
                    tenureseekbarsk.setProgress(Integer.parseInt(s.toString()));
                } catch(Exception ex) {}
            }
        });

        tenureseekbarsk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                ettenure.setText(Integer.toString(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sipCALC(Integer.parseInt(etmi.getText().toString()),Integer.parseInt(etir.getText().toString()),Integer.parseInt(ettenure.getText().toString()));
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

    private void sipCALC(int MonthlyInvestment, int ROI, int tenure){
//        int monthlyRate = ROI/12/ 100; //Rate of interest
//        double futurevalue = 0;
//        futurevalue =(Math.pow(1 + monthlyRate, tenure) - 1) /
//                monthlyRate;

        int investment = MonthlyInvestment; //principal amount
        float annualRate = (float) ROI/(float) 12;
        double monthlyRate = annualRate / 100; //Rate of interest
        int months =  tenure; //Time period
        double futureValue = 0; //Final Value

        futureValue =  investment * (Math.pow(1 + monthlyRate, months) - 1) /
                monthlyRate ;


        Toast.makeText(getApplicationContext(),""+(int)futureValue,Toast.LENGTH_LONG).show();

    }
}
