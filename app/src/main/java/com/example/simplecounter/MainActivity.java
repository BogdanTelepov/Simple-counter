package com.example.simplecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    TextView textView;
    Button countButton;
    Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        countButton = findViewById(R.id.count_button);
        resetButton = findViewById(R.id.reset_button);

    }

    protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt("string_count", count);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt("string_count");
    }

    @SuppressLint("DefaultLocale")
    public void onClick(View view) {
        TextView textView = findViewById(R.id.text_view);
        count++;
        textView.setText(String.format("%04d", count));
    }

    @SuppressLint("DefaultLocale")
    public void reset(View view) {
        TextView textView = findViewById(R.id.text_view);
        count = 0;
        textView.setText(String.format("%04d", count));
    }
}