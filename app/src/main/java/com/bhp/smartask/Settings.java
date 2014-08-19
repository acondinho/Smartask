package com.bhp.smartask;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Settings extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //Fill the spinners
        Spinner checkSpin = (Spinner) findViewById(R.id.checkTypeSpinner);
        Spinner themeSpin = (Spinner) findViewById(R.id.themeTypeSpinner);

        //Create array adapters
        ArrayAdapter<CharSequence> checkAdapt = ArrayAdapter.createFromResource(this,
                R.array.checkTypeArray, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> themeAdapt = ArrayAdapter.createFromResource(this,
                R.array.themeArray, android.R.layout.simple_spinner_item);

        //specify layout to use for array
        checkAdapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        themeAdapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Apply adapter to spinners
        checkSpin.setAdapter(checkAdapt);
        themeSpin.setAdapter(themeAdapt);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
