package com.ilboudofabrice.pharmainfo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.ilboudofabrice.pharmainfo.R;
import com.ilboudofabrice.pharmainfo.database.DatabaseAdapter;
import com.ilboudofabrice.pharmainfo.database.DatabaseUtil;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        setWidgets();
        createUpdateDB();
    }

    private void setWidgets() {
    }

    public void onShowAllPharmacies(View view){
        Intent myIntent = new Intent(MenuActivity.this, ListOfPharmaciesActivity.class);
        MenuActivity.this.startActivity(myIntent);
    }

    public void createUpdateDB(){
        DatabaseAdapter databaseAdapter = new DatabaseAdapter(getApplicationContext());
        databaseAdapter.openDatabase();
        if(databaseAdapter.getTotalOfPharmacies() == 0)
        {
            DatabaseUtil.initializeDB(getApplicationContext(), databaseAdapter);
        }
        databaseAdapter.closeDatabase();
    }
}
