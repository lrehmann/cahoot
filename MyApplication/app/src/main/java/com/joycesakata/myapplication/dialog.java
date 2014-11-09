package com.joycesakata.myapplication;


import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class dialog extends DialogFragment implements View.OnClickListener {
   Button dialogBoxOk;
   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.dialog,null);
        dialogBoxOk= (Button) view.findViewById(R.id.dialogBox);
        dialogBoxOk.setOnClickListener(this);

       return view;
   }
    
    public void onClick(View view){
        if(view.getId()==R.id.dialogBox) {

                    dismiss();

        }
    }
}