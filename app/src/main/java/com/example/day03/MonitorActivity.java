package com.example.day03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MonitorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor2);

        CardView firstCard = findViewById(R.id.cardmonitor);
        firstCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the click event for the first card
                navigateToDetailActivity(
                        R.drawable.monitorsamsungs24,
                        "Monitor Samsung S24R350 24-inch",
                        "75Hz refresh rate, Slim and sleek design, Smooth game play with AMD FreeSync™ and Game Mode.",
                        "Harga Rp 4.290.000",
                        "bagikan"
                );
            }
        });

        // Repeat the above process for other cards as needed.
        // For example, for the second card:
        CardView secondCard = findViewById(R.id.cardmonitor2);
        secondCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the click event for the second card
                navigateToDetailActivity(
                        R.drawable.odyssey_g5_g55c_qhd_165hz_curved_gaming_monitor,
                        "Odyssey G5 G55C QHD 165Hz Curved Gaming Monitor",
                        "QHD and HDR10 come together for a crystal clear picture, The 165Hz refresh rate and 1ms response time(MPRT) make commands as quick as your reflexes, AMD FreeSync makes hyper-fast action look seamless.",
                        "Harga Rp 11.570.000",
                        "bagikan"
                );
            }
        });
        CardView thirdCard = findViewById(R.id.cardmonitor3);
        thirdCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.monitorsamsungc390,
                        "Samsung CF30",
                        "Incredibly slim design, Smooth game play with AMD Freesync, Viewing comfort with eye saver mode and flicker free.",
                        "Harga Rp 10.570.000",
                        "bagikan"
                );
            }
        });

// Code untuk fourthCard
        CardView fourthCard = findViewById(R.id.cardmonitor4);
        fourthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.monitorsamsungs80ua,
                        "Monitor Samsung Samsung S80UA 27-inch High Resolution Professional",
                        "Wider workspace and lifelike detail with UHD resolution, IPS panel preserves color vividness and clarity across every inch of the screen, USB type-C port to power, send data and display signals between devices.",
                        "Harga Dari Rp 8.145.000",
                        "bagikan"
                );
            }
        });

// Code untuk fifthCard
        CardView fifthCard = findViewById(R.id.cardmonitor5);
        fifthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.samsung_c32r500_32_inch_curved_monitor,
                        "Samsung C32R500 32-inch Curved Monitor ",
                        ".Comfortable and Immersive viewing experience with curved screen, Incredibly slim and stylish design with bezel-less screen U, Smooth game play with AMD FreeSync™ and Game Mode.",
                        "Harga Rp 5.737.500 ",
                        "bagikan"
                );
            }
        });

        // Continue for other cards...
    }

    private void navigateToDetailActivity(int imageResId, String title, String description, String price, String share) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("imageResId", imageResId);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("price", price);
        intent.putExtra("bagikan", share);
        startActivity(intent);
    }
}