package com.example.lukerehmann.cahoot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

// Luke Rehmann

/*


public void loadclasses(View view){

    // load up the clickable xml button for each class the user is a part of


}

public void loadclass(View view,classid){

    Intent intent = new intent(this, studydetails.class);
    startActivity(intent,classid);

}


 */



public class classstudies extends Activity {

    private void initList(){
        courselist.add("Course 1: SI 543");
        courselist.add("Course 2: SI 582");
        courselist.add("Course 3: SI 622");
    }

    List<String> courselist = new ArrayList<String>();
    public void StudyDetails(View view) {

        Intent intent = new Intent(this, StudyDetails.class);
        startActivity(intent);
    }

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
    public void MakeStudy(View view) {

        Intent intent = new Intent(this, makestudy.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classstudies);
        /* for now
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        */

        initList();

        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(classlist.EXTRA_MESSAGE);

        int id = (int) Long.parseLong(message);

        // Create the text view
        //TextView textView = new TextView(this);
        //textView.setTextSize(35);
        //textView.setText(courselist.get(id));

        //setContentView(textView);


        TextView textView = (TextView) findViewById(R.id.top);
        textView.setText(courselist.get(id));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.classstudies, menu);
        return true;
    }



    /**
     * A placeholder fragment containing a simple view.
     */


   /* not using the fragment at the time.
    public static class PlaceholderFragment extends Fragment {


        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_classstudies, container, false);
            return rootView;
        }
    } */
}
