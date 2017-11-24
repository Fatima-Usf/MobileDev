package com.example.fatima.firsttry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getage(View view) {

        //comme on veut recupérer l'année de naissance de user on doit déclarer l'id de l'input afin de pouvoir travailler avec par la suite
        EditText txt= findViewById(R.id.txt);
        int yearB = Integer.parseInt( txt.getText().toString());
        int age=2017-yearB;
        Toast.makeText(this, "your age is "+String.valueOf(age),Toast.LENGTH_LONG).show();
    }
}
