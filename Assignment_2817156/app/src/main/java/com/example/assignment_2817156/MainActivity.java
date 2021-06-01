package com.example.assignment_2817156;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Chetan Sharma",Toast.LENGTH_SHORT).show();
    }

    public void ll(View view) {
        Intent intent = new Intent(MainActivity.this, LinearActivity.class);
        startActivity(intent);
    }
    public void rl(View view) {
        Intent intent = new Intent(MainActivity.this, RelativeActivity.class);
        startActivity(intent);
    }
    public void gl(View view) {
        Intent intent = new Intent(MainActivity.this, GridActivity.class);
        startActivity(intent);
    }
}