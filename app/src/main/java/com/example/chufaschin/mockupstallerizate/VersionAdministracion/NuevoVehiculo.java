package com.example.chufaschin.mockupstallerizate.VersionAdministracion;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

import com.example.chufaschin.mockupstallerizate.R;

public class NuevoVehiculo extends Activity {
    private String marca, matricula, nombreC, apellidoC, emailC, phone,cocheMatriculaStr, cocheMarcaStr, cocheModeloStr, cocheNumMotorStr, cocheTrabajoStr ;
    private EditText matriculaEdit, marcaEdit, modeloEdit, numMotorEdit, trabajoEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_vehiculo);

        Intent intent = getIntent();
        matricula = intent.getStringExtra("matricula");
        nombreC = intent.getStringExtra("nombreC");
        apellidoC = intent.getStringExtra("apellidoC");
        emailC = intent.getStringExtra("emailC");
        phone = intent.getStringExtra("phone");
        marca = intent.getStringExtra("marca");

        matriculaEdit = (EditText) findViewById(R.id.matriculaEditText);
        marcaEdit = (EditText) findViewById(R.id.marcaEdittText);
        modeloEdit = (EditText) findViewById(R.id.modeloEditText);
        numMotorEdit = (EditText) findViewById(R.id.numMotorEditText);
        trabajoEdit = (EditText) findViewById(R.id.trabajoEditText);

        matriculaEdit.setText(matricula);
        marcaEdit.setText(marca);
    }

    public void recogerDatos(){
        cocheMatriculaStr = matriculaEdit.getText().toString().toUpperCase();
        cocheMarcaStr = marcaEdit.getText().toString().toUpperCase();
        cocheModeloStr = modeloEdit.getText().toString().toUpperCase();
        cocheNumMotorStr = numMotorEdit.getText().toString().toUpperCase();
        cocheTrabajoStr = trabajoEdit.getText().toString().toUpperCase();
    }
}
