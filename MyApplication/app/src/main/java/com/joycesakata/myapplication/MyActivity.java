package com.joycesakata.myapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showDialog(View view){
        FragmentManager manager=getFragmentManager();
        dialog dialog=new dialog();
        dialog.show(manager,"MyDialog");
    }
}
