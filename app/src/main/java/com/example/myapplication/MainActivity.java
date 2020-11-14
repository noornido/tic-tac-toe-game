package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   // static Boolean isOddClick = true;
    public void play(View view) {
        /*Button button = (Button) view;
        button.setEnabled(false);
        button.setText("Disabled");
        Log.d("disable fn", "Button is disabled");
        */
        /*Button button = findViewById(R.id.button);
        if(button == view) {
            button.setEnabled(false);
            button.setText("Disabled");
        }
        else {
            button = findViewById(R.id.button);
            button.setEnabled(false);
            button.setText("Disabled");
        }*/
        Intent intent = new Intent(this, Game.class);
        EditText playerName1 = (EditText) findViewById(R.id.text1);
        EditText playerName2 = (EditText) findViewById(R.id.text2);
        String text1 = playerName1.getText().toString();
        String text2 = playerName2.getText().toString();
        intent.putExtra("name1", text1);
        intent.putExtra("name2", text2);
        startActivity(intent);



    }
}
