package com.example.libor.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerXmen;
    Spinner spin2;
    TextView txtmessage;
    ImageButton xmenButton;
    ImageButton avengersButton;
    String msg, avg;
    public Integer xmenptr[] = {R.drawable.collosus,R.drawable.galgadot,R.drawable.gambit,R.drawable.wolverine};
    public Integer avengers[] = {R.drawable.spiderman,R.drawable.captain_america,R.drawable.thor,R.drawable.iron_man};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerXmen = (Spinner)findViewById(R.id.spinXmen);
        txtmessage = (TextView)findViewById(R.id.textMessage);
        xmenButton = (ImageButton) findViewById(R.id.imageXmen);

        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                avg = spinnerXmen.getItemAtPosition(position).toString();
                avengersButton.setImageResource(avengers[position]);
                txtmessage.setText(msg + "and" + avg + " were selected");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerXmen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                msg = spinnerXmen.getItemAtPosition(position).toString();


                xmenButton.setImageResource(xmenptr[position]);
                txtmessage.setText(msg + "and" + avg + " were selected");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
