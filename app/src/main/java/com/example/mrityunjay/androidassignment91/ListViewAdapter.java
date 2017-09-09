package com.example.mrityunjay.androidassignment91;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mrityunjay on 09-09-2017.
 */


class ListViewAdapter extends BaseAdapter {
    private Activity context;

    private ArrayList<String> title;


    ListViewAdapter(Activity context, ArrayList<String> title) {
        super();
        this.context = context;

        this.title = title;

    }

    @Override
    public int getCount() {
        return title.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    private class ViewHolder {

        TextView textViewTitle;

    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        LayoutInflater layoutInflater = context.getLayoutInflater();

        if (view == null) {
            view = layoutInflater.inflate(R.layout.row_layout, null);
            holder = new ViewHolder();

            holder.textViewTitle = (TextView) view.findViewById(R.id.text1);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.textViewTitle.setText(title.get(position));

        return view;
    }
}
 {
}
