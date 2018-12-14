package com.example.subhidev.distanceconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button p1 = (Button)findViewById(R.id.p1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxMiles= (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm= (EditText) findViewById(R.id.editTextKm);
              double vMiles = Double.valueOf(textBoxMiles.getText().toString());
                double vKm = vMiles / 0.62137;
                DecimalFormat formatval= new DecimalFormat("##.##");
                textBoxKm.setText(formatval.format(vKm));
            }
        });
        Button p2 = (Button)findViewById(R.id.p2);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxMiles= (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm= (EditText) findViewById(R.id.editTextKm);
                double vKm = Double.valueOf(textBoxKm.getText().toString());
                double vMiles = 0.62137 * vKm;
                DecimalFormat formatval= new DecimalFormat("##.##");
                textBoxMiles.setText(formatval.format(vMiles));
            }
        });

    }
}
