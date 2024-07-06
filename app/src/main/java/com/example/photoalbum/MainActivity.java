package com.example.photoalbum;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button startBTN;
    private Button exitMainBTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        startBTN = findViewById(R.id.startBTN);
        exitMainBTN = findViewById(R.id.exitMainBTN);

        startBTN.setOnClickListener(v->{
            Intent intent = new Intent(this, ImageActivity.class);
            startActivity(intent);
        });

        exitMainBTN.setOnClickListener(v-> {
            finish();
            Toast.makeText(this, "Приложение закрыто", Toast.LENGTH_SHORT).show();
        });
    }
}