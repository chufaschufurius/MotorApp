package com.example.chufaschin.mockupstallerizate.VersionAdministracion;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.chufaschin.mockupstallerizate.R;
import com.koushikdutta.ion.Ion;
import com.parse.Parse;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ProgressBar progressBar = new ProgressBar(getApplicationContext());
        ImageView imageView = (ImageView) findViewById(R.id.imageSplash);
        Ion.with(imageView).load("http://2.bp.blogspot.com/-SBtthYnAjzE/U1eEF9upHSI/AAAAAAAABZ8/bo0pxhnvHOg/s1600/Imagen-animada-Motor-15.gif");
//        progressBar.setBackgroundColor("#FFEB3B");

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "rhJjlsANpxGikehq4WLxFR6KI6cQThGnnZy4x1Xo", "0eI1uNLoUIrX6FHVaN0IrSaQcgIjztVzCVYtXBiJ");
//        DataSource dataSource = new DataSource(this);
//        dataSource.insertCars();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(SplashScreen.this, IntroMatricula.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, 2000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
