package com.quick.databindingstudy.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.quick.databindingstudy.BR;

/**
 * Created by wanghaiming on 2016/7/27.
 */
public class UUser extends BaseObservable {
    private String mFirstName;
    private String mLastName;
    private int mAge;

    public UUser(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }

    public UUser(String firstName, String lastName, int age) {
        mFirstName = firstName;
        mLastName = lastName;
        this.mAge = age;
    }


    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }


    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;

    }


    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        this.mAge = age;

    }


    public boolean isAdult(){
        return mAge >=18;
    }
    public String getDisplayName(){
        return mFirstName+" "+mLastName;
    }
}
