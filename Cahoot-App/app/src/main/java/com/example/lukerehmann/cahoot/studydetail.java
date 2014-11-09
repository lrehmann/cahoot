package com.example.lukerehmann.cahoot;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

// Luke Rehmann



/*

public void extendmap(View view){
    //resize the map fragment to the whole page
    //add resize button to reduce the map and call reducemap()

}

public void reducemap(View view){
    //reduce the size of the map
    //remove the button from the extended map view

}


public void checkin(){
    //add the user to the study group
    //pop-up notifying the user they have checked in

}



*/


public class studydetail extends Activity {

    public void alertButton(View view){
        new AlertDialog.Builder(this)
        .setTitle("Success!")
        .setMessage("You Successfully Checked In!")
        .setNeutralButton("OK", null)
        .show();
    }


    protected void showbox(View view) {
        //super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studydetail);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.studydetail, menu);
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


