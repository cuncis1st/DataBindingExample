package com.cuncisboss.databindingexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

public class User extends BaseObservable {
    public static ObservableField<String> name = new ObservableField<>();
    public static ObservableField<String> email = new ObservableField<>();

    public static ObservableField<String> getName() {
        return name;
    }

    public static ObservableField<String> getEmail() {
        return email;
    }
}
