package com.example.chufaschin.mockupstallerizate.VersionAdministracion;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.chufaschin.mockupstallerizate.R;

public class SeleccionarMarca extends Activity {
    private String marca, matricula, nombreC, apellidoC, emailC, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administracion_seleccionar_marca);

        Intent intent = getIntent();
        matricula = intent.getStringExtra("matricula");
        nombreC = intent.getStringExtra("nombreC");
        apellidoC = intent.getStringExtra("apellidoC");
        emailC = intent.getStringExtra("emailC");
        phone = intent.getStringExtra("phone");

    }

    public void onClick(View view) {
        Button button = (Button) view;
        //Usamos el texto del botón para asignar el nombre de la marca del coche
        marca = button.getText().toString();
        Toast.makeText(getApplicationContext(),
                marca + matricula,
                Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, NuevoVehiculo.class);
        intent.putExtra("nombreC", nombreC);
        intent.putExtra("apellidoC", apellidoC);
        intent.putExtra("emailC", emailC);
        intent.putExtra("phone", phone);
        intent.putExtra("matricula", matricula);
        intent.putExtra("marca", marca);
        startActivity(intent);
    }
}
