package com.example.steakyheaderrecyclerviewtrain.steaky_adapter;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public abstract class StickyAdapter<SVH extends RecyclerView.ViewHolder,
        VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public List<Section> items = new ArrayList<>();

    public abstract int getHeaderPositionForItem(int itemPosition);
    public abstract void onBindHeaderViewHolder(SVH holder, int headerPosition);
    public abstract SVH onCreateHeaderViewHolder(ViewGroup parent);
}