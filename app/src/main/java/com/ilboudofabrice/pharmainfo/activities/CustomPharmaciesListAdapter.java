package com.ilboudofabrice.pharmainfo.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ilboudofabrice.pharmainfo.R;
import com.ilboudofabrice.pharmainfo.model.Pharmacy;

import java.util.List;

class CustomPharmaciesListAdapter extends BaseAdapter {
    private List<Pharmacy> data;
    private Context context;
    private static LayoutInflater inflater = null;

    CustomPharmaciesListAdapter(Activity activity, List<Pharmacy> data) {
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
    public View getView(final int position, final View convertView, ViewGroup parent) {
        final Pharmacy pharmacy = data.get(position);
        View rowView = inflater.inflate(R.layout.pharmacy_list_item, null);
        TextView name = (TextView) rowView.findViewById(R.id.pharmacyName);
        name.setText(pharmacy.getName());
        name.setTextSize(20);

        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PharmacyDetailActivity.class);
                intent.putExtra("Pharmacy", pharmacy);
                context.startActivity(intent);
            }
        });

        return rowView;
    }

} 