package com.example.letseat;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnsignin, btnsignup;
    TextView txtslogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsignin = (Button)findViewById(R.id.btnsignin);
        btnsignup = (Button)findViewById(R.id.btnsignin);

        txtslogan = (TextView)findViewById(R.id.txtslogan);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/Lobster.zip");
        txtslogan.setTypeface(face);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }
}