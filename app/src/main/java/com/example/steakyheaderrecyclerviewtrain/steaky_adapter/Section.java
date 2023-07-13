package com.example.steakyheaderrecyclerviewtrain.steaky_adapter;

public interface Section {
    int HEADER = 0;
    int ITEM = 1;

    int type();

    public int sectionPosition();
}
