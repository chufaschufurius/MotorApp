package com.example.chufaschin.mockupstallerizate.VersionAdministracion;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.chufaschin.mockupstallerizate.Data.DataSource;
import com.example.chufaschin.mockupstallerizate.R;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.example.chufaschin.mockupstallerizate.R.id.apellidoEditText;
import static com.example.chufaschin.mockupstallerizate.R.id.cocheEditText;
import static com.example.chufaschin.mockupstallerizate.R.id.matriculaEditText;
import static com.example.chufaschin.mockupstallerizate.R.id.emailEditText;
import static com.example.chufaschin.mockupstallerizate.R.id.nombreEditText;
import static com.example.chufaschin.mockupstallerizate.R.id.telefonoEditText;

public class MatriculaExiste extends Activity {
    private EditText matriculaEdit, nombreEdit, apellidoEdit, emailEdit, telefonoEdit, cocheEdit;
    private Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matricula_existe);

        Intent intent = getIntent();
        String matricula = intent.getStringExtra("matricula");
        extraerDatos(matricula);
    }

    public boolean extraerDatos(String matricula) {
        String userMatriculaStr;
        String userNombreStr;
        String userApellidosStr;
        String userEmailStr;
        String userTelefonoStr;
        String userCocheStr;

        nombreEdit = (EditText) findViewById(nombreEditText);
        apellidoEdit = (EditText) findViewById(apellidoEditText);
        emailEdit = (EditText) findViewById(emailEditText);
        telefonoEdit = (EditText) findViewById(telefonoEditText);
        cocheEdit = (EditText) findViewById(cocheEditText);
        matriculaEdit = (EditText) findViewById(matriculaEditText);

        userApellidosStr = apellidoEdit.getText().toString().toUpperCase();
        userCocheStr = cocheEdit.getText().toString().toUpperCase();
        userNombreStr = nombreEdit.getText().toString().toUpperCase();
        userEmailStr = emailEdit.getText().toString().toUpperCase();
        userTelefonoStr = telefonoEdit.getText().toString().toUpperCase();

        userMatriculaStr = matricula;
        matriculaEdit.setText(userMatriculaStr);

        if (userApellidosStr.equals("") && userCocheStr.equals("") && userNombreStr.equals("")
                && userEmailStr.equals("") && userTelefonoStr.equals("") && userMatriculaStr.equals("")) {
            //VENTANA EMERGENTE RELLENAR CAMPOS VACIOS
            Toast.makeText(getApplicationContext(),
                    "Por favor completa los campos vacios para el registro",
                    Toast.LENGTH_LONG).show();
            return false;
        }else{
            if (isEmailValid(userEmailStr)) {
                // Save new user data into Parse.com Data Storage
                DataSource dataSource = new DataSource(this);
                dataSource.insertClients();
                ParseUser user = new ParseUser();
                user.setUsername(userNombreStr);
                user.setPassword(userApellidosStr);
                user.setEmail(userEmailStr);
                user.setObjectId(userTelefonoStr);
                user.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(com.parse.ParseException e) {
                        if (e == null) {
                            // Show a simple Toast message upon successful registration
                            Toast.makeText(getApplicationContext(),
                                    "Nuevo cliente introducido",
                                    Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(getApplicationContext(),
                                    "Error en el registro, el nombre de usuario o el email ya están registrados.", Toast.LENGTH_LONG)
                                    .show();
                        }
                    }
                });
                return true;
            }
            return true;
        }
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

    public void buscarDni(View view) {
        Intent intent = new Intent(this, BuscarMatricula.class);
        startActivity(intent);
    }

    public void lanzarNuevoVehiculo(View view) {
        Intent intent = new Intent(this, NuevoVehiculo.class);
        startActivity(intent);
    }

    public void lanzarDniNoExiste(View view) {
        Intent intent = new Intent(this, DniNoExiste.class);
        startActivity(intent);
    }

}
