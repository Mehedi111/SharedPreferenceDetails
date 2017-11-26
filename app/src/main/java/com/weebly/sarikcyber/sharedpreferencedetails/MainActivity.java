package com.weebly.sarikcyber.sharedpreferencedetails;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    TextView show;
    Shared s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        show = findViewById(R.id.tv);

        s = new Shared(this);

    }

    public void saveData(View view) {
        String nameR = email.getText().toString();
        String pass = password.getText().toString();

        s.setData(nameR, pass);

    }

    public void showData(View view) {

        String n = s.getEmail();
        String p = s.getPassword();

        show.setText(n +"\n"+p);
    }

    public void deleteData(View view) {
        s.clear();

    }

    public void jump(View view) {


        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
    }
}
