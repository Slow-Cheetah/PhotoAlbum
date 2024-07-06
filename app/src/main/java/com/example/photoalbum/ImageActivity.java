package com.example.photoalbum;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ImageActivity extends AppCompatActivity {

    private ImageView imageIV;
    private Button nextBTN;
    private Button exitImageBTN;
    private int scoreIMG = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_image);

        imageIV = findViewById(R.id.imageIV);
        nextBTN = findViewById(R.id.nextBTN);
        exitImageBTN = findViewById(R.id.exitImageBTN);

        exitImageBTN.setOnClickListener(v -> {
            finish();
            Toast.makeText(this, "Приложение закрыто", Toast.LENGTH_SHORT).show();
        });

        imageIV.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.image0_img));

        nextBTN.setOnClickListener(v -> {
            //При весе изображения больше 2мб у меня вылетает эмулятор
            if (scoreIMG == 1) {
                imageIV.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.image2_img));
            }
            if (scoreIMG == 2) {
                imageIV.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.image3_img));
            }
            if (scoreIMG == 3) {
                imageIV.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.image4_img));
            }
            if (scoreIMG == 4) {
                imageIV.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.image5_img));
            }
            if (scoreIMG > 4) {Toast.makeText(this, "Все просмотрено", Toast.LENGTH_SHORT).show();
                Intent intentTwo = new Intent(this, EndActivity.class);
                startActivity(intentTwo);
            }
            scoreIMG++;
        });
    }
}