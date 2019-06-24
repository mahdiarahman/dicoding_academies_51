package com.example.dicodingtugas1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.NumberFormat;
import java.util.Locale;

public class MyAdapter extends RecyclerView.Adapter<MyHolder>{

    Context c;
    String[] nama;
    int[] harga;
    int[] images;

    public MyAdapter(Context ctx,String[] nama,int[] harga,int[] images)
    {
        this.c=ctx;
        this.nama=nama;
        this.harga=harga;
        this.images=images;
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);
        MyHolder holder=new MyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int pos) {

        holder.tvnama.setText(nama[pos]);
        holder.tvharga.setText(String.format("Rp. %s", NumberFormat.getNumberInstance(Locale.US).format(harga[pos])));
        holder.ivgbr.setImageResource(images[pos]);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {

                Intent i=new Intent(c,DetailActivity.class);
                i.putExtra("nama",nama[pos]);
                i.putExtra("harga",harga[pos]);
                i.putExtra("image",images[pos]);
                c.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return nama.length;
    }
}
