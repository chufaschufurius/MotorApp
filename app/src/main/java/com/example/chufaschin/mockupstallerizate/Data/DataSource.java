package com.example.chufaschin.mockupstallerizate.Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.chufaschin.mockupstallerizate.SQLite.Ayudante;
import com.parse.ParseObject;

/**
 * Created by CHUFASCHIN on 29/01/2015.
 */
public class DataSource {
    private Context mContext;
    private Ayudante mSQLiteHelper ;
    boolean insertado = false;
    boolean borrado = false;
    boolean actualizado = false;
    public DataSource(Context context) {
        mContext = context;
        mSQLiteHelper = new Ayudante(mContext);

    }
    public SQLiteDatabase openReadable() {
        return mSQLiteHelper.getReadableDatabase();
    }
    public SQLiteDatabase openWriteable() {
        return mSQLiteHelper.getWritableDatabase();
    }
    public void close(SQLiteDatabase database) {
        database.close();
    }

//    public boolean insertCarsEntry(CarsEntry carsEntry) {
//        CarsEntry cars=carsEntry;
//        DataSource dataSource = null;
//        SQLiteDatabase database = dataSource.openWriteable();
//        database.beginTransaction();
//        ContentValues args = new ContentValues();
//
//        args.put(String.valueOf(CarsEntry.MOTOR_NUMBER), cars.getMOTOR_NUMBER());
//        args.put(CarsEntry.BRAND, cars.getBRAND());
//        args.put(CarsEntry.MODEL, cars.getMODEL());
//        args.put(CarsEntry.OWNER, cars.getOWNER());
//        args.put(CarsEntry.PLATE, cars.getPLATE());
//        args.put(CarsEntry.TASK, cars.getTASK());
//
//        database.insert(cars.getTABLE_NAME(), null, args);
//        database.setTransactionSuccessful();
//        database.endTransaction();
//        database.close();
//        return insertado=true;
//    }
//
//    public boolean insertClientsEntry(ClientsEntry clientsEntry) {
//        ClientsEntry clients= clientsEntry;
//        DataSource dataSource = null;
//        SQLiteDatabase database = dataSource.openWriteable();
//        database.beginTransaction();
//        ContentValues args = new ContentValues();
//
//        args.put(ClientsEntry.DNI, clients.getDNI());
//        args.put(ClientsEntry.FK_PLATE, clients.getFkPlate());
//        args.put(ClientsEntry.NAME, clients.getNAME());
//        args.put(String.valueOf(ClientsEntry.PHONE), clients.getPHONE());
//        args.put(ClientsEntry.SURNAME, clients.getSURNAME());
//        database.insert(clients.getTableName(), null, args);
//        database.setTransactionSuccessful();
//        database.endTransaction();
//        database.close();
//        return insertado=true;
//    }

    public void insertCars(){
        ParseObject cars= new ParseObject("cars");
        cars.put(String.valueOf(CarsEntry.MOTOR_NUMBER), CarsEntry.getMOTOR_NUMBER());
        cars.put(CarsEntry.BRAND, CarsEntry.getBRAND());
        cars.put(CarsEntry.MODEL, CarsEntry.getMODEL());
        cars.put(CarsEntry.OWNER, CarsEntry.getOWNER());
        cars.put(CarsEntry.PLATE, CarsEntry.getPLATE());
        cars.put(CarsEntry.TASK, CarsEntry.getTASK());

        cars.saveInBackground();
    }


}
