package com.example.lukerehmann.cahoot;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.view.MenuInflater


// Mingjue Ni - Class Addition Page (select your classes)


public class classadder extends Activity {

//public class classadder extends ActionBarActivity {}
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
    public void AddClasses(View view) {

        Intent intent = new Intent(this, classlist.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classadder);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        /* trying the code from the tutorial
        getMenuInflater().inflate(R.menu.classadder, menu);
                return true; */

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.classadder, menu);
        return super.onCreateOptionsMenu(menu);
    }

<<<<<<< HEAD
=======
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        int id = item.getItemId();
        if (id == R.id.action_settings) {
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
>>>>>>> FETCH_HEAD

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_classadder, container, false);
            return rootView;
        }
    }
}
