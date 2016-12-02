package com.ilboudofabrice.pharmainfo.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

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
        cv.put(DataBaseHelper.COL_ID, id);
        cv.put(DataBaseHelper.COL_NAME, name);
        cv.put(DataBaseHelper.COL_ADDRESS, address);
        cv.put(DataBaseHelper.COL_PHONE, phone);
        cv.put(DataBaseHelper.COL_CITY, city);

        database.insert(DataBaseHelper.TABLE_NAME, null, cv);
    }

    public List<String> selectData() {
        List<String> data = new ArrayList<>();
        String[] cols = {DataBaseHelper.COL_ID, DataBaseHelper.COL_NAME};
        Cursor cursor = database.query(DataBaseHelper.TABLE_NAME, cols, null, null, null, null, null);

        StringBuilder builder = new StringBuilder();
        while (cursor.moveToNext()) {
            int index = cursor.getColumnIndex(DataBaseHelper.COL_NAME);
            String name = cursor.getString(index);
            data.add(name);
            //builder.append(name).append("\n");
        }
        return data;

        //Toast.makeText(context, builder.toString(), Toast.LENGTH_LONG).show();
    }

    public int getTotalOfPharmacies(){
        String[] cols = {DataBaseHelper.COL_ID};
        Cursor cursor = database.query(DataBaseHelper.TABLE_NAME, cols, null, null, null, null, null);
        return cursor.getCount();
    }
}
