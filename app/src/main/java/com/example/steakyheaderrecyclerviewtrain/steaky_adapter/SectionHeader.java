package com.example.steakyheaderrecyclerviewtrain.steaky_adapter;

public class SectionHeader implements Section {

    private final int section;

    public SectionHeader(int section) {
        this.section = section;
    }

    @Override
    public int type() {
        return HEADER;
    }

    @Override
    public int sectionPosition() {
        return section;
    }
}
