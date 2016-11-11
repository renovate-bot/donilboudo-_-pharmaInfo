package com.ilboudofabrice.pharmainfo.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by fabrice on 2016-10-08.
 */
class DataBaseHelper extends SQLiteOpenHelper {
    private String dbName;
    private int dbVersion;

    static final String TABLE_NAME = "pharmacies";
    static final String COL_ID = "_id";
    static final String COL_NAME = "name";
    static final String COL_ADDRESS = "address";
    static final String COL_PHONE = "phone";
    static final String COL_CITY = "city";

    private static final String tableDDL = "create table " + TABLE_NAME +
            "(" + COL_ID + " INTEGER primary key, " + COL_NAME + " TEXT, " + COL_ADDRESS + " TEXT, " +
            COL_PHONE + " TEXT, " + COL_CITY + " TEXT);";

    DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.dbName = name;
        this.dbVersion = version;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tableDDL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
