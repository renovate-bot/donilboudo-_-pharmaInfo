package com.ilboudofabrice.pharmainfo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.ilboudofabrice.pharmainfo.R;

public class MenuActivity extends AppCompatActivity {
    private ImageButton btnAllPharmacies, btnFindScheduledPharmacies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        setWidgets();
    }

    private void setWidgets() {
        btnAllPharmacies = (ImageButton) findViewById(R.id.btnPharmacies);
        btnFindScheduledPharmacies = (ImageButton) findViewById(R.id.btnFindScheduledPharmacies);
    }

    public void onShowAllPharmacies(View view){
//        Intent intent = new Intent();
//        intent.
    }

    public void createUpdateDB(){

    }
}
