package com.example.roskata.musicquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int rightAnswerCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswer(View view) {


        RadioButton questionOneAnswerOne = (RadioButton) findViewById(R.id.questionOneAnswerOne);
        if (questionOneAnswerOne.isChecked()) {
            rightAnswerCount++;
        }

        CheckBox questionTwoAnswerOne = (CheckBox) findViewById(R.id.questionTwoAnswerOne);
        CheckBox questionTwoAnswerTwo = (CheckBox) findViewById(R.id.questionTwoAnswerTwo);
        CheckBox questionTwoAnswerThree = (CheckBox) findViewById(R.id.questionTwoAnswerThree);
        CheckBox questionTwoAnswerFour = (CheckBox) findViewById(R.id.questionTwoAnswerFour);
        if ( questionTwoAnswerTwo.isChecked() && questionTwoAnswerThree.isChecked() &&
                !questionTwoAnswerOne.isChecked() && !questionTwoAnswerFour.isChecked()) {
            rightAnswerCount++;
            rightAnswerCount++;
        } else if ( questionTwoAnswerTwo.isChecked() && !questionTwoAnswerThree.isChecked() &&
                questionTwoAnswerOne.isChecked() && !questionTwoAnswerFour.isChecked()) {
            rightAnswerCount++;
        } else if ( !questionTwoAnswerTwo.isChecked() && questionTwoAnswerThree.isChecked() &&
                !questionTwoAnswerOne.isChecked() && questionTwoAnswerFour.isChecked()) {
            rightAnswerCount++;
        } else if (questionTwoAnswerTwo.isChecked() && !questionTwoAnswerThree.isChecked() &&
                !questionTwoAnswerOne.isChecked() && !questionTwoAnswerFour.isChecked()) {
            Toast.makeText(getApplicationContext(), "You need to check at least two answers on Question Two", Toast.LENGTH_LONG).show();
            return;
        } else if (!questionTwoAnswerTwo.isChecked() && questionTwoAnswerThree.isChecked() &&
                !questionTwoAnswerOne.isChecked() && !questionTwoAnswerFour.isChecked()) {
            Toast.makeText(getApplicationContext(), "You need to check at least two answers on Question Two", Toast.LENGTH_LONG).show();
        } else if (!questionTwoAnswerTwo.isChecked() && !questionTwoAnswerThree.isChecked() &&
                questionTwoAnswerOne.isChecked() && !questionTwoAnswerFour.isChecked()) {
            Toast.makeText(getApplicationContext(), "You need to check at least two answers on Question Two", Toast.LENGTH_LONG).show();
        } else if (!questionTwoAnswerTwo.isChecked() && !questionTwoAnswerThree.isChecked() &&
                !questionTwoAnswerOne.isChecked() && questionTwoAnswerFour.isChecked()) {
            Toast.makeText(getApplicationContext(), "You need to check at least two answers on Question Two", Toast.LENGTH_LONG).show();
        }

        RadioButton questionThreeAnswerThree = (RadioButton) findViewById(R.id.questionThreeAnswerThree);
        if (questionThreeAnswerThree.isChecked()) {
            rightAnswerCount++;
        }

        RadioButton questionFourAnswerTwo = (RadioButton) findViewById(R.id.questionFourAnswerTwo);
        if (questionFourAnswerTwo.isChecked()) {
            rightAnswerCount++;
        }

        RadioButton questionFiveAnswerFour = (RadioButton) findViewById(R.id.questionFiveAnswerFour);
        if (questionFiveAnswerFour.isChecked()) {
            rightAnswerCount++;
        }

        RadioButton questionSixAnswerOne = (RadioButton) findViewById(R.id.questionSixAnswerOne);
        if (questionSixAnswerOne.isChecked()) {
            rightAnswerCount++;
        }

        Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
        intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
        startActivity(intent);

    }
}
