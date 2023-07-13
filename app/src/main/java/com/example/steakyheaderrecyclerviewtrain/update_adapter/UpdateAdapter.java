package com.example.steakyheaderrecyclerviewtrain.update_adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.steakyheaderrecyclerviewtrain.R;
import com.example.steakyheaderrecyclerviewtrain.steaky_adapter.Section;
import com.example.steakyheaderrecyclerviewtrain.steaky_adapter.StickyAdapter;

public class UpdateAdapter extends StickyAdapter<RecyclerView.ViewHolder, RecyclerView.ViewHolder> {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (viewType == Section.HEADER)
            return new HeaderViewHolder(inflater.inflate(R.layout.recycler_view_header_item, parent, false));
        else
            return new ItemViewHolder(inflater.inflate(R.layout.recycler_view_item, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int type = items.get(position).type();
        int section = items.get(position).sectionPosition();
        if (type == Section.HEADER) {
            ((HeaderViewHolder) holder).textView.setText("Header " + section);
        } else if (type == Section.ITEM) {
            ((ItemViewHolder) holder).textView.setText("Item " + section);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).type();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getHeaderPositionForItem(int itemPosition) {
        return items.get(itemPosition).sectionPosition();
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder, int headerPosition) {
        ((HeaderViewHolder) holder).textView.setText("Header " + headerPosition);
    }

    @Override
    public RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup parent) {
        return createViewHolder(parent, Section.HEADER);
    }
}
