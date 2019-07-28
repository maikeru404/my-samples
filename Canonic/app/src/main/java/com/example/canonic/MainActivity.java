package com.example.canonic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
     public void butClick(View view){
        TextView textrest = (TextView) findViewById(R.id.textrest);
        Spinner carusel = (Spinner) findViewById(R.id.carusel);
        String selectitem = String.valueOf(carusel.getSelectedItem());
        textrest.setText(selectitem);
    }
}
