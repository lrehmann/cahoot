package com.example.lukerehmann.cahoot;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.view.MenuInflater;
import android.widget.EditText;
import android.widget.TextView;


// Mingjue Ni - Class Addition Page (select your classes)


public class ClassAdder extends Activity {

//public class classadder extends ActionBarActivity {}
public boolean onOptionsItemSelected(MenuItem item){

    int id=item.getItemId();
    if (id==R.id.MakeStudy){
        Intent intent = new Intent(this, MakeStudy.class);
        startActivity(intent);
        return true;

    }
    if (id==R.id.ClassAdder){
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
    public void addClasses(View view) {

        //get class name from    EditText - enterDescription
        EditText editText = (EditText) findViewById(R.id.enterDescription);
        String thisclass=editText.getText().toString();

        //get list of current classes and  add class to shared pref file
        SharedPreferences classlist = getSharedPreferences("classlist",Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor=classlist.edit();
        String allclasses=classlist.getString("classarray", "");
        editor.putString("classarray",allclasses+';'+thisclass);
        editor.apply();


        //empty out the box for adding another class
        EditText enterclass = (EditText) findViewById(R.id.enterDescription);
        enterclass.setText("");

    }



    public void ToClassList(View view) {

        Intent intent = new Intent(this, ClassList.class);
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
