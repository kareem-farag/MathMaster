package com.example.mathmaster;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView timerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerView = findViewById(R.id.timerView);
        startTimer();
    /*
        Log.i("Random number :" , String.valueOf(generateRandomArray()[0]));
        Log.i("Random number :" , String.valueOf(generateRandomArray()[1]));
        Log.i("Random number :" , String.valueOf(generateRandomArray()[2]));
        Log.i("Random number :" , String.valueOf(generateRandomArray()[3]));
    */
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
    protected  void startTimer () {
        new CountDownTimer(10000,1000) {

            @Override
            public void onTick(long millisUntilFinished) {

                timerView.setText(String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                timerView.setText("finished");

            }
        }.start();
    }
}
