package com.ilboudofabrice.pharmainfo.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.ilboudofabrice.pharmainfo.model.Pharmacy;

import java.util.ArrayList;
import java.util.List;

import static com.ilboudofabrice.pharmainfo.database.DataBaseHelper.*;

/**
 * Created by fabrice on 2016-10-08.
 */
public class DatabaseAdapter {
    SQLiteDatabase database;
    DataBaseHelper dbHelper;
    Context context;

    public DatabaseAdapter(Context context) {
        this.context = context;
        dbHelper = new DataBaseHelper(context, "user", null, 1);
    }

    public void openDatabase() {
        database = dbHelper.getWritableDatabase();
    }

    public void closeDatabase() {
        database.close();
    }

    public void insertData(int id, String name, String address, String phone, String city) {
        ContentValues cv = new ContentValues();
        cv.put(COL_ID, id);
        cv.put(COL_NAME, name);
        cv.put(COL_ADDRESS, address);
        cv.put(COL_PHONE, phone);
        cv.put(COL_CITY, city);

        database.insert(TABLE_NAME, null, cv);
    }

    public List<Pharmacy> selectData() {
        List<Pharmacy> data = new ArrayList<>();
        String[] cols = {COL_ID, COL_NAME, COL_PHONE, COL_ADDRESS, COL_CITY};
        Cursor cursor = database.query(TABLE_NAME, cols, null, null, null, null, null);

        while (cursor.moveToNext()) {
            Pharmacy pharmacy = new Pharmacy();
            int index = cursor.getColumnIndex(COL_NAME);
            pharmacy.setName(cursor.getString(index));
            index = cursor.getColumnIndex(COL_PHONE);
            pharmacy.setPhone(cursor.getString(index));
            index = cursor.getColumnIndex(COL_ADDRESS);
            pharmacy.setAddress(cursor.getString(index));
            index = cursor.getColumnIndex(COL_CITY);
            pharmacy.setCity(cursor.getString(index));
            data.add(pharmacy);
            //builder.append(name).append("\n");
        }
        return data;

        //Toast.makeText(context, builder.toString(), Toast.LENGTH_LONG).show();
    }

    public int getTotalOfPharmacies(){
        String[] cols = {COL_ID};
        Cursor cursor = database.query(TABLE_NAME, cols, null, null, null, null, null);
        return cursor.getCount();
    }
}
