package com.example.steakyheaderrecyclerviewtrain;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.steakyheaderrecyclerviewtrain.steaky_adapter.StickyHeaderItemDecorator;
import com.example.steakyheaderrecyclerviewtrain.steaky_adapter.Section;
import com.example.steakyheaderrecyclerviewtrain.update_adapter.UpdateAdapter;
import com.example.steakyheaderrecyclerviewtrain.steaky_adapter.SectionHeader;
import com.example.steakyheaderrecyclerviewtrain.steaky_adapter.SectionItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        UpdateAdapter adapter = new UpdateAdapter();
        recyclerView.setAdapter(adapter);

        StickyHeaderItemDecorator decorator = new StickyHeaderItemDecorator(adapter);
        decorator.attachToRecyclerView(recyclerView);

        adapter.items = new ArrayList<Section>() {{
            int section = 0;
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    section = i;
                    add(new SectionHeader(section));
                } else {
                    add(new SectionItem(section));
                }
            }
        }};
        adapter.notifyDataSetChanged();
    }
}