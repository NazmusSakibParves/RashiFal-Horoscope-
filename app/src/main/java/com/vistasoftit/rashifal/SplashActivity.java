package com.vistasoftit.rashifal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;


/**
 * Created by Taslima on 3/18/2016.
 */
public class SplashActivity extends Activity {
    String lan = "বাংলা";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



    }
    public void english(View view){
        lan = "English";
        Intent theIntent = new Intent(SplashActivity.this, HomeActvity.class);
        PreferenceManager.getDefaultSharedPreferences(SplashActivity.this).edit().putString("Language", lan).commit();
        startActivity(theIntent);
    }
    public void bangla(View view){
        lan = "বাংলা";
        Intent theIntent = new Intent(SplashActivity.this, HomeActvity.class);
        PreferenceManager.getDefaultSharedPreferences(SplashActivity.this).edit().putString("Language", lan).commit();
        startActivity(theIntent);
    }
}
