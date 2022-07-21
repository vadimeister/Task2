package com.starishko.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String APP_PREFERENCES = "Settings";
    SharedPreferences pref;

    @SuppressLint("WrongConstant")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int countStart = 0;
        pref = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE);
        countStart = pref.getInt(APP_PREFERENCES, 1);

        if (countStart == 3) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "It's third cold start", Toast.LENGTH_SHORT);
            toast.show();
        }
        countStart++;
        SharedPreferences.Editor edit = pref.edit();
        edit.putInt(APP_PREFERENCES, countStart).apply();


    }
}