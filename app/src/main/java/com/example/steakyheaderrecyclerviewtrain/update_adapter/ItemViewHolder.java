package com.example.steakyheaderrecyclerviewtrain.update_adapter;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.steakyheaderrecyclerviewtrain.R;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    ItemViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text_view);
    }
}