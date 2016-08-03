package com.example.matthewhogg.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(21);
    }

    public void checkGuess(View view){
        EditText guessedNumber = (EditText) findViewById(R.id.guessNumber);
        if(guessedNumber.length() == 0) {

            Toast.makeText(getApplicationContext(), "Enter a Number DipShit", Toast.LENGTH_LONG).show();
        }else {
            String guessegNumberString = guessedNumber.getText().toString();
            int guessedNumberInt = Integer.parseInt(guessegNumberString);

            System.out.println(guessedNumberInt);

            String message = "";

            if (guessedNumberInt > randomNumber) {
                message = "Too high!";
            } else if (guessedNumberInt < randomNumber) {
                message = "Too Low!";
            } else {
                message = "You motherfucking got it!, Lets do this shit again!";
                Random randomGenerator = new Random();
                randomNumber = randomGenerator.nextInt(21);
            }


            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
        }
    }
}
