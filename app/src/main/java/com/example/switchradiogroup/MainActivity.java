package com.example.switchradiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch sw;
    Button btn;
    RadioButton ybtn;
    RadioButton gbtn;
    RadioButton rbtn;
    RadioButton bbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = (Switch) findViewById(R.id.switch1);
        btn = (Button) findViewById(R.id.button);
        ybtn = (RadioButton) findViewById(R.id.ybtn);
        gbtn = (RadioButton) findViewById(R.id.gbtn);
        rbtn = (RadioButton) findViewById(R.id.rbtn);
        bbtn = (RadioButton) findViewById(R.id.bbtn);
    }

    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
    public void go(View view) {
        if (bbtn.isChecked())
            setActivityBackgroundColor(Color.BLUE);
        else if (rbtn.isChecked())
            setActivityBackgroundColor(Color.RED);
        else if (ybtn.isChecked())
            setActivityBackgroundColor(Color.YELLOW);
        else
            setActivityBackgroundColor(Color.GREEN);
    }

    public void rbtnclick(View view) {
        if(sw.isChecked())
            setActivityBackgroundColor(Color.RED);
    }

    public void bbtnclick(View view) {
        if(sw.isChecked())
            setActivityBackgroundColor(Color.BLUE);
    }

    public void ybtnclick(View view) {
        if(sw.isChecked())
            setActivityBackgroundColor(Color.YELLOW);
    }

    public void gbtnclick(View view) {
        if(sw.isChecked())
            setActivityBackgroundColor(Color.GREEN);
    }
}
