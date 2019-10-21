package com.example.zoinks;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView texter = (TextView)findViewById(R.id.textView);


        texter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                texter.setText("hacking.jpg");
                v.setBackgroundColor(Color.argb(200, 255, 0, 0));
                Toast.makeText(getApplicationContext(), "NSA has joined the chat", Toast.LENGTH_SHORT).show();
                Snackbar.make(v, "NSA wants to know your location. Allowing by default.", Snackbar.LENGTH_SHORT).show();

            }
        });
    }
}
