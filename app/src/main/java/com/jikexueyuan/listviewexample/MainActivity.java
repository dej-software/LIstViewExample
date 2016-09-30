package com.jikexueyuan.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<ListCellData> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<ListCellData>(this, android.R.layout.simple_list_item_1);
        adapter.add(new ListCellData("Hello"));
        adapter.add(new ListCellData("Android"));
        adapter.add(new ListCellData("Jikexueyuan"));

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
