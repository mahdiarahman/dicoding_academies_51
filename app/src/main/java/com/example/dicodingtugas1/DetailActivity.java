package com.example.dicodingtugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class DetailActivity extends AppCompatActivity {

    ImageView ivgbr;
    TextView tvnama,tvharga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent i=getIntent();
        final String name=i.getExtras().getString("nama");
        final int harga=i.getExtras().getInt("harga");
        final int image=i.getExtras().getInt("image");

        ivgbr = findViewById(R.id.ivgbr);
        tvnama = findViewById(R.id.tvnama);
        tvharga = findViewById(R.id.tvharga);

        ivgbr.setImageResource(image);
        tvnama.setText(name);
        tvharga.setText(String.format("Rp. %s", NumberFormat.getNumberInstance(Locale.US).format(harga)));
    }
}
