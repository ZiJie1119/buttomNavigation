package com.example.buttomnavigation.ChainOfResponsibility;

import android.content.Intent;

import com.example.buttomnavigation.RegistTrashcan;


public class http_is_Successful  implements httpNum{

    private httpNum nextInHttp;





    @Override
    public void setNexthttp(httpNum nexthttp) {

        this.nextInHttp = nexthttp;

    }






    public void httpstate(Numbers request) {


        System.out.println(request.getResponse().code());
        if (request.getResponse().code() >= 200 && request.getResponse().code() < 300 && request.getResponse().code() != 204 ) {
            System.out.println("OK");
            Intent intent = new Intent(request.getContext().getApplicationContext(), RegistTrashcan.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            request.getContext().getApplicationContext().startActivity(intent);
        } else {
            nextInHttp.httpstate(request);
        }


    }


}

