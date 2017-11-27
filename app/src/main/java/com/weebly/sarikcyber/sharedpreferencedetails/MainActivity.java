package com.weebly.sarikcyber.sharedpreferencedetails;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText email, password,name, age;
    TextView show;
    Shared s;
    String n;
    String p;
    Model model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        name = findViewById(R.id.username);
        age = findViewById(R.id.age);
        show = findViewById(R.id.tv);
        model = new Model();

        s = new Shared(this);

    }

    public void saveData(View view) {
        String mail = email.getText().toString();
        String pass = password.getText().toString();
        String userName = name.getText().toString();
        String userAge = age.getText().toString();

        s.setData(mail, pass);
        model.setUserName(userName);
        model.setUserAge(userAge);

    }

    public void showData(View view) {

        n = s.getEmail();
        p = s.getPassword();


        show.setText(model.getUserName() + "\n" + n + "\n" + p + "\n" + model.getUserAge());
    }


    public void deleteData(View view) {
        s.clear();

    }

    public void jump(View view) {


        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("model",model);
        startActivity(i);
    }
}
