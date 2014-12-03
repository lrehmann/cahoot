package com.example.lukerehmann.cahoot;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

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

public class MakeStudy extends Activity {
    public boolean onOptionsItemSelected(MenuItem item){

        int id=item.getItemId();
        if (id==R.id.MakeStudy){
            Intent intent = new Intent(this, MakeStudy.class);
            startActivity(intent);
            return true;

        }
        if (id==R.id.classadder){
            Intent intent = new Intent(this, ClassAdder.class);
            startActivity(intent);
            return true;

        }
        if (id==R.id.ClassList){
            Intent intent = new Intent(this, ClassList.class);
            startActivity(intent);
            return true;

        }
        if (id==R.id.Logout){
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public final static String alertstatus = "com.example.lukerehmann.cahoot.alertstatus";

    public void alertButton(View view){
        Intent intent = new Intent(this, ClassList.class);

        String message = String.valueOf("1");
        intent.putExtra(alertstatus, message);

        startActivity(intent);

    }


   // public void studycreatesuccess(View view) {

     //   Intent intent = new Intent(this, StudyCreateSuccess.class);
       // startActivity(intent);
   // }

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
