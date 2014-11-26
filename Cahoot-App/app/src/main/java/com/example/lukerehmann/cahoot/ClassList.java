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
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Mingjue Ni




public class ClassList extends Activity {


    // the string variable we use for sending messages with intents
    public final static String EXTRA_MESSAGE = "com.example.lukerehmann.cahoot.MESSAGE";

    // a list class type must be used when using a list view
    // list items are added to a list view programatically and not through xml
    List<Map<String, String>> courselist = new ArrayList<Map<String,String>>();

    public void selectClass(View view) {

        Intent intent = new Intent(this, ClassStudies.class);
        startActivity(intent);
    }

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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classlist);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }


        SharedPreferences storeduniversity = getSharedPreferences("universityfile",Activity.MODE_PRIVATE);
        String uni=storeduniversity.getString("university", "Select a University");

        TextView titleitem = (TextView) findViewById(R.id.top);
        titleitem.setText(uni);



        registerForContextMenu((ListView) findViewById(R.id.ClassListView));


        initList();

        // adapters are what we use to associate the list variable and its contents with the list view
        ListView courselistView = (ListView) findViewById(R.id.ClassListView);
        SimpleAdapter simpleAdpt = new SimpleAdapter(this, courselist, android.R.layout.simple_list_item_1, new String[] {"course"}, new int[] {android.R.id.text1});
        courselistView.setAdapter(simpleAdpt);

        // setOnItemClickListener tells the activity what to do when a list item is clicked on
        courselistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parentAdapter, View view, int position,
                                    long id) {
                openClassstudies(id);
            }
        });
    }

    // initList simply adds our team names to the list variable
    // in a real app, this would be where we query our database to retrieve the list of teams, but
    // for the sake of our demo, this hard-coded data is sufficient
    private void initList() {

        //get list of current classes and  add class to shared pref file
        SharedPreferences classlist = getSharedPreferences("classlist",Activity.MODE_PRIVATE);
        String allclasses=classlist.getString("classarray", "");

        for (String item : allclasses.split(";")) {
            courselist.add(createClass("course",item));
        }

    }

    // this method helps us minimize the amount of repeat calls we need to make in initList to place
    // a course name into out list
    private HashMap<String, String> createClass(String key, String name) {
        HashMap<String, String> course = new HashMap<String, String>();
        course.put(key, name);
        return course;
    }


    public void openClassstudies(long id) {
        Intent intent = new Intent(this, ClassStudies.class);
        String message = String.valueOf(id);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.classlist, menu);
        return true;
    }
/*
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

        else if (id == R.id.ClassStudies) {
            return true;
        }

        else if (id == R.id.Logout) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

*/
    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_classlist, container, false);
            return rootView;
        }
    }



}


