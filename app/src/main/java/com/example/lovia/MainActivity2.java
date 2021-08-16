package com.example.lovia;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void memoryButton(View view) {
        Intent intent = new Intent(MainActivity2.this, Pictures.class);
        startActivity(intent);
    }

    public void sendAMessage(View view) {
        Intent intent = new Intent(MainActivity2.this, Message.class);
        startActivity(intent);
    }
}