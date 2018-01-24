package com.example.fatima.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void clichere(View view) {

        EditText e1 = findViewById(R.id.e1);
        EditText e = findViewById(R.id.e);

        /* pour passer d'une fentre a une autre je declare un objet de la classe intent
         et je lui donne en argument this ie cette fentre (dont je suis)
         et en 2em arg je me la fentre de destination*/

        Intent myint = new Intent(this, Main3Activity.class);


        Bundle b = new Bundle();
        // Bundle permet le passage du data d'une fentre a une autre
        b.putString("username", e1.getText().toString());
        b.putString("password", e.getText().toString());

        /*  on peut egalement faire le mm travaille avec une instance de intent
          myint.putExtra("username",e1.getText().toString());
          myint.putExtra("password",e2.getText().toString());*/


        myint.putExtras(b);
        startActivity(myint);
    }
}
