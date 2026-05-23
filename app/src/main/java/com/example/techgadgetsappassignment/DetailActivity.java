package com.example.techgadgetsappassignment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private String gadgetUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleTextView = findViewById(R.id.tvDetailTitle);
        ImageView gadgetImageView = findViewById(R.id.ivGadgetImage);
        Button viewButton = findViewById(R.id.btnViewWebpage);

        Intent intent = getIntent();
        String title = intent.getStringExtra(MainActivity.EXTRA_TITLE);
        int imageResId = intent.getIntExtra(MainActivity.EXTRA_IMAGE_RES_ID, 0);
        gadgetUrl = intent.getStringExtra(MainActivity.EXTRA_URL);

        titleTextView.setText(title != null ? title : getString(R.string.app_name));
        if (imageResId != 0) {
            gadgetImageView.setImageResource(imageResId);
        }

        viewButton.setOnClickListener(v -> {
            if (gadgetUrl == null || gadgetUrl.trim().isEmpty()) {
                Toast.makeText(this, R.string.invalid_url, Toast.LENGTH_SHORT).show();
                return;
            }

            String normalizedUrl = gadgetUrl.trim();
            if (!normalizedUrl.startsWith("http://") && !normalizedUrl.startsWith("https://")) {
                normalizedUrl = "https://" + normalizedUrl;
            }

            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(normalizedUrl));
            Intent chooser = Intent.createChooser(browserIntent, getString(R.string.open_with));
            if (browserIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(chooser);
            } else {
                Toast.makeText(this, R.string.no_browser_found, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
