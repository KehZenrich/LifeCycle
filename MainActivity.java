package com.example.lifecyclekeh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Created!", Toast.LENGTH_SHORT).show();
    }
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Activity Started!", Toast.LENGTH_SHORT).show();
    }
    protected void onResume() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Activity Resumed!", Toast.LENGTH_SHORT).show();
    }
    protected void onPause() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Activity Paused!", Toast.LENGTH_SHORT).show();
    }
    protected void onStop() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Activity Stopped!", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Activity Destroyed!", Toast.LENGTH_SHORT).show();
    }
    protected void onRestart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Activity Restart!", Toast.LENGTH_SHORT).show();
    }

}