package com.example.chufaschin.mockupstallerizate.VersionAdministracion;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.chufaschin.mockupstallerizate.R;

public class BuscarMatricula extends Activity implements View.OnClickListener {

    private EditText matriculaEdit;
    private Button siguiente, find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_matricula);

        siguiente = (Button) findViewById(R.id.Siguientebtn);
        siguiente.setOnClickListener(this);
        find = (Button) findViewById(R.id.searchBtn);
        find.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        buscarMatricula();
    }

    public void buscarMatricula() {
        String userMatriculaStr;
        matriculaEdit = (EditText) findViewById(R.id.findMatricula);

        // Retrieve the text entered from the EditText
        userMatriculaStr = matriculaEdit.getText().toString().toUpperCase();

        // Force user to fill up the form
        if (userMatriculaStr.equals("")) {
            //VENTANA EMERGENTE RELLENAR CAMPOS VACIOS
            Toast.makeText(getApplicationContext(),
                    "Por favor introduzca una Matrícula",
                    Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(this,MatriculaExiste.class);
            intent.putExtra("matricula", userMatriculaStr);
            startActivity(intent);
        }}

    public void lanzarMatriculaExiste(View view) {
        Intent intent = new Intent(this, MatriculaExiste.class);
        startActivity(intent);
    }





}
