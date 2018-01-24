package com.example.fatima.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView t1 = findViewById(R.id.t1);
        Bundle b = getIntent().getExtras();
        String user = b.getString("username");
        String pass = b.getString("password");
        t1.setText("user: " + user + "\npassword: " + pass);
    }

    public void backk(View view) {

        Intent myint = new Intent(this, Main2Activity.class);
        startActivity(myint);
    }
}
