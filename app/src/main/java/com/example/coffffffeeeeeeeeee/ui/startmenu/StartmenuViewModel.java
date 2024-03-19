package com.example.coffffffeeeeeeeeee.ui.startmenu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StartmenuViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public StartmenuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is startmenu fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}