package com.example.buttomnavigation.ui.Location;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LocationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Location fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}