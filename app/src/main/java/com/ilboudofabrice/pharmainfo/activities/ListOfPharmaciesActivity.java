package com.ilboudofabrice.pharmainfo.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.ilboudofabrice.pharmainfo.R;
import com.ilboudofabrice.pharmainfo.database.DatabaseAdapter;
import com.ilboudofabrice.pharmainfo.model.Pharmacy;

import java.util.ArrayList;
import java.util.List;

public class ListOfPharmaciesActivity extends AppCompatActivity {
    private ListView lstPharmacies;
    private TextView lblPharmaciesCounter;
    DatabaseAdapter adapter;
    List<Pharmacy> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmcies);

        setWidgets();
        getDataFromDB();
        showPharmacies();
    }

    private void getDataFromDB() {
        adapter = new DatabaseAdapter(getApplicationContext());
        adapter.openDatabase();
        data = adapter.selectData();
        //adapter.closeDatabase();
    }

    private void showPharmacies() {
        int totalOfPharmacies = adapter.getTotalOfPharmacies();

        String text = lblPharmaciesCounter.getText().toString();
        text = text + " " + totalOfPharmacies;
        lblPharmaciesCounter.setText(text);

        //show on list view
        lstPharmacies.setAdapter(new CustomPharmaciesListAdapter(this, data, null));
    }

    private void setWidgets() {
        lblPharmaciesCounter = (TextView) findViewById(R.id.lblPharmaciesCounter);
        lstPharmacies = (ListView) findViewById(R.id.lstPharmacies);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
