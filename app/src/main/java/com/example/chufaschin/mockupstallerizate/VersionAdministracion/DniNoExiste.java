package com.example.chufaschin.mockupstallerizate.VersionAdministracion;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

import com.example.chufaschin.mockupstallerizate.R;

public class DniNoExiste extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dni_no_existe);
    }
    public void lanzarBuscarDni(View view){
        Intent intent= new Intent(this, IntroMatricula.class);
        startActivity(intent);
    }

    public void lanzarNuevoVehiculo(View view){
        Intent intent= new Intent(this, NuevoVehiculo.class);
        startActivity(intent);
    }

    public void lanzarDatosCliente(View view){
        Intent intent= new Intent(this, MatriculaExiste.class);
        startActivity(intent);
    }
}
