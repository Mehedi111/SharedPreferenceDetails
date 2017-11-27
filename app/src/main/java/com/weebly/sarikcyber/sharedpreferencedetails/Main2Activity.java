package com.weebly.sarikcyber.sharedpreferencedetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class Main2Activity extends AppCompatActivity {

    TextView t;

    Shared s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t= findViewById(R.id.justshow);
        s = new Shared(this);

        Intent intent = getIntent();

        Model m = (Model) intent.getSerializableExtra("model");

        t.setText(m.getUserName()+"\n"+s.getEmail() +"\n"+ s.getPassword()+"\n"+m.getUserAge());
    }
}
