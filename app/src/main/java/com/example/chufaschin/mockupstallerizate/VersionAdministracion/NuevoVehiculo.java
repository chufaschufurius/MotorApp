package com.example.chufaschin.mockupstallerizate.VersionAdministracion;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

import com.example.chufaschin.mockupstallerizate.R;

public class NuevoVehiculo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_vehiculo);
    }
    public void lanzarDniExiste(View view){
        Intent intent= new Intent(this, DniExiste.class);
        startActivity(intent);
    }

    public void lanzarSeleccionarMarca(View view){
        Intent intent= new Intent(this, AdministracionSeleccionarMarca.class);
        startActivity(intent);
    }
}
