package com.vistasoftit.rashifal;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HomeActvity extends AppCompatActivity {

    String language;
    Button btnRashi,btnFindRashi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_actvity);
        language= PreferenceManager.getDefaultSharedPreferences(HomeActvity.this).getString("Language", null);

        btnRashi = (Button)findViewById(R.id.button);
        btnFindRashi = (Button)findViewById(R.id.button2);
        if (language.equals("বাংলা")){
            btnRashi.setText("রাশিসমূহ");
            btnFindRashi.setText("আপনার রাশি দেখুন");

        }else if (language.equals("English")) {
            btnRashi.setText("All Horoscopes");
            btnFindRashi.setText("Find Your Horoscope");
        }
        btnRashi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent theIntent = new Intent(HomeActvity.this, AllRasiList.class);
                startActivity(theIntent);
            }
        });
        btnFindRashi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent theIntent = new Intent(HomeActvity.this, MainActivity.class);
                startActivity(theIntent);
            }
        });
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
            Intent intent = new Intent(HomeActvity.this,AboutUs.class);
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }

}
