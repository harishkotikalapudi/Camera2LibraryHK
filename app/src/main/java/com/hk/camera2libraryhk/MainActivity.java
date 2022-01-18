package com.hk.camera2libraryhk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hk.librarycamera2.Camera2Activity;

public class MainActivity extends AppCompatActivity {

    final static String URL = "https://apis-az-dev.vishwamcorp.com/v2/image_upload";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Setting Camera2Activity Activity data
        Intent intent = new Intent(MainActivity.this, Camera2Activity.class);
        // Passing URL to the Library Activity
        intent.putExtra("URL",URL);
        Button cameraButton = findViewById(R.id.camera_button);
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Setting Camera2Activity Activity from the Library LibraryCamera2
                startActivity(intent);
            }
        });

    }
}