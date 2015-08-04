package com.example.nandita.dataobjectpassing;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;

/**
 * Created by nandita on 8/3/2015.
 */
public class StudentObject implements Parcelable {

    String name = "";
    String email = "";
    String number = "";

    public StudentObject(){

    }

    public StudentObject(Parcel p){
        this.name = p.readString();
        this.email = p.readString();
        this.number = p.readString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(email);
        dest.writeString(number);

    }

    public static Creator<StudentObject> CREATOR = new Creator<StudentObject>() {
        @Override
        public StudentObject createFromParcel(Parcel source) {
            return new StudentObject(source);
        }

        @Override
        public StudentObject[] newArray(int size) {
            return new StudentObject[size];
        }
    } ;
}
