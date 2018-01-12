package com.dicee.fouliex.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button rollButton;
    private ImageView rightDice;
    private ImageView leftDice;

   final int[] diceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollButton = (Button) findViewById(R.id.rollButton);
        rightDice = (ImageView) findViewById(R.id.image_rightDice);
        leftDice = (ImageView) findViewById(R.id.image_leftDice);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "The button has been pressed");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);
                number = randomNumberGenerator.nextInt(6);
                leftDice.setImageResource(diceArray[number]);
                Log.d("Dicee", "The random number is: " + number);
            }
        });
    }


}