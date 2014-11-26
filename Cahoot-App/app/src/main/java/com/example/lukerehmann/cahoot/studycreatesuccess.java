package com.example.lukerehmann.cahoot;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

// Joyce Sakata


public class studycreatesuccess extends Activity {
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

    public void classstudies(View view) {

        Intent intent = new Intent(this, classlist.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studycreatesuccess);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.studycreatesuccess, menu);
        return true;
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
            View rootView = inflater.inflate(R.layout.fragment_studycreatesuccess, container, false);
            return rootView;
        }
    }
}
