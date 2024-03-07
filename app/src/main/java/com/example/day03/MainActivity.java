package com.example.day03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageViewMonitor, imageViewPc, imageViewLaptop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imagemonitor = findViewById(R.id.imagemonitor);
        ImageView imagepc = findViewById(R.id.imagepc);
        ImageView imagelaptop = findViewById(R.id.imagelaptop);

        imagemonitor.setOnClickListener(this);
        imagepc.setOnClickListener(this);
        imagelaptop.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Intent intent;

        if (v.getId() == R.id.imagemonitor) {
            intent = new Intent(this, MonitorActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imagepc) {
            intent = new Intent(this, PcActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imagelaptop) {
            intent = new Intent(this, LaptopActivity.class);
            startActivity(intent);
        }
    }
}