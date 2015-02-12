package com.androidcollider.easyfin.database;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by pseverin on 22.12.14.
 */
public class DataSource {
    private final static String TAG = "Андроідний Коллайдер";
    private final static String APP_PREFERENCES = "EasyfinPref";

    private DbHelper dbHelper;
    private SQLiteDatabase db;
    private Context context;
    private SharedPreferences sPref;

    public DataSource(Context context) {
        this.context = context;
        dbHelper = new DbHelper(context);
        sPref = context.getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
    }

    //Open database
    public void openLocal() throws SQLException {
            db = dbHelper.getWritableDatabase();
    }

    //Close database
    public void closeLocal() {
            db.close();
    }
}
