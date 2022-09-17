package com.example.mobiledeise1.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mobiledeise1.R;

public class DisplayMessageActivity extends AppCompatActivity {

    public static int ID = 1234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra("login");

        TextView textView = findViewById(R.id.textView);
        textView.setText("Olá "+ message +" ,seja bem-vindo(a)!");

    }
}