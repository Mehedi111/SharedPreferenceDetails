package com.weebly.sarikcyber.sharedpreferencedetails;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.EditText;

/**
 * Created by dustu on 11/27/2017.
 */

public class Shared {

    public static final String SHARED_PREFERENCE= "data";
    public static final String EMAIL= "email";
    public static final String PASSWORD= "pass";
    public static final String DEFAULT= "NoT Set";

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    public Shared(Context context){
        this.context = context;
        this.sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCE,Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

    }


    public void setData(String email, String pass){
        editor.putString(EMAIL, email);
        editor.putString(PASSWORD, pass);
        editor.commit();

    }

    public String getEmail(){
        return sharedPreferences.getString(EMAIL,DEFAULT );
    }
    public String getPassword(){
        return sharedPreferences.getString(PASSWORD,DEFAULT );
    }
    public void clear(){
        editor.clear();
        editor.commit();
    }

}
