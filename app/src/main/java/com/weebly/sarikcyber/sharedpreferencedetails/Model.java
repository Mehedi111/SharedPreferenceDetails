package com.weebly.sarikcyber.sharedpreferencedetails;

import java.io.Serializable;

/**
 * Created by dustu on 11/28/2017.
 */

public class Model implements Serializable{

    private String userName;
    private String userAge;





    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
}
