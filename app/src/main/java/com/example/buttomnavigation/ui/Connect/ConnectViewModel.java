package com.example.buttomnavigation.ui.Connect;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConnectViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ConnectViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Connect fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}