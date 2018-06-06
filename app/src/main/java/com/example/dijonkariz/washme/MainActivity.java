package com.example.dijonkariz.washme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LoginActivityStart(View view) {
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
    }

    public void SignInActivityStart(View view) {
        Intent intent2 = new Intent(this, SignInTwo.class);
        startActivity(intent2);
    }
}
