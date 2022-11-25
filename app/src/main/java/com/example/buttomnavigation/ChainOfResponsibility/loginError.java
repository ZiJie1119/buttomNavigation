package com.example.buttomnavigation.ChainOfResponsibility;

import android.view.View;

import com.example.buttomnavigation.LoginActivity;


public class loginError implements httpNum{
    LoginActivity loginActivity = new LoginActivity();


    private httpNum nextInHttp;





    @Override
    public void setNexthttp(httpNum nexthttp) {

        this.nextInHttp = nexthttp;

    }






    public void httpstate(Numbers request) {


        System.out.println(request.getResponse().code());
        if (request.getResponse().code() == 204 ) {
            System.out.println("ERROR");

            request.getTextView().setVisibility(View.VISIBLE);



        } else {
            nextInHttp.httpstate(request);
        }


    }




}
