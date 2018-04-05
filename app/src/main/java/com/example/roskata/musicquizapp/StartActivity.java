package com.example.roskata.musicquizapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    private EditText name;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void startQuiz(View view) {
        name = (EditText) findViewById(R.id.userName);
        int quizCategory = 0;

        EditText userName = (EditText) findViewById(R.id.userName);
        String strUserName = userName.getText().toString();
        if (TextUtils.isEmpty(strUserName)) {
            userName.setError("Please fill in Your name!");

        } else {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.putExtra("QUIZ_CATEGORY", quizCategory);
            startActivity(intent);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, Gravity.TOP,Gravity.TOP);
            toast.makeText(getApplicationContext(), "Hello "
                    + name.getText() + ", \nWelcome to the \nWorld of Music!", Toast.LENGTH_LONG).show();
        }

    }
}
