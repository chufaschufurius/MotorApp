package com.example.chufaschin.mockupstallerizate.VersionAdministracion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.chufaschin.mockupstallerizate.R;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.example.chufaschin.mockupstallerizate.R.id.apellidoEditText;
import static com.example.chufaschin.mockupstallerizate.R.id.cocheEditText;
import static com.example.chufaschin.mockupstallerizate.R.id.emailEditText;
import static com.example.chufaschin.mockupstallerizate.R.id.matricula;
import static com.example.chufaschin.mockupstallerizate.R.id.matriculaEditText;
import static com.example.chufaschin.mockupstallerizate.R.id.nombreEditText;
import static com.example.chufaschin.mockupstallerizate.R.id.telefonoEditText;

public class MatriculaExiste extends Activity {
    private EditText matriculaEdit, nombreEdit, apellidoEdit, emailEdit, telefonoEdit, cocheEdit;
    private String matricula, userNombreStr, userApellidosStr, userEmailStr, userTelefonoStr, userCocheStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matricula_existe);

        Intent intent = getIntent();
        matricula = intent.getStringExtra("matricula").toUpperCase();

        nombreEdit = (EditText) findViewById(nombreEditText);
        apellidoEdit = (EditText) findViewById(apellidoEditText);
        emailEdit = (EditText) findViewById(emailEditText);
        telefonoEdit = (EditText) findViewById(telefonoEditText);
        cocheEdit = (EditText) findViewById(cocheEditText);
        matriculaEdit = (EditText) findViewById(matriculaEditText);

        matriculaEdit.setText(matricula);
        extraerDatosCliente(matricula.toUpperCase());
    }

    public void onClick(View v) {
        userApellidosStr = apellidoEdit.getText().toString().toUpperCase();
        userCocheStr = cocheEdit.getText().toString().toUpperCase();
        userNombreStr = nombreEdit.getText().toString().toUpperCase();
        userEmailStr = emailEdit.getText().toString().toUpperCase();
        userTelefonoStr = telefonoEdit.getText().toString().toUpperCase();

        if (userCocheStr.equals("")) {
            if (userApellidosStr.equals("") || userNombreStr.equals("") || userEmailStr.equals("") && userTelefonoStr.equals("") && matriculaEdit.equals("")) {
                //VENTANA EMERGENTE RELLENAR CAMPOS VACIOS
                Toast.makeText(getApplicationContext(),
                        "Por favor completa los campos vacios",
                        Toast.LENGTH_LONG).show();
            } else {
                lanzarNuevoVehiculo(userNombreStr, userApellidosStr, userEmailStr, userTelefonoStr, matricula);
            }
        } else {
            //lanzar tarear a realizar
        }
    }

    public void extraerDatosCliente(final String matricula) {
        ParseQuery<ParseObject> query = ParseQuery.getQuery("clients");
        query.whereEqualTo("plate", matricula.toUpperCase());
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List objects, ParseException e) {
                if (e == null) {
                    int len = objects.size();
                    for (int i = 0; i < len; i++) {
                        ParseObject p = (ParseObject) objects.get(i);
                        String nombre = p.getString("name");
                        String apellido = p.getString("surname");
                        String email = p.getString("email");
                        String phone = p.getString("phone");
                        nombreEdit.setText(nombre);
                        apellidoEdit.setText(apellido);
                        emailEdit.setText(email);
                        telefonoEdit.setText(phone);
                        extraerDatosCoche(matricula);
                        /*if (apellidoEdit.equals("") && nombreEdit.equals("") && emailEdit.equals("") && telefonoEdit.equals("") && matricula.equals("")) {
                            //VENTANA EMERGENTE RELLENAR CAMPOS VACIOS
                            Toast.makeText(getApplicationContext(),
                                    "Por favor completa los campos vacios para el registro",
                                    Toast.LENGTH_LONG).show();
                        }*/
                    }
                } else {
                    Log.d("clients", "Error: " + e.getMessage());
                }
            }
        });
    }


    public void extraerDatosCoche(String matricula) {
        cocheEdit = (EditText) findViewById(cocheEditText);

        ParseQuery<ParseObject> query = ParseQuery.getQuery("cars");
        query.whereEqualTo("plate", matricula.toUpperCase());
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List objects, ParseException e) {
                if (e == null) {
                    int len = objects.size();
                    for (int i = 0; i < len; i++) {
                        ParseObject p = (ParseObject) objects.get(i);
                        String marca = p.getString("brand").toString();
                        String modelo = p.getString("model").toString();
                        cocheEdit.setText(marca + " " + modelo);
                    }
                } else {
                    Log.d("clients", "Error: " + e.getMessage());
                }
            }
        });
    }

    public static boolean isEmailValid(String email) {
        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

    public void lanzarNuevoVehiculo(String nombre, String apellido, String email, String phone, String matricula) {

        Intent intent = new Intent(MatriculaExiste.this, SeleccionarMarca.class);
        intent.putExtra("nombreC", nombre);
        intent.putExtra("apellidoC", apellido);
        intent.putExtra("emailC", email);
        intent.putExtra("phone", phone);
        intent.putExtra("matricula", matricula);
        startActivity(intent);

    }
}
