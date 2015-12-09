package com.example.chufaschin.mockupstallerizate.Data;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by CHUFASCHIN on 04/03/2015.
 */
public class CarsEntry implements Serializable {
    public static String TABLE_NAME = "CARS";
    public static int MOTOR_NUMBER = 0;
    public static String BRAND="brand";
    public static String MODEL = "model";
    public static String OWNER = "owner";
    public static String PLATE="plate";
    public static String TASK="task";

    @Override
    public String toString() {
        return "CarsEntry{" +
                "CURSOS='" + TABLE_NAME + '\'' +
                ", MOTOR_NUMBER='" + MOTOR_NUMBER + '\'' +
                ", BRAND='" + BRAND + '\'' +
                ", MODEL='" + MODEL + '\'' +
                ", OWNER='" + OWNER + '\'' +
                ", PLATE='" + PLATE + '\'' +
                ", TASK='" + TASK + '\'' +
                '}';
    }

    public int getMOTOR_NUMBER() {
        return MOTOR_NUMBER;
    }
    public void setMOTOR_NUMBER(int MOTOR_NUMBER) {
        CarsEntry.MOTOR_NUMBER = MOTOR_NUMBER;
    }

    public String getBRAND() {
        return BRAND;
    }
    public void setBRAND(String BRAND) { CarsEntry.BRAND = BRAND;}

    public String getMODEL() {
        return MODEL;
    }
    public void setMODEL(String MODEL) { CarsEntry.MODEL = MODEL;}

    public String getOWNER() {
        return OWNER;
    }
    public void setOWNER(String OWNER) { CarsEntry.OWNER = OWNER;}

    public String getPLATE() {
        return PLATE;
    }
    public void setPLATE(String PLATE) { CarsEntry.PLATE = PLATE;}

    public String getTASK() {
        return TASK;
    }
    public void setTASK(String TASK) { CarsEntry.TASK = TASK;}



    public String getTABLE_NAME() {
        return TABLE_NAME;
    }
    public void setTABLE_NAME(String TABLE_NAME) {
        CarsEntry.TABLE_NAME = TABLE_NAME;
    }
}