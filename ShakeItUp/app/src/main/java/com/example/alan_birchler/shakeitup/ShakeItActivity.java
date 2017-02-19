package com.example.alan_birchler.shakeitup;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class ShakeItActivity extends AppCompatActivity {

    private TextView mixedFlavor;
    private TextView firstFlavor;
    private TextView secondFlavor;
    private TextView thirdFlavor;
    private TextView flavorsthree;
    private TextView flavorstwo;
    private TextView mix;
    private TextView toGet;
    private String   flavors[] = new String[16];
    int              flavor1;
    int              flavor2;
    String[]         flavor1Words;
    String[]         flavor2Words;
    String[]         outputs;
    private Switch   toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shake_it);

        flavorsthree = (TextView) findViewById(R.id.flavors3);
        flavorsthree.setTextColor(Color.parseColor("#8FF75549"));
        flavorstwo = (TextView) findViewById(R.id.flavors2);
        mixedFlavor = (TextView) findViewById(R.id.mixedflavor);
        firstFlavor = (TextView) findViewById(R.id.firstflavor);
        secondFlavor = (TextView) findViewById(R.id.secondflavor);
        thirdFlavor = (TextView) findViewById(R.id.thirdflavor);
        mix = (TextView) findViewById(R.id.mix);
        toGet = (TextView) findViewById(R.id.toget);

        //Switch initialization
        toggle = (Switch) findViewById(R.id.switch1);
        toggle.setChecked(false);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    flavorsthree.setTextColor(Color.parseColor("#FFF75549"));
                    flavorstwo.setTextColor(Color.parseColor("#8FF75549"));
                }
                else {
                    flavorstwo.setTextColor(Color.parseColor("#FFF75549"));
                    flavorsthree.setTextColor(Color.parseColor("#8FF75549"));
                }
            }
        });
        this.populateArray();

        Typeface pacificoFont = Typeface.createFromAsset(getAssets(), "Pacifico.ttf");
        mixedFlavor.setTypeface(pacificoFont);
        firstFlavor.setTypeface(pacificoFont);
        secondFlavor.setTypeface(pacificoFont);
        thirdFlavor.setTypeface(pacificoFont);
        mix.setTypeface(pacificoFont);
        toGet.setTypeface(pacificoFont);


    }

    public void populateArray()
    {
        flavors[0] = "Peanut Butter Cup";
        flavors[1] = "Butter Pecan";
        flavors[2] = "Fudge Tracks";
        flavors[3] = "Mint Chocolate Chip";
        flavors[4] = "Cookie Dough";
        flavors[5] = "Espresso Chip";
        flavors[6] = "Rocky Road";
        flavors[7] = "Double Fudge Brownie";
        flavors[8] = "Vanilla Bean";
        flavors[9] = "Strawberry";
        flavors[10] = "Chocolate";
        flavors[11] = "Cookies 'N Cream";
        flavors[12] = "Black Cherry Vanilla";
        flavors[13] = "Rainbow Sherbet";
        flavors[14] = "Lemon Sorbet";
        flavors[15] = "Raspberry Sorbet";
    }


    public String[] pickTwoFlavors()
    {
        Random random = new Random();

        flavor1 = random.nextInt(16);
        flavor2 = random.nextInt(16);
        if (flavor2 == flavor1)
        {
            while (flavor2 == flavor1)
            {
                flavor2 = random.nextInt(16);
            }
        }

        // combine names of flavors

        String name = new String();

        flavor1Words = flavors[flavor1].split(" ");
        flavor2Words = flavors[flavor2].split(" ");

        name += flavor1Words[0];
        name += " ";
        // append last word of second flavor
        name += flavor2Words[flavor2Words.length - 1];

        String[] pickedFlavors = { flavors[flavor1], flavors[flavor2], name };

        return pickedFlavors;

    }


    public String[] pickThreeFlavors()
    {
        Random random = new Random();

        flavor1 = random.nextInt(16);
        flavor2 = random.nextInt(16);
        int flavor3 = random.nextInt(16);

        while (flavor2 == flavor1)
        {
            flavor2 = random.nextInt(16);
        }
        while (flavor3 == flavor2 || flavor3 == flavor1)
        {
            flavor3 = random.nextInt(16);
        }

        // combine names of flavors

        String name = new String();

        flavor1Words = flavors[flavor1].split(" ");
        flavor2Words = flavors[flavor2].split(" ");
        String[] flavor3Words = flavors[flavor3].split(" ");

        name += flavor1Words[0];
        name += " ";
        // append second (or last) word of second flavor
        switch (flavor2Words.length)
        {
            case 3:
                name += flavor2Words[1];
                break;

            default:
                name += flavor2Words[flavor2Words.length - 1];
        }

        // append last word of third flavor

        name += " ";
        name += flavor3Words[flavor3Words.length - 1];

        String[] pickedFlavors = { flavors[flavor1], flavors[flavor2], flavors[flavor3], name };

        return pickedFlavors;

    }

    public void shakeItUp(View view){
        if (toggle.isChecked()) {
            outputs = this.pickThreeFlavors();
            firstFlavor.setText(outputs[0]);
            secondFlavor.setText(outputs[1]);
            thirdFlavor.setText(outputs[2]);
            mixedFlavor.setText(outputs[3]);
        }
        else {
            outputs = this.pickTwoFlavors();
            firstFlavor.setText(outputs[0]);
            secondFlavor.setText(outputs[1]);
            mixedFlavor.setText(outputs[2]);
            thirdFlavor.setText("&");
        }
    }

    public String[] getFlavors()
    {
        return flavors;
    }

}
