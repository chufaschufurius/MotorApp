package com.example.chufaschin.mockupstallerizate.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.chufaschin.mockupstallerizate.Data.CarsEntry;
import com.example.chufaschin.mockupstallerizate.Data.ClientsEntry;
import com.example.chufaschin.mockupstallerizate.Data.Contact;

/**
 * Created by CHUFASCHIN on 29/01/2015.
 */

public class Ayudante extends SQLiteOpenHelper {
    public Ayudante(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    static final String DATABASE_NAME = "MOTORAPP";
    static final int DATABASE_VERSION = 1;
    private static final String TAG = "";

    static final String CREATE_TABLE_CONTACT_CARS =
            "CREATE TABLE " + CarsEntry.TABLE_NAME + "( " +
                    CarsEntry.MOTOR_NUMBER + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                    CarsEntry.BRAND + "VARCHAR"+
                    CarsEntry.MODEL +"VARCHAR"+
                    CarsEntry.OWNER +"VARCHAR"+
                    CarsEntry.PLATE +"VARCHAR"+
                    CarsEntry.TASK +"VARCHAR);";

    static final String CREATE_TABLE_CONTACT_CLIENTS =
            "CREATE TABLE " + ClientsEntry.TABLE_NAME + "( " +
                    ClientsEntry.DNI + " VARCHAR PRIMARY KEY," +
                    ClientsEntry.FK_PLATE + " VARCHAR," +
                    ClientsEntry.NAME +"VARCHAR"+
                    ClientsEntry.PHONE +"INTEGER"+
                    ClientsEntry.SURNAME +"VARCHAR"+
                    "FOREIGN KEY("+ ClientsEntry.FK_PLATE+") REFERENCES "+ Contact.CarsEntry.TABLE_NAME+"("+Contact.CarsEntry.PLATE+")";

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(CREATE_TABLE_CONTACT_CARS);
            db.execSQL(CREATE_TABLE_CONTACT_CLIENTS);
        } catch (Exception e) {
            Log.e(TAG, "SQLException ", e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldOne, int newOne) {
        if (oldOne > 1 && newOne <= 0) {
        } else {
            db.execSQL("DROP TABLE IF EXISTS " + CREATE_TABLE_CONTACT_CARS);
            db.execSQL("DROP TABLE IF EXISTS " + CREATE_TABLE_CONTACT_CLIENTS);
            onCreate(db);
        }
    }
}
