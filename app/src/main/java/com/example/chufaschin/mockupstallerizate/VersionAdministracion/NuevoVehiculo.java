package com.example.chufaschin.mockupstallerizate.VersionAdministracion;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.chufaschin.mockupstallerizate.Data.CarsEntry;
import com.example.chufaschin.mockupstallerizate.Data.ClientsEntry;
import com.example.chufaschin.mockupstallerizate.Data.DataSource;
import com.example.chufaschin.mockupstallerizate.R;
import com.parse.Parse;

public class NuevoVehiculo extends Activity implements View.OnClickListener{
    private String marca, matricula, nombreC, apellidoC, emailC, phone, owner;
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

    @Override
    public void onClick(View v) {
        String cocheMatriculaStr = String.valueOf(matriculaEdit.getText()) ;
        String cocheMarcaStr = String.valueOf(marcaEdit.getText());
        String cocheModeloStr = String.valueOf(modeloEdit.getText());
        String cocheNumMotorStr = String.valueOf(numMotorEdit.getText());
        String cocheTrabajoStr = String.valueOf(trabajoEdit.getText());

        if (cocheMatriculaStr.equals("") || cocheMarcaStr.equals("") || cocheModeloStr.equals("") || cocheNumMotorStr.equals("") || cocheTrabajoStr.equals("")) {
            //VENTANA EMERGENTE RELLENAR CAMPOS VACIOS
            Toast.makeText(getApplicationContext(),
                    "Por favor completa los campos vacios",
                    Toast.LENGTH_LONG).show();
        } else {
            CarsEntry.setBRAND(cocheMarcaStr);
            CarsEntry.setMODEL(cocheModeloStr);
            CarsEntry.setMotorNumber(cocheNumMotorStr);
            CarsEntry.setPLATE(cocheMatriculaStr);
            CarsEntry.setTASK(cocheTrabajoStr);
            CarsEntry.setOWNER(owner);
            ClientsEntry.setFkPlate(matricula);
            ClientsEntry.setEMAIL(emailC);
            ClientsEntry.setNAME(nombreC);
            ClientsEntry.setSURNAME(apellidoC);
            ClientsEntry.setPHONE(phone);

            DataSource dataSource = new DataSource(this);
            dataSource.insertClients();
            dataSource.insertCars();
        }
    }

    public void recogerDatos() {

    }
}
