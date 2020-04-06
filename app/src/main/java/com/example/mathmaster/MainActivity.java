package com.example.mathmaster;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView timerView;
    TextView textView;
    TextView textView1;
    TextView textView2;
    TextView textView3;

    TextView textView4;
    TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerView = findViewById(R.id.timerView);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        Integer[] answersArray = getAnswers(20);

        textView.setText(String.valueOf(answersArray[0]));
        textView1.setText(String.valueOf(answersArray[1]));
        textView2.setText(String.valueOf(answersArray[2]));
        textView3.setText(String.valueOf(answersArray[3]));

        startTimer();

    }

    public void checkAnswer(View view) {

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
