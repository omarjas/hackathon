package com.example.alan_birchler.shakeitup;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void shake(View view) {
        Intent intent = new Intent(this, ShakeItActivity.class);
        startActivity(intent);
    }

    public void menu(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface pacificoFont = Typeface.createFromAsset(getAssets(), "Pacifico.ttf");
        TextView deetsHours = (TextView)findViewById(R.id.deetshours);
        TextView weekDays = (TextView)findViewById(R.id.weekdays);
        TextView weekDaysTime = (TextView)findViewById(R.id.weekdaystime);
        TextView weekends = (TextView)findViewById(R.id.weekends);
        TextView weekendsTime = (TextView)findViewById(R.id.weekendstime);

        deetsHours.setTypeface(pacificoFont);
        weekDays.setTypeface(pacificoFont);
        weekDaysTime.setTypeface(pacificoFont);
        weekends.setTypeface(pacificoFont);
        weekendsTime.setTypeface(pacificoFont);
    }
}
