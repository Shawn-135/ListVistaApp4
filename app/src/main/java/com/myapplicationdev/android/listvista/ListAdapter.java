package com.myapplicationdev.android.listvista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<List> {

    private ArrayList<List> list;
    private Context context;
    private TextView tvTaskName, tvDate;

    public ListAdapter(Context context, int resource, ArrayList<List> objects) {
        super(context, resource, objects);
        // Store the list into this adapter
        list = objects;
        // Store Context object
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_row, parent, false);
        tvTaskName = (TextView) rowView.findViewById(R.id.tvTaskName);
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);

        List currentList = list.get(position);

        return rowView;

    }
}
