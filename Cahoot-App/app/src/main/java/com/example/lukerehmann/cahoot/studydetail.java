package com.example.lukerehmann.cahoot;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

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

/*
public class studydetail extends Activity {

    public void alertButton(View view){
        new AlertDialog.Builder(this)
        .setTitle("Success!")
        .setMessage("You Successfully Checked In!")
        .setNeutralButton("OK", null)
        .show();
    }
*/

public class studydetail extends Activity {




    protected void showbox(View view) {
        //super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studydetail);
//test this maybe works
        FragmentManager fm = getFragmentManager();
        dialog dialog = new dialog();
        dialog.setRetainInstance(true);
        dialog.show(fm, "fragment_name");


        getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();

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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_studydetail, container, false);
            return rootView;
        }
    }
}

