package com.example.chufaschin.mockupstallerizate;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void lanzarAdministracion(View view){
        Intent intent= new Intent(this, Administracion.class);
        startActivity(intent);
    }

    public void lanzarTaller(View view){
        Intent intent= new Intent(this, Taller.class);
        startActivity(intent);
    }

}
