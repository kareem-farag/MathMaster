package com.example.mathmaster;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView timerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerView = findViewById(R.id.timerView);

        startTimer();

    }

    protected Integer[] getAnswers(Integer rightAnswer) {
        Integer[] randomNumbers = new Integer[4];

        Random random = new Random();
        randomNumbers[0] = rightAnswer;
        randomNumbers[1]= random.nextInt(21);
        randomNumbers[2]= random.nextInt(21);
        randomNumbers[3]= random.nextInt(21);

        List<Integer> result = Arrays.asList(randomNumbers);
        Collections.shuffle(result);
        result.toArray(randomNumbers);
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
