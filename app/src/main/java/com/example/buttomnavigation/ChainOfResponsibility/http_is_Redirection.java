package com.example.buttomnavigation.ChainOfResponsibility;

import android.app.AlertDialog;
import android.content.DialogInterface;

public class http_is_Redirection implements httpNum{

    private httpNum nextInHttp;

    @Override
    public void setNexthttp(httpNum nexthttp) {

        this.nextInHttp = nexthttp;

    }

    @Override
    public void httpstate(Numbers request) {


        System.out.println(request.getResponse().code());
        if (request.getResponse().code() >= 300 && request.getResponse().code() < 400) {
            System.out.println(request.getResponse().code());
            new AlertDialog.Builder(request.getContext())
                    .setTitle("Redirection")
                    .setMessage("Call for 0800-XXX-XXX")
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
