package com.example.ertugrul.med.Modal;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by ERTUGRUL on 03.05.2018.
 */

public class MySQLiteHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME ="Med.db";
    private static final int DATABASE_VERSION =1;
    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
