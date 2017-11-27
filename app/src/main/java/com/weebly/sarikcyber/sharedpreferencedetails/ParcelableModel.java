package com.weebly.sarikcyber.sharedpreferencedetails;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by dustu on 11/28/2017.
 */

public class ParcelableModel implements Parcelable {
    protected ParcelableModel(Parcel in) {
    }

    public static final Creator<ParcelableModel> CREATOR = new Creator<ParcelableModel>() {
        @Override
        public ParcelableModel createFromParcel(Parcel in) {
            return new ParcelableModel(in);
        }

        @Override
        public ParcelableModel[] newArray(int size) {
            return new ParcelableModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
