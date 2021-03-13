package com.example.it_202_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public CheckBox Mouse, Keyboard, Monitor, Headset, Ram;
    public EditText MouseQty, KeyboardQty, MonitorQty, HeadsetQty, RamQty, Cash;
    public TextView Total, Change;
    public Button plus_Mouse, minus_Mouse, plus_Keyboard, minus_Keyboard, plus_Monitor, minus_Monitor, plus_Headset, minus_Headset, plus_Ram, minus_Ram, pay;

    public final int MouseCost = 100, KeyboardCost = 200, MonitorCost = 4000, HeadsetCost = 1000, RamCost = 2000;
    public int mouseQty = 0, keyboardQty = 0, monitorQty = 0, headsetQty = 0, ramQty = 0, total = 0, cash = 0, change = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Checkbox
        Mouse = findViewById(R.id.inputMouse);
        Keyboard = findViewById(R.id.inputKeyboard);
        Monitor = findViewById(R.id.inputMonitor);
        Headset = findViewById(R.id.inputHeadset);
        Ram = findViewById(R.id.inputRam);

        //EditText
        MouseQty = findViewById(R.id.inputMouseQty);
        KeyboardQty = findViewById(R.id.inputKeyboardQty);
        MonitorQty = findViewById(R.id.inputMonitorQty);
        HeadsetQty = findViewById(R.id.inputHeadsetQty);
        RamQty = findViewById(R.id.inputRamQty);
        Cash = findViewById(R.id.inputCash);

        //Button plus
        plus_Mouse = findViewById(R.id.plusMouse);
        plus_Keyboard = findViewById(R.id.plusKeyboard);
        plus_Monitor = findViewById(R.id.plusMonitor);
        plus_Headset = findViewById(R.id.plusHeadset);
        plus_Ram = findViewById(R.id.plusRam);

        //Button minus
        minus_Mouse = findViewById(R.id.minusMouse);
        minus_Keyboard = findViewById(R.id.minusKeyboard);
        minus_Monitor = findViewById(R.id.minusMonitor);
        minus_Headset = findViewById(R.id.minusHeadset);
        minus_Ram = findViewById(R.id.minusRam);
        pay = findViewById(R.id.pay);

        //TextView
        Total = findViewById(R.id.outputTotal);
        Change = findViewById(R.id.outputChange);

        //Turn off by default
        MouseQty.setEnabled(false);
        KeyboardQty.setEnabled(false);
        MonitorQty.setEnabled(false);
        HeadsetQty.setEnabled(false);
        RamQty.setEnabled(false);
        Cash.setEnabled(false);
        pay.setEnabled(false);
        plus_Mouse.setEnabled(false);
        minus_Mouse.setEnabled(false);
        plus_Keyboard.setEnabled(false);
        minus_Keyboard.setEnabled(false);
        plus_Headset.setEnabled(false);
        minus_Headset.setEnabled(false);
        plus_Monitor.setEnabled(false);
        minus_Monitor.setEnabled(false);
        plus_Ram.setEnabled(false);
        minus_Ram.setEnabled(false);
        plus_Mouse.setVisibility(View.INVISIBLE);
        minus_Mouse.setVisibility(View.INVISIBLE);
        plus_Keyboard.setVisibility(View.INVISIBLE);
        minus_Keyboard.setVisibility(View.INVISIBLE);
        plus_Monitor.setVisibility(View.INVISIBLE);
        minus_Monitor.setVisibility(View.INVISIBLE);
        plus_Headset.setVisibility(View.INVISIBLE);
        minus_Headset.setVisibility(View.INVISIBLE);
        plus_Ram.setVisibility(View.INVISIBLE);
        minus_Ram.setVisibility(View.INVISIBLE);
    }

    public void BuyMouse(View view) {
        if(Mouse.isChecked() == true) {
            mouseQty = 1;
            MouseQty.setEnabled(true);
            plus_Mouse.setEnabled(true);
            minus_Mouse.setEnabled(true);
            plus_Mouse.setVisibility(View.VISIBLE);
            minus_Mouse.setVisibility(View.VISIBLE);
            MouseQty.setText(String.valueOf(mouseQty));
        }
        else {
            mouseQty = 0;
            MouseQty.setEnabled(false);
            plus_Mouse.setEnabled(false);
            minus_Mouse.setEnabled(false);
            plus_Mouse.setVisibility(View.INVISIBLE);
            minus_Mouse.setVisibility(View.INVISIBLE);
            MouseQty.setText("Quantity");
        }

    }

    public void BuyKeyboard(View view) {
        if(Keyboard.isChecked() == true) {
            keyboardQty = 1;
            KeyboardQty.setEnabled(true);
            plus_Keyboard.setEnabled(true);
            minus_Keyboard.setEnabled(true);
            plus_Keyboard.setVisibility(View.VISIBLE);
            minus_Keyboard.setVisibility(View.VISIBLE);
            KeyboardQty.setText(String.valueOf(keyboardQty));
        }
        else {
            keyboardQty = 0;
            KeyboardQty.setEnabled(false);
            plus_Keyboard.setEnabled(false);
            minus_Keyboard.setEnabled(false);
            plus_Keyboard.setVisibility(View.INVISIBLE);
            minus_Keyboard.setVisibility(View.INVISIBLE);
            KeyboardQty.setText("Quantity");
        }
    }

    public void BuyMonitor(View view) {
        if(Monitor.isChecked()==true) {
            monitorQty = 1;
            MonitorQty.setEnabled(true);
            plus_Monitor.setEnabled(true);
            minus_Monitor.setEnabled(true);
            plus_Monitor.setVisibility(View.VISIBLE);
            minus_Monitor.setVisibility(View.VISIBLE);
            MonitorQty.setText(String.valueOf(monitorQty));
        }
        else {
            monitorQty = 0;
            MonitorQty.setEnabled(false);
            plus_Monitor.setEnabled(false);
            minus_Monitor.setEnabled(false);
            plus_Monitor.setVisibility(View.INVISIBLE);
            minus_Monitor.setVisibility(View.INVISIBLE);
            MonitorQty.setText("Quantity");
        }
    }

    public void BuyHeadSet(View view) {
        if(Headset.isChecked()==true) {
            headsetQty = 1;
            HeadsetQty.setEnabled(true);
            plus_Headset.setEnabled(true);
            minus_Headset.setEnabled(true);
            plus_Headset.setVisibility(View.VISIBLE);
            minus_Headset.setVisibility(View.VISIBLE);
            HeadsetQty.setText(String.valueOf(headsetQty));
        }
        else {
            headsetQty = 0;
            HeadsetQty.setEnabled(false);
            plus_Headset.setEnabled(false);
            minus_Headset.setEnabled(false);
            plus_Headset.setVisibility(View.INVISIBLE);
            minus_Headset.setVisibility(View.INVISIBLE);
            HeadsetQty.setText("Quantity");
        }
    }

    public void BuyRam(View view) {
        if(Ram.isChecked()==true) {
            ramQty = 1;
            RamQty.setEnabled(true);
            plus_Ram.setEnabled(true);
            minus_Ram.setEnabled(true);
            plus_Ram.setVisibility(View.VISIBLE);
            minus_Ram.setVisibility(View.VISIBLE);
            RamQty.setText(String.valueOf(ramQty));
        }
        else {
            ramQty = 0;
            RamQty.setEnabled(false);
            plus_Ram.setEnabled(false);
            minus_Ram.setEnabled(false);
            plus_Ram.setVisibility(View.INVISIBLE);
            minus_Ram.setVisibility(View.INVISIBLE);
            RamQty.setText("Quantity");
        }
    }

    public void setPlus_Mouse(View view) {
        mouseQty+=1;
        MouseQty.setText(String.valueOf(mouseQty));
    }

    public void setMinus_Mouse(View view) {
        if(mouseQty > 1) {
            mouseQty-=1;
        }
        MouseQty.setText(String.valueOf(mouseQty));
    }

    public void setPlus_Keyboard(View view) {
        keyboardQty+=1;
        KeyboardQty.setText(String.valueOf(keyboardQty));
    }

    public void setMinus_Keyboard(View view) {
        if(keyboardQty > 1) {
            keyboardQty-=1;
        }
        KeyboardQty.setText(String.valueOf(keyboardQty));
    }

    public void setPlus_Headset(View view) {
        headsetQty+=1;
        HeadsetQty.setText(String.valueOf(headsetQty));
    }

    public void setMinus_Headset(View view) {
        if(headsetQty > 1) {
            headsetQty-=1;
        }
        HeadsetQty.setText(String.valueOf(headsetQty));
    }

    public void setPlus_Monitor(View view) {
        monitorQty+=1;
        MonitorQty.setText(String.valueOf(monitorQty));
    }

    public void setMinus_Monitor(View view) {
        if(monitorQty > 1) {
            monitorQty-=1;
        }
        MonitorQty.setText(String.valueOf(monitorQty));
    }

    public void setPlus_Ram(View view) {
        ramQty+=1;
        RamQty.setText(String.valueOf(ramQty));
    }

    public void setMinus_Ram(View view) {
        if(ramQty > 1) {
            ramQty-=1;
        }
        RamQty.setText(String.valueOf(ramQty));
    }

    public void calculate(View view) {
        mouseQty = mouseQty * MouseCost;
        keyboardQty = keyboardQty * KeyboardCost;
        monitorQty = monitorQty * MonitorCost;
        headsetQty = headsetQty * HeadsetCost;
        ramQty = ramQty * RamCost;
        total = mouseQty + keyboardQty + headsetQty + monitorQty + ramQty;
        Total.setText("Total: " + String.valueOf(total));
        pay.setEnabled(true);
        Cash.setEnabled(true);
    }

    public void pay(View view) {
        cash = Integer.parseInt(Cash.getText().toString());
        if(total <= cash) {
            change = cash - total;
            Change.setText("Change: " + String.valueOf(change));
        }
        else {
            Toast.makeText(this, "Your inputed cash is insufficient, please enter again!", Toast.LENGTH_LONG).show();
        }
    }
}