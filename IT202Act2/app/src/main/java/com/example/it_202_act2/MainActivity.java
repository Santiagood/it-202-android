package com.example.it_202_act2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText getCFCroissantQTY, getCHCroissantQTY, getSCBunQTY, getQCRollQTY, getSDanishQTY, getSVRYDanishQTY, getCCDanishQTY,
            getCHCCookieQTY, getRATCSliceQTY, getMoney;

    public CheckBox classicfrenchCroissant, chocolateCroissant, swedishCardamom, quincycinnamonRoll, sweetDanish, savoryDanish,
            cinnamoncrunchDanish, chocolatechipCookies, raspberryAlmond;

    public TextView Change, Total;
    public int total, change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int Compute(View view) {
        //Variables
        final int ClassicFrenchCroissantCost = 100, ChocolateCroissantCost = 120, SwedishCardamomBunCost = 70, QuincyCinnamonRollCost = 40, SweetDanishCost = 40,
                SavoryDanishCost = 80, CinnamonCrunchDanishCost = 70, ChocolateChipCookiesCost = 30, RaspberryAlmondTeaCakeSliceCost = 50;

        int ClassicFrenchCroissant = 0, ChocolateCroissant = 0, SwedishCardamom = 0, QuincyCinnamonRoll = 0, SweetDanish = 0, SavoryDanish = 0, CinnamonCrunchDanish = 0,
                ChocolateChipCookies = 0, RaspberryAlmondTeaCakeSlice = 0;

        //CheckBox's
        classicfrenchCroissant = findViewById(R.id.inputClassicFrenchCroissant);
        chocolateCroissant = findViewById(R.id.inputChocolateCroissant);
        swedishCardamom = findViewById(R.id.inputSwedishCardamomBun);
        quincycinnamonRoll = findViewById(R.id.inputQuincyCinnamonRoll);
        sweetDanish = findViewById(R.id.inputSweetDanish);
        savoryDanish = findViewById(R.id.inputSavoryDanish);
        cinnamoncrunchDanish = findViewById(R.id.inputCinnamonCrunchDanish);
        chocolatechipCookies = findViewById(R.id.inputChocolateChipCookie);
        raspberryAlmond = findViewById(R.id.inputRaspberryAlmondTeaCakeSlice);

        //EditText's
        getCFCroissantQTY = findViewById(R.id.inputClassicFrenchCroissantQty);
        getCHCroissantQTY = findViewById(R.id.inputChocolateCroissantQty);
        getSCBunQTY = findViewById(R.id.inputSwedishCardamomBunQty);
        getQCRollQTY = findViewById(R.id.inputQuincyCinnamonRollQty);
        getSDanishQTY = findViewById(R.id.inputSweetDanishQty);
        getSVRYDanishQTY = findViewById(R.id.inputSavoryDanishQty);
        getCCDanishQTY = findViewById(R.id.inputCinnamonCrunchDanishQty);
        getCHCCookieQTY = findViewById(R.id.inputChocolateChipCookieQty);
        getRATCSliceQTY = findViewById(R.id.inputRaspberryAlmondTeaCakeSliceQty);

        Total = (TextView) findViewById(R.id.outputTotal);

       //Classic french Croissant
        if (classicfrenchCroissant.isChecked() == true) {
            ClassicFrenchCroissant = Integer.parseInt(getCFCroissantQTY.getText().toString());
            ClassicFrenchCroissant = ClassicFrenchCroissant * ClassicFrenchCroissantCost;
        }
        else {
            ClassicFrenchCroissant = 0;
        }

        //Chocolate Croissant
        if (chocolateCroissant.isChecked() == true) {
            ChocolateCroissant = Integer.parseInt(getCHCroissantQTY.getText().toString());
            ChocolateCroissant = ChocolateCroissant * ChocolateCroissantCost;
        }
        else {
            ChocolateCroissant = 0;
        }

        //Swedish Cardamom
        if (swedishCardamom.isChecked() == true) {
            SwedishCardamom  = Integer.parseInt(getSCBunQTY.getText().toString());
            SwedishCardamom = SwedishCardamom * SwedishCardamomBunCost;
        }
        else {
            SwedishCardamom = 0;
        }

        //Quincy Cinnamon Roll
        if (quincycinnamonRoll.isChecked() == true) {
            QuincyCinnamonRoll = Integer.parseInt(getQCRollQTY.getText().toString());
            QuincyCinnamonRoll = QuincyCinnamonRoll * QuincyCinnamonRollCost;
        }
        else {
            QuincyCinnamonRoll = 0;
        }

        //Sweet Danish
        if (sweetDanish.isChecked() == true) {
            SweetDanish = Integer.parseInt(getSDanishQTY.getText().toString());
            SweetDanish = SweetDanish * SweetDanishCost;
        }
        else {
            SweetDanish = 0;
        }

        //Savory Danish
        if (savoryDanish.isChecked() == true) {
            SavoryDanish = Integer.parseInt(getSVRYDanishQTY.getText().toString());
            SavoryDanish = SavoryDanish * SavoryDanishCost;
        }
        else {
            SavoryDanish = 0;
        }

        // Cinnamon Crunch Danish
        if (cinnamoncrunchDanish.isChecked() == true) {
            CinnamonCrunchDanish = Integer.parseInt(getCCDanishQTY.getText().toString());
            CinnamonCrunchDanish = CinnamonCrunchDanish * CinnamonCrunchDanishCost;
        }
        else {
            CinnamonCrunchDanish = 0;
        }

        //Chocolate Chip Cookies
        if (chocolatechipCookies.isChecked() == true) {
            ChocolateChipCookies = Integer.parseInt(getCHCCookieQTY.getText().toString());
            ChocolateChipCookies = ChocolateChipCookies * ChocolateChipCookiesCost;
        }
        else {
            ChocolateChipCookies = 0;
        }

        // Raspberry Almond Tea Cake Slice
        if (raspberryAlmond.isChecked() == true) {
            RaspberryAlmondTeaCakeSlice = Integer.parseInt(getRATCSliceQTY.getText().toString());
            RaspberryAlmondTeaCakeSlice = RaspberryAlmondTeaCakeSlice * RaspberryAlmondTeaCakeSliceCost;
        }
        else {
            RaspberryAlmondTeaCakeSlice = 0;
        }

        total = ClassicFrenchCroissant + ChocolateCroissant + SwedishCardamom + QuincyCinnamonRoll + SweetDanish + SavoryDanish + CinnamonCrunchDanish + ChocolateChipCookies + RaspberryAlmondTeaCakeSlice;
        Total.setText("Total: " + String.valueOf(total));
        return total;
    }

    public void Change(View view2) {
        change = 0;
        getMoney = findViewById(R.id.inputCash);
        Change = findViewById(R.id.outputChange);
        change = Integer.parseInt(getMoney.getText().toString());

        if(change < total) {
            Change.setText("Error! your money should be higher than your total. Try again!");
        }

        else {
            change = change - total;
            Change.setText("Your change is: " + String.valueOf(change));
        }
    }
}