package com.example.alan_birchler.shakeitup;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Typeface pacificoFont = Typeface.createFromAsset(getAssets(), "Pacifico.ttf");

        textView = (TextView) findViewById(R.id.textView0);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView1);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView2);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView3);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView4);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView5);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView6);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView7);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView8);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView9);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView10);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView11);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView12);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView13);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView14);
        textView.setTypeface(pacificoFont);

        textView = (TextView) findViewById(R.id.textView15);
        textView.setTypeface(pacificoFont);
    }
}
