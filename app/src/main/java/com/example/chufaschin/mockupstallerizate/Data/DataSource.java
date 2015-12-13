package com.example.chufaschin.mockupstallerizate.Data;

import android.content.Context;

import com.parse.ParseObject;

/**
 * Created by CHUFASCHIN on 29/01/2015.
 */
public class DataSource {
    private Context mContext;


    public DataSource(Context context) {
        mContext = context;
    }

    public static void insertCars() {
        ParseObject cars = new ParseObject("cars");
        cars.put(CarsEntry.MOTOR_NUMBER, CarsEntry.getMotorNumber());
        cars.put(CarsEntry.BRAND, CarsEntry.getBRAND());
        cars.put(CarsEntry.MODEL, CarsEntry.getMODEL());
        cars.put(CarsEntry.OWNER, CarsEntry.getOWNER());
        cars.put(CarsEntry.PLATE, CarsEntry.getPLATE());
        cars.put(CarsEntry.TASK, CarsEntry.getTASK());
        cars.saveInBackground();
    }

    public static void insertClients() {
        ParseObject clients = new ParseObject("clients");
        clients.put(ClientsEntry.FK_PLATE, ClientsEntry.getFkPlate());
        clients.put(ClientsEntry.EMAIL, ClientsEntry.getEMAIL());
        clients.put(ClientsEntry.NAME, ClientsEntry.getNAME());
        clients.put(ClientsEntry.SURNAME, ClientsEntry.getSURNAME());
        clients.put(ClientsEntry.PHONE, ClientsEntry.getPHONE());
        clients.saveInBackground();
    }
}
