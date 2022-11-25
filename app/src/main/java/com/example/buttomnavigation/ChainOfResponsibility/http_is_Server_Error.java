package com.example.buttomnavigation.ChainOfResponsibility;

import android.app.AlertDialog;
import android.content.DialogInterface;

public class http_is_Server_Error implements httpNum{

    private httpNum nextInHttp;


    @Override
    public void setNexthttp(httpNum nexthttp) {

        this.nextInHttp = nexthttp;

    }

    public void httpstate(Numbers request) {


        System.out.println(request.getResponse().code());
        if (request.getResponse().code() >= 200 && request.getResponse().code() < 300 && request.getResponse().code() != 204 ) {
            new AlertDialog.Builder(request.getContext())
                    .setTitle("Server error")
                    .setMessage("Sorry is my problem ")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).setNegativeButton("cancel",null).create()
                    .show();
        } else {
            nextInHttp.httpstate(request);
        }


    }

}
