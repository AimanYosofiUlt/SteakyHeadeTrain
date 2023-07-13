package com.example.steakyheaderrecyclerviewtrain.steaky_adapter;

public class SectionItem implements Section {

    private final int section;

    public SectionItem(int section) {
        this.section = section;
    }

    @Override
    public int type() {
        return ITEM;
    }

    @Override
    public int sectionPosition() {
        return section;
    }
}
