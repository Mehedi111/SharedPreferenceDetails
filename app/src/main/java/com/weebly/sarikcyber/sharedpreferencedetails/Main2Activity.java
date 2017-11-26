package com.weebly.sarikcyber.sharedpreferencedetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t;

    Shared s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t= findViewById(R.id.justshow);
        s = new Shared(this);

        t.setText(s.getEmail() +"\n"+ s.getPassword());
    }
}
