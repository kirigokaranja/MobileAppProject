package com.example.dijonkariz.washme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignInTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_two);
    }

    public void ContinueSignIn(View view) {
        Intent intent2 = new Intent(this, SignIn.class);
        startActivity(intent2);
    }

    public void LoginActivityStart(View view) {
        Intent intent2 = new Intent(this, LogIn.class);
        startActivity(intent2);
    }
}
