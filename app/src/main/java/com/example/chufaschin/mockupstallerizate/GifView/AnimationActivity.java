package com.example.chufaschin.mockupstallerizate.GifView;

import android.app.Activity;
import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;

public class AnimationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InputStream stream = null;
        try {
            stream = getAssets().open("imagenpistones.gif");
        } catch (IOException e) {
            e.printStackTrace();
        }
        GifWebView view = new GifWebView(this, "file:///android_asset    /imagenpistones.gif");

        setContentView(view);
            }
}


