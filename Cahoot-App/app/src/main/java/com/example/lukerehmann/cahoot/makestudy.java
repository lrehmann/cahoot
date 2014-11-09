package com.example.lukerehmann.cahoot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.text.format.Time;

// Joyce Sakata

//Get GPS Location
    /* public void getgps (){
        get the gps location & autofill the "location"
        text edit with coordinates
    }
     */

//Create Study Group
    /* public void create_study{
        Send the study info to the server
        Send the user to the study list activity
    }
    */

public class makestudy extends Activity {

    public void studycreatesuccess(View view) {

        Intent intent = new Intent(this, studycreatesuccess.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makestudy);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.makestudy, menu);
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

        else if (id == R.id.classadder) {
            return true;
        }

        else if (id == R.id.ClassList) {
            return true;
        }

        else if (id == R.id.ClassStudies) {
            return true;
        }

        else if (id == R.id.Logout) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


//change the time to the current time if button is selected
    public void buttonTimeFill(View view) {
//grab the edit text view
        EditText time = (EditText) findViewById(R.id.enterTime);
//if the button is selected, show the current time
        if(view.getId() == R.id.buttonTime) {
            Time today = new Time(Time.getCurrentTimezone());
            today.setToNow();

            time.setText(today.format("%k:%M"));

        }


    }


}
