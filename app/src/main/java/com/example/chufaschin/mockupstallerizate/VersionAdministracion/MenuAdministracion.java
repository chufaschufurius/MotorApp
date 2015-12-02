package com.example.chufaschin.mockupstallerizate.VersionAdministracion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.chufaschin.mockupstallerizate.ListaTareasTaller;
import com.example.chufaschin.mockupstallerizate.R;
import com.example.chufaschin.mockupstallerizate.VersionAdministracion.BuscarDni;

public class MenuAdministracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_administracion);
    }
    public void lanzarNuevo(View view){
        Intent intent= new Intent(this, BuscarDni.class);
        startActivity(intent);
    }

    public void lanzarTareas(View view){
        Intent intent= new Intent(this, ListaTareasTaller.class);
        startActivity(intent);
    }

}
