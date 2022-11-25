package com.example.buttomnavigation.ChainOfResponsibility;

public class http_is_Informational implements httpNum{

    private httpNum nextInHttp;

    @Override
    public void setNexthttp(httpNum nexthttp) {

        this.nextInHttp = nexthttp;

    }

    public void httpstate(Numbers request) {


        System.out.println(request.getResponse().code());
        if (request.getResponse().code() >= 100 && request.getResponse().code() < 200) {
            System.out.println(request.getResponse().code());
            System.out.println("OK");
        } else {
            nextInHttp.httpstate(request);
        }


    }
}
