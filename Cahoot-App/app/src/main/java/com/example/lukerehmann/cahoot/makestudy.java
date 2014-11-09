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
    public boolean onOptionsItemSelected(MenuItem item){

        int id=item.getItemId();
        if (id==R.id.MakeStudy){
            Intent intent = new Intent(this, makestudy.class);
            startActivity(intent);
            return true;

        }
        if (id==R.id.classadder){
            Intent intent = new Intent(this, classadder.class);
            startActivity(intent);
            return true;

        }
        if (id==R.id.ClassList){
            Intent intent = new Intent(this, classlist.class);
            startActivity(intent);
            return true;

        }
        if (id==R.id.Logout){
            Intent intent = new Intent(this, login.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
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
