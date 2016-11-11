package com.ilboudofabrice.pharmainfo.activities;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyCustomAdapter extends BaseAdapter implements ListAdapter {
    private List<String> list = new ArrayList<>();
    private Context context;
    private TextView listItemText;
    private ImageButton btnEdit, btnRemove;


    public MyCustomAdapter(Context context, List<String> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int pos) {
        return list.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        //just return 0 if your list items do not have an Id variable.
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            view = inflater.inflate(R.layout.itemlayout, null);
        }

        //Handle TextView and display string from your list
//        listItemText = (TextView) view.findViewById(R.id.item);
//        listItemText.setText(list.get(position));
//        listItemText.setFocusableInTouchMode(true);

        setListeners(view, position);

        return view;
    }

    private void setListeners(View view, final int position) {
//        btnRemove = (ImageButton) view.findViewById(R.id.btnRemove);
//        btnEdit = (ImageButton)view.findViewById(R.id.btnEdit);
//
//        btnRemove.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                list.remove(position);
//                notifyDataSetChanged();
//            }
//        });
//
//        btnEdit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                listItemText.setFocusable(true);
//                btnEdit.setBackground(Drawable.createFromPath("@drawable/ic_save_black"));
//            }
//        });


    }
}