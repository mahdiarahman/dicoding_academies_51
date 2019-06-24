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
    TextView tvnama,tvharga,tvketisi;

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
        tvketisi = findViewById(R.id.tvketisi);

        ivgbr.setImageResource(image);
        tvnama.setText(name);
        tvharga.setText(String.format("Rp. %s", NumberFormat.getNumberInstance(Locale.US).format(harga)));
        tvketisi.setText(name + " merupakan model kit yang didesain fun dan playful. Terbuat dari material plastik serta cocok untuk usia 14 tahun keata. Diproduksi secara rapi dan mendetail, sehingga ideal dijadikan sebagai koleksi model kit Anda di rumah.");
    }
}
