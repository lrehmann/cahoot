package com.example.lukerehmann.cahoot;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


// Mingjue Ni



public class University extends Activity {
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
    //public final static String EXTRA_MESSAGE = "com.example.lukerehmann.cahoot.MESSAGE"


    public void UniversitySelected(View view) {

        SharedPreferences storeduniversity = getSharedPreferences("universityfile",Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor=storeduniversity.edit();

        EditText editText = (EditText) findViewById(R.id.enterDescription);
        String uni=editText.getText().toString();

        editor.putString("university",uni);
        editor.apply();


        


        Intent intent = new Intent(this, ClassAdder.class);
        //String message = String.valueOf(id.UniversitySelect);
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.university, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_university, container, false);
            return rootView;
        }
    }
}
