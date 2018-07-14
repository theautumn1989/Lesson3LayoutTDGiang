package com.example.tomato.lesson3layouttdgiang.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tomato.lesson3layouttdgiang.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnExercise1, btnExercise2, btnExercise3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();
    }

    private void initEvent() {
        btnExercise1.setOnClickListener(this);
        btnExercise2.setOnClickListener(this);
        btnExercise3.setOnClickListener(this);
    }

    private void initView() {
        btnExercise1 = findViewById(R.id.btn_exercise_1);
        btnExercise2 = findViewById(R.id.btn_exercise_2);
        btnExercise3 = findViewById(R.id.btn_exercise_3);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btn_exercise_1:
                intent = new Intent(MainActivity.this, ExerciseOneActivity.class);
                startActivity(intent);

                break;
            case R.id.btn_exercise_2:
                intent = new Intent(MainActivity.this, ExerciseTowActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_exercise_3:
                intent = new Intent(MainActivity.this, ExerciseThreeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}
