package com.example.day03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LaptopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);

        CardView firstCard = findViewById(R.id.cardlaptop);
        firstCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the click event for the first card
                navigateToDetailActivity(
                        R.drawable.asus_vivobook_15_a1504va,
                        "ASUS Vivobook 15 A1504VA",
                        "Processor : Intel® Core™ i7-1355U Processor 1.7 GHz,Display : 15.6-inch Touch screen FHD (1920 x 1080) 16:9 aspect ratio LED Backlit IPS-level Panel 60Hz refresh rate, 250nits, 45% NTSC color gamut, Anti-glare display, 84 ％(Screen-to-body ratio), Memory : 8GB DDR4 on board, 1x DDR4 SO-DIMM slot (Upgradable), Storage : 512GB M.2 NVMe™ PCIe® 3.0 SSD, Graphics : Intel® UHD Graphics, Battery : 42WHrs, 3S1P, 3-cell Li-ion, 45W AC Adapter.",
                        "Harga Rp 11.399.000",
                        "bagikan"
                );
            }
        });

        // Repeat the above process for other cards as needed.
        // For example, for the second card:
        CardView secondCard = findViewById(R.id.cardlaptop1);
        secondCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the click event for the second card
                navigateToDetailActivity(
                        R.drawable.asus_vivobook_14x_a1403za,
                        "ASUS Vivobook 14X A1403ZA",
                        " Processor : Intel® Core™ i5-12500H Processor 2.5 GHz (18M Cache, up to 4.5 GHz, 4P+8E cores),Display : 14.0-inch, 2.8K (2880 x 1800) OLED 16:10 aspect ratio, 0.2ms response time, 90Hz refresh rate, 600nits HDR peak brightness, 100% DCI-P3 color gamut, Glossy display, VESA CERTIFIED Display HDR True Black 600, SGS Eye Care Display, Memory : 16GB (8GB DDR4 on board + 8GB DDR4 SO-DIMM),Storage : 512GB M.2 NVMe™ PCIe® 3.0 SSD, Graphics : Intel Iris Xᵉ Graphics, Battery : 70WHrs, 3S1P, 3-cell Li-ion, 90W AC Adapter.",
                        "Harga Rp 19.813.000",
                        "bagikan"
                );
            }
        });
        CardView thirdCard = findViewById(R.id.cardlaptop2);
        thirdCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.asus_m415,
                        "ASUS M415",
                        "Processor : AMD Ryzen 3 3250U Processor 2.6 GHz (4M Cache; up to 3.5 GHz; 2 cores), Display :14.0″ (16:9) LED-backlit FHD (1920×1080) IPS, Anti-Glare, with 45% NTSC, Memory : 4GB DDR4 on board, Storage : 256GB M.2 NVMe™ PCIe® 3.0 SSD+HDD Housing for storage expansion, Graphics : AMD Radeon™ Graphics, Battery : 37WHrs, 2S1P, 2-cell Li-ion.",
                        "Harga Rp 9.835.000",
                        "bagikan"
                );
            }
        });

// Code untuk fourthCard
        CardView fourthCard = findViewById(R.id.cardlaptop3);
        fourthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.asus_laptop_m409da,
                        "ASUS Laptop M409DA",
                        " Processor AMD Ryzen, RAM 8 GB, OS windows 10, Layar ASUS Laptop M409DA biasanya berukuran 14 inci dengan resolusi HD atau Full HD (1366x768 piksel atau 1920x1080 piksel) yang memberikan tampilan yang tajam..",
                        "Harga Rp 7.499.000",
                        "bagikan"
                );
            }
        });

// Code untuk fifthCard
        CardView fifthCard = findViewById(R.id.cardlaptop4);
        fifthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.asus_vivobook_go_14_e1404fa,
                        "ASUS VivoBook Go 14 E1404FA",
                        "Processor AMD Ryzen, RAM 4 GB sampai 16 GB,Kapasitas penyimpanan juga bervariasi dari 128GB hingga 512GB atau lebih, bergantung pada model yang Anda pilih, ASUS VivoBook Go 14 E1404FA dilengkapi dengan layar 14 inci dengan resolusi HD atau Full HD, memberikan pengalaman visual yang jernih.",
                        "Harga Dari Rp 5.200.000 hingga Rp 16.189.000",
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