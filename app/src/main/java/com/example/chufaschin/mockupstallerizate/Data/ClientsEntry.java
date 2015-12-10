package com.example.chufaschin.mockupstallerizate.Data;

import java.io.Serializable;

/**
 * Created by CHUFASCHIN on 04/03/2015.
 */
public class ClientsEntry implements Serializable {

//    private int id;
        //        public static final String COLUMN_ID = BaseColumns._ID;
    public static String TABLE_NAME = "clients";
    public static String DNI = "dni";
    public static String FK_PLATE = "plate"; //cogemos la matricula de coches
    public static String EMAIL = "email";
    public static String NAME = "name";
    public static int PHONE =0;
    public static String SURNAME="surname";

    public static String getDNI() {
        return DNI;
    }

    public static String getFkPlate() {
        return FK_PLATE;
    }

    public static String getEMAIL() {        return EMAIL;    }

    public static String getNAME() {
        return NAME;
    }

    public static int getPHONE() {
        return PHONE;
    }

    public static String getSURNAME() {
        return SURNAME;
    }

    @Override
        public String toString() {
            return "ClientsEntry{" +
                    "QUESTIONS='" + TABLE_NAME + '\'' +
                    ", DNI='" + DNI + '\'' +
                    ", FK_PLATE='" + FK_PLATE + '\'' +
                    ", NAME='" + NAME + '\'' +
                    ", PHONE='" + PHONE + '\'' +
                    ", SURNAME='" + SURNAME + '\'' +
                    '}';
        }

    public String getTableName() {
            return TABLE_NAME;
        }

    public void setDNI(String DNI) {   ClientsEntry.DNI = DNI;}
    public void setFkPlate(String FK_PLATE) {   ClientsEntry.FK_PLATE = FK_PLATE;}

    public void setEMAIL(String EMAIL) {   ClientsEntry.EMAIL = EMAIL;    }

    public void setNAME(String NAME) {   ClientsEntry.NAME = NAME;    }
    public void setPHONE(int PHONE) {   ClientsEntry.PHONE = PHONE;    }

    public void setSURNAME(String SURNAME) {   ClientsEntry.SURNAME = SURNAME;    }


    }


