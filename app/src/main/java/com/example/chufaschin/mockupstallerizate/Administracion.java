package com.example.chufaschin.mockupstallerizate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.chufaschin.mockupstallerizate.VersionAdministracion.MenuAdministracion;
import com.example.chufaschin.mockupstallerizate.VersionAdministracion.NuevoVehiculo;

public class Administracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administracion);
    }
    public void lanzarNuevoCliente(View view){
        Intent intent= new Intent(this, NuevoCliente.class);
        startActivity(intent);
    }
    public void lanzarNuevoVehiculo(View view){
        Intent intent= new Intent(this, NuevoVehiculo.class);
        startActivity(intent);
    }
    public void lanzarAsignarTareas(View view){
        Intent intent= new Intent(this, MenuAdministracion.class);
        startActivity(intent);
    }
    public void lanzarCalendario(View view){
        Intent intent= new Intent(this, MenuAdministracion.class);
        startActivity(intent);
    }

    public void lanzarScroll(View view){
        Intent intent= new Intent(this, ListaTareasTaller.class);
        startActivity(intent);
    }


}
