package com.jikexueyuan.listviewexample;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

/**
 * Created by dej on 2016/9/30.
 */
public class ListCellData {

    private String label;

    public ListCellData(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
