package com.example.buttomnavigation.Observer;

import android.widget.TextView;

import com.example.buttomnavigation.RegistTrashcan;


public class PlasticGarbage implements GarbageCan {
    TextView textView;
    public void Update(){

        textView.setText(RegistTrashcan.bottleStorage_String);
    }
    public void setTextView(TextView textView){
        this.textView = textView;
    }

}
