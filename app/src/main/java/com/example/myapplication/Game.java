/*Notes:
-finish() doesn't immediately terminate activity
-Create a player object*/

package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Game extends AppCompatActivity {
    Intent intent;
    String playerName1;
    String playerName2;
    Boolean firstPlayerTurn = true;
    Byte numberOfClicks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        intent = getIntent();
        playerName1 = intent.getStringExtra("name1");
        playerName2 = intent.getStringExtra("name2");
        // Capture the layout's TextView and set the string as its text
        /*TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        textView1.setText(message1);
        textView2.setText(message2);*/
    }

    public void determineWinner(String playerName){
        //if(firstPlayerTurn) {
            if ((((Button) findViewById(R.id.button1)).getText().toString() == playerName) && (((Button) findViewById(R.id.button2)).getText().toString() == playerName) && (((Button) findViewById(R.id.button3)).getText().toString() == playerName)) {
                Toast.makeText(this, playerName + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((((Button) findViewById(R.id.button1)).getText().toString() == playerName) && (((Button) findViewById(R.id.button4)).getText().toString() == playerName) && (((Button) findViewById(R.id.button7)).getText().toString() == playerName)) {
                Toast.makeText(this, playerName + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((((Button) findViewById(R.id.button1)).getText().toString() == playerName) && (((Button) findViewById(R.id.button5)).getText().toString() == playerName) && (((Button) findViewById(R.id.button9)).getText().toString() == playerName)) {
                Toast.makeText(this, playerName + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((((Button) findViewById(R.id.button4)).getText().toString() == playerName) && (((Button) findViewById(R.id.button5)).getText().toString() == playerName) && (((Button) findViewById(R.id.button6)).getText().toString() == playerName)) {
                Toast.makeText(this, playerName + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((((Button) findViewById(R.id.button7)).getText().toString() == playerName) && (((Button) findViewById(R.id.button5)).getText().toString() == playerName) && (((Button) findViewById(R.id.button3)).getText().toString() == playerName)) {
                Toast.makeText(this, playerName + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((((Button) findViewById(R.id.button7)).getText().toString() == playerName) && (((Button) findViewById(R.id.button8)).getText().toString() == playerName) && (((Button) findViewById(R.id.button9)).getText().toString() == playerName)) {
                Toast.makeText(this, playerName + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((((Button) findViewById(R.id.button2)).getText().toString() == playerName) && (((Button) findViewById(R.id.button5)).getText().toString() == playerName) && (((Button) findViewById(R.id.button8)).getText().toString() == playerName)) {
                Toast.makeText(this, playerName + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((((Button) findViewById(R.id.button3)).getText().toString() == playerName) && (((Button) findViewById(R.id.button6)).getText().toString() == playerName) && (((Button) findViewById(R.id.button9)).getText().toString() == playerName)) {
                Toast.makeText(this, playerName + " won", Toast.LENGTH_LONG).show();
                finish();
            }
            else if(numberOfClicks == 9) {
                Toast.makeText(this, "draw", Toast.LENGTH_LONG).show();
                finish();
            }

        //}
//        else if(!firstPlayerTurn) {
//            if ((((Button) findViewById(R.id.button1)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button2)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button3)).getText().toString() == playerName2)) {
//                Toast.makeText(this, playerName2 + " won", Toast.LENGTH_LONG).show();
//                finish();
//            } else if ((((Button) findViewById(R.id.button1)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button4)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button7)).getText().toString() == playerName2)) {
//                Toast.makeText(this, playerName2 + " won", Toast.LENGTH_LONG).show();
//                finish();
//            } else if ((((Button) findViewById(R.id.button1)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button5)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button9)).getText().toString() == playerName2)) {
//                Toast.makeText(this, playerName2 + " won", Toast.LENGTH_LONG).show();
//                finish();
//            } else if ((((Button) findViewById(R.id.button4)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button5)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button6)).getText().toString() == playerName2)) {
//                Toast.makeText(this, playerName2 + " won", Toast.LENGTH_LONG).show();
//                finish();
//            } else if ((((Button) findViewById(R.id.button7)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button5)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button3)).getText().toString() == playerName2)) {
//                Toast.makeText(this, playerName2 + " won", Toast.LENGTH_LONG).show();
//                finish();
//            } else if ((((Button) findViewById(R.id.button7)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button8)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button9)).getText().toString() == playerName2)) {
//                Toast.makeText(this, playerName2 + " won", Toast.LENGTH_LONG).show();
//                finish();
//            } else if ((((Button) findViewById(R.id.button2)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button5)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button8)).getText().toString() == playerName2)) {
//                Toast.makeText(this, playerName2 + " won", Toast.LENGTH_LONG).show();
//                finish();
//            } else if ((((Button) findViewById(R.id.button3)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button6)).getText().toString() == playerName2) && (((Button) findViewById(R.id.button9)).getText().toString() == playerName2)) {
//                Toast.makeText(this, playerName2 + " won", Toast.LENGTH_LONG).show();
//                finish();
//            }
//        }

    }

    public void click(View v){
        numberOfClicks++;
        if(firstPlayerTurn == true) {
            ((Button) v).setText(playerName1);
            determineWinner(playerName1);
            v.setEnabled(false);
            firstPlayerTurn = false;
            
        }
        else {
            ((Button) v).setText(playerName2);
            determineWinner(playerName2);
            v.setEnabled(false);
            firstPlayerTurn = true;
        }
    }
}