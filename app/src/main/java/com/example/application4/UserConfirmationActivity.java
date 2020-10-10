package com.example.application4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class UserConfirmationActivity extends AppCompatActivity {

    private String storedUsername = "Avdol";
    private String storedPassword = "MagiciansRed";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_confirmation2);
        TextView tv = findViewById(R.id.textView);
        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");

        Log.i("INFO", "Validating credentials");
        if (username.equals(storedUsername) && password.equals(storedPassword)) {
                tv.setText("Welcome " + username + "!");
                Log.i("INFO", "Login successful");}
        else
            tv.setText("Username/Password combination is wrong");
    }
}