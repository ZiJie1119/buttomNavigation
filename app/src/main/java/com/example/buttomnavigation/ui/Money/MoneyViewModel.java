package com.example.buttomnavigation.ui.Money;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MoneyViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MoneyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Money fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}