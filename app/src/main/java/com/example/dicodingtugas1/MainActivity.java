package com.example.dicodingtugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    String[] nama={"Hobby Boss 85519 Heavy Equipment Semi-Trailer M911 C-HET W-M747","Hobby Boss 80141 German Pz Kpfw.38 t Ausf.B","Hobby Boss 87216 UH-60A Blackhawk Helicopter","Hobby Boss 80225 Bf109 G-6 Early","Hobby Boss 80249 ME262A-1A","Hobby Boss 87215 UH-34A Choctaw","Hobby Boss 80211 SU-47 S-37 Berkut","Hobby Boss 82401 German Leopard 2 A4 Tank","Trumpeter 03909 Russian Su-27 Flanker B","Trumpeter 05767 German Cruiser Prinz Eugen 1945"};
    int[] harga={1206000,496000, 896000,570000,760000,446000,156000,506000,799000,856000};
    int[] image={R.drawable.img01,R.drawable.img02,R.drawable.img03,R.drawable.img04,R.drawable.img05,R.drawable.img06,R.drawable.img07,R.drawable.img08,R.drawable.img09,R.drawable.img10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv=  findViewById(R.id.myRecycler);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());

        MyAdapter adapter=new MyAdapter(this,nama,harga,image);
        rv.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
