package com.example.dell.githubintegration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "hiii", Toast.LENGTH_SHORT).show();
    }
}
