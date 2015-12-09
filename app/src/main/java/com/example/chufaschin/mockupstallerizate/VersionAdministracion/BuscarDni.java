package com.example.chufaschin.mockupstallerizate.VersionAdministracion;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

import com.example.chufaschin.mockupstallerizate.R;

public class BuscarDni extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_dni);
    }
    public void lanzarMenu(View view){
        Intent intent= new Intent(this, MenuAdministracion.class);
        startActivity(intent);
    }
    public void lanzarDniExiste(View view){
        Intent intent= new Intent(this, DniExiste.class);
        startActivity(intent);
    }
    public void lanzarDniNoExiste(View view){
        Intent intent= new Intent(this, DniNoExiste.class);
        startActivity(intent);
    }
}
