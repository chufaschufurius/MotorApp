package com.example.chufaschin.mockupstallerizate;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.example.chufaschin.mockupstallerizate.GifView.AnimationActivity;
import com.example.chufaschin.mockupstallerizate.GifView.GifDecoder;
import com.example.chufaschin.mockupstallerizate.GifView.GifDecoderView;
import com.example.chufaschin.mockupstallerizate.GifView.GifMovieView;
import com.example.chufaschin.mockupstallerizate.GifView.GifWebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressBar progressBar=new ProgressBar(getApplicationContext());

//        progressBar.setBackgroundColor("#FFEB3B");
//        public void sendMessage(View view) {
//            Intent intent = new Intent(this, Login.class);
//        }
//        GifWebView view = new GifWebView(this, "file:///android_asset"+"imagenpistones.gif");
//        WebView wView = new WebView(this);
//        wView.loadUrl("file:///android_asset" +
//                "imagenpistones.gif");
//        setContentView(view);
//        AnimationActivity animationActivity= new AnimationActivity();
//        GifDecoder gifDecoder=new GifDecoder();
//        GifDecoderView gifDecoderView=new GifDecoderView(getApplication(),animationActivity);
//        GifMovieView gifMovieView= new GifMovieView(getApplication(),null);
//        GifWebView gifWebView= new GifWebView(getApplication(), getPackageCodePath());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void lanzarLogin(View view){
        Intent intent= new Intent(this, Login.class);
        startActivity(intent);
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
