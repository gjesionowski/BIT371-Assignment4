package com.example.application4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){
    Log.i("INFO", "Attempting login.");
    Intent intent = new Intent(getApplicationContext(), UserConfirmationActivity.class);
        EditText username = findViewById(R.id.editTextTextPersonName);
        intent.putExtra("username", username.getText().toString());
        EditText password = findViewById(R.id.editTextTextPassword);
        intent.putExtra("password", password.getText().toString());
    startActivity(intent);
    }
}