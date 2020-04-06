package com.example.mathmaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Random number :" , String.valueOf(generateRandomArray()[0]));
        Log.i("Random number :" , String.valueOf(generateRandomArray()[1]));
        Log.i("Random number :" , String.valueOf(generateRandomArray()[2]));
        Log.i("Random number :" , String.valueOf(generateRandomArray()[3]));

    }
    protected int[] generateRandomArray () {
        int[] randomNumbers = new int[4] ;
        Random random = new Random();
        randomNumbers[0]= random.nextInt(21);
        randomNumbers[1]= random.nextInt(21);
        randomNumbers[2]= random.nextInt(21);
        randomNumbers[3]= random.nextInt(21);

        return randomNumbers ;
    };
}
