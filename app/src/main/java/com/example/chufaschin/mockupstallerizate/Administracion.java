package com.example.chufaschin.mockupstallerizate;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

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
        Intent intent= new Intent(this, Login.class);
        startActivity(intent);
    }
    public void lanzarCalendario(View view){
        Intent intent= new Intent(this, Login.class);
        startActivity(intent);
    }

    public void lanzarScroll(View view){
        Intent intent= new Intent(this, ListaTareasTaller.class);
        startActivity(intent);
    }


}
