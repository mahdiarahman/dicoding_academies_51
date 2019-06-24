package com.example.dicodingtugas1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView ivgbr;
    TextView tvharga;
    TextView tvnama;
    private ItemClickListener itemClickListener;

    public MyHolder(View itemView) {
        super(itemView);

        tvnama = itemView.findViewById(R.id.tvnama);
        tvharga = itemView.findViewById(R.id.tvharga);
        ivgbr = itemView.findViewById(R.id.ivgbr);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;

    }
}
