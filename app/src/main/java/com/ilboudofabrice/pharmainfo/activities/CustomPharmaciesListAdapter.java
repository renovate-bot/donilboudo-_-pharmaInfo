package com.ilboudofabrice.pharmainfo.activities;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ilboudofabrice.pharmainfo.R;
import com.ilboudofabrice.pharmainfo.model.Pharmacy;

import java.util.List;

public class CustomPharmaciesListAdapter extends BaseAdapter {
    private List<Pharmacy> data;
    private Context context;
    int[] imageId;
    private static LayoutInflater inflater = null;

    public CustomPharmaciesListAdapter(Activity activity, List<Pharmacy> data, int[] images) {
        // TODO Auto-generated constructor stub
        this.data = data;
        context = activity;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View rowView = inflater.inflate(R.layout.pharmacy_list_item, null);
        TextView name = (TextView) rowView.findViewById(R.id.pharmacyName);
        name.setText(data.get(position).getName());
        name.setTextSize(20);

//        TextView phone = (TextView) rowView.findViewById(R.id.pharmacyNumber);
//        phone.setText(data.get(position).getPhone());

        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You Clicked ", Toast.LENGTH_LONG).show();
            }
        });

        return rowView;
    }

} 