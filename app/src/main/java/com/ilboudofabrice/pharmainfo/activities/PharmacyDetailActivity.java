package com.ilboudofabrice.pharmainfo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ilboudofabrice.pharmainfo.R;
import com.ilboudofabrice.pharmainfo.model.Pharmacy;

/**
 * Created by fabrice on 2016-12-05.
 */

public class PharmacyDetailActivity extends AppCompatActivity {
    TextView txtName, txtAddress, txtPhone, txtCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy_detail);

        setWidgets();
        fillInfo();
    }

    private void fillInfo() {
        Intent intent = getIntent();
        Pharmacy pharmacy = (Pharmacy) intent.getSerializableExtra("Pharmacy");
        String name = txtName.getText().toString();
        txtName.setText(name + " " + pharmacy.getName());

        if (pharmacy.getAddress() != null)
        {
            String address = txtAddress.getText().toString();
            txtAddress.setText(address + " " + pharmacy.getAddress());
        }
        String phone = txtPhone.getText().toString();
        txtPhone.setText(phone + " " + pharmacy.getPhone());
        String city = txtCity.getText().toString();
        txtCity.setText(city + " " + pharmacy.getCity());
    }

    private void setWidgets() {
        txtName = (TextView) findViewById(R.id.txtName);
        txtPhone = (TextView) findViewById(R.id.txtPhone);
        txtAddress = (TextView) findViewById(R.id.txtAddress);
        txtCity = (TextView) findViewById(R.id.txtCity);
    }
}
