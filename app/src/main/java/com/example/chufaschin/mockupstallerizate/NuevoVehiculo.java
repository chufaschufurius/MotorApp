package com.example.chufaschin.mockupstallerizate;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class NuevoVehiculo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_vehiculo);
    }
    public void lanzarAdministracion(View view){
        Intent intent= new Intent(this, Administracion.class);
        startActivity(intent);
    }
}
